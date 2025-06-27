package view;

import controller.IMCController;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import model.RegistroIMC;
import model.contract.IIMCController;

public class JanelaPrincipal extends JFrame {

    private JTextField txtNome = new JTextField(20);
    private JTextField txtPeso = new JTextField(5);
    private JTextField txtAltura = new JTextField(5);
    private JTextArea txtAreaResultado = new JTextArea(10, 30);

    private IIMCController controller = new IMCController();

    public JanelaPrincipal() {
        super("Calculadora IMC");
        setLayout(new FlowLayout());

        add(new JLabel("Nome: "));
        add(txtNome);

        add(new JLabel("Peso (Kg):"));
        add(txtPeso);

        add(new JLabel("Altura (m)"));
        add(txtAltura);

        JButton btnCalcular = new JButton("Calcular IMC");
        btnCalcular.addActionListener(this::calcularIMC);
        add(btnCalcular);

        JButton btnExportar = new JButton("Exportar Histórico");
        btnExportar.addActionListener(e -> {
            controller.exportarHistorico("historico_imc.csv");
            JOptionPane.showMessageDialog(this, "Histórico exportado com sucesso!");
        });
        add(btnExportar);

        txtAreaResultado.setEditable(false);
        add(new JScrollPane(txtAreaResultado));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 350);
        setVisible(true);
    }

    private void calcularIMC(ActionEvent e) {
        try {
            String nome = txtNome.getText().trim();
            String pesoStr = txtPeso.getText().trim();
            String alturaStr = txtAltura.getText().trim();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nome é obrigatório.", "Erro", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            controller.adicionarRegistro(nome, peso, altura);
            atualizarResultado();

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Peso e altura devem ser números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarResultado() {
        StringBuilder sb = new StringBuilder();
        for (RegistroIMC registro : controller.getHistorico()) {
            sb.append(registro).append("\n");
        }
        txtAreaResultado.setText(sb.toString());
    }
}