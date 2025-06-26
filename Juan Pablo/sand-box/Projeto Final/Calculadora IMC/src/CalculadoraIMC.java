import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class CalculadoraIMC {

    private static void exportarParaCSV(String nome, String peso, String altura, String resultado) {
        try (FileWriter writer = new FileWriter("imc_resultados.csv", true)) {
            writer.write(String.join(",", nome, peso, altura, resultado) + "\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exportar CSV.");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de IMC");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        JTextField nomeField = new JTextField();
        JTextField pesoField = new JTextField();
        JTextField alturaField = new JTextField();
        JLabel resultadoLabel = new JLabel("");

        frame.add(new JLabel("Nome:"));
        frame.add(nomeField);
        frame.add(new JLabel("Peso (kg):"));
        frame.add(pesoField);
        frame.add(new JLabel("Altura (m):"));
        frame.add(alturaField);

        JButton calcularBtn = new JButton("Calcular IMC");

        calcularBtn.addActionListener(_ -> {
            try {
                String nome = nomeField.getText();
                String peso = pesoField.getText();
                String altura = alturaField.getText();

                double pesoNum = Double.parseDouble(peso);
                double alturaNum = Double.parseDouble(altura);
                double imc = pesoNum / (alturaNum * alturaNum);

                String status = (imc < 18.5) ? "Abaixo do peso"
                              : (imc < 25) ? "Peso normal"
                              : (imc < 30) ? "Sobrepeso"
                              : "Obesidade";

                String resultado = String.format("%.2f (%s)", imc, status);
                resultadoLabel.setText(resultado);

                exportarParaCSV(nome, peso, altura, resultado);

                JOptionPane.showMessageDialog(frame, "Exportado com sucesso!");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Erro: insira valores válidos de peso e altura.");
            }
        });

        frame.add(calcularBtn);
        frame.add(new JLabel(""));
        frame.add(new JLabel("Resultado:"));
        frame.add(resultadoLabel);

        frame.setVisible(true);
    }
}
