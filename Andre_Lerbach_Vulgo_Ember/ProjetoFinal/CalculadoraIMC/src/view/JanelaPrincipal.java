package view;

import controller.IMCController;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.RegistroIMC;
import model.contract.IIMCController;

public class JanelaPrincipal extends JFrame {

    private JTextField txtNome       = new JTextField(20);
    private JTextField txtPeso       = new JTextField(5);
    private JTextField txtAltura     = new JTextField(5);
    private JTextArea  txtAreaResultado = new JTextArea(10, 30);

    private IIMCController controller = new IMCController();

    public JanelaPrincipal() {
        super("Calculadora IMC");

        setLayout(new FlowLayout());

        add(new JLabel("Nome: "));
        add(txtNome);

        add(new JLabel("Peso (Kg):"));
        add(txtPeso);

        add(new JLabel("Altura (m):"));
        add(txtAltura);

        JButton btnCalcular = new JButton("Calcular IMC");
        btnCalcular.addActionListener(this::calcularIMC);
        add(btnCalcular);

        txtAreaResultado.setEditable(false);
        add(new JScrollPane(txtAreaResultado));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calcularIMC(ActionEvent e) {
        try {
            String nome = txtNome.getText().trim();
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "O campo Nome não pode ficar vazio.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            double peso   = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            if (peso <= 0 || altura <= 0) {
                JOptionPane.showMessageDialog(this,
                    "Peso e Altura devem ser números positivos.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Criando um registro de IMC e adicionando no histórico
            controller.adicionarRegistro(nome, peso, altura);

            // Atualiza a área de texto com todo o histórico de registros
            atualizarResultado();

            // Limpa campos para a próxima entrada
            txtNome.setText("");
            txtPeso.setText("");
            txtAltura.setText("");
            txtNome.requestFocus();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Erro na conversão de dados: verifique se peso e altura são números válidos.",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarResultado() {
        StringBuilder sb = new StringBuilder();
        for (RegistroIMC registro : controller.getHistorico()) {
            sb.append(registro.toString())
              .append(System.lineSeparator());
        }
        txtAreaResultado.setText(sb.toString());
    }

    public static void main(String[] args) {
        // roda a interface na Thread de evento do Swing
        javax.swing.SwingUtilities.invokeLater(JanelaPrincipal::new);
    }
}