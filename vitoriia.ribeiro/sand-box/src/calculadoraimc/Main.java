import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main {
    private static HistoricoIMC historico = new HistoricoIMC();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de IMC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTextField nomeField = new JTextField();
        JTextField pesoField = new JTextField();
        JTextField alturaField = new JTextField();
        JCheckBox infantilCheck = new JCheckBox("É criança?");

        JButton calcularButton = new JButton("Calcular IMC");
        JButton exportarButton = new JButton("Exportar CSV");
        JLabel resultadoLabel = new JLabel("");

        calcularButton.addActionListener((ActionEvent e) -> {
            String nome = nomeField.getText();
            String pesoStr = pesoField.getText();
            String alturaStr = alturaField.getText();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Nome obrigatório!");
                return;
            }

            double peso, altura;
            try {
                peso = Double.parseDouble(pesoStr);
                altura = Double.parseDouble(alturaStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Peso e altura devem ser números!");
                return;
            }

            Pessoa p;
            if (infantilCheck.isSelected()) {
                p = new RegistroImcInfantil(nome, peso, altura);
            } else {
                p = new RegistroImc(nome, peso, altura);
            }

            historico.adicionar(p);
            resultadoLabel.setText("IMC: " + String.format("%.2f", p.calcularIMC()) + " (" + p.getTipo() + ")");
        });

        exportarButton.addActionListener((ActionEvent e) -> {
            ExportadorCSV.exportar("historico.csv", historico.getRegistros());
            JOptionPane.showMessageDialog(frame, "Histórico exportado para historico.csv!");
        });

        frame.setLayout(new GridLayout(7, 1));
        frame.add(new JLabel("Nome:"));
        frame.add(nomeField);
        frame.add(new JLabel("Peso (kg):"));
        frame.add(pesoField);
        frame.add(new JLabel("Altura (m):"));
        frame.add(alturaField);
        frame.add(infantilCheck);
        frame.add(calcularButton);
        frame.add(exportarButton);
        frame.add(resultadoLabel);

        frame.setVisible(true);
    
    }
}
