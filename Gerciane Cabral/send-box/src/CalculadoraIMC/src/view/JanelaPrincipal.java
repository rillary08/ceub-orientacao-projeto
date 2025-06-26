package view;

import controller.IMCController;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.IMCRecord;
import model.contract.IIMCController;

public class JanelaPrincipal extends JFrame {

    private JTextField txtNome         = new JTextField(20);
    private JTextField txtPeso         = new JTextField(5);
    private JTextField txtAltura       = new JTextField(5);
    private JTextField txtIdadeMeses   = new JTextField(5);
    private JTextArea  txtAreaResultado= new JTextArea(12, 35);

    private IIMCController controller = new IMCController();

    public JanelaPrincipal() {
        super("Calculadora de IMC");
        setLayout(new FlowLayout());

        add(new JLabel("Nome:"));
        add(txtNome);
        add(new JLabel("Peso (kg):"));
        add(txtPeso);
        add(new JLabel("Altura (m):"));
        add(txtAltura);

        JButton btnCalcularAdulto = new JButton("Calcular IMC Adulto");
        btnCalcularAdulto.addActionListener(this::calcularIMC);
        add(btnCalcularAdulto);

        add(new JLabel("Idade (meses):"));
        add(txtIdadeMeses);
        JButton btnCalcularBebe = new JButton("Calcular IMC Bebê");
        btnCalcularBebe.addActionListener(this::calcularIMCBebe);
        add(btnCalcularBebe);

        JButton btnExportTxt = new JButton("Exportar TXT");
        btnExportTxt.addActionListener(this::exportarTXT);
        add(btnExportTxt);

        txtAreaResultado.setEditable(false);
        add(new JScrollPane(txtAreaResultado));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calcularIMC(ActionEvent e) {
        try {
            String nome   = txtNome.getText().trim();
            double peso   = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            validarDados(nome, peso, altura, 0);
            controller.adicionarRegistro(nome, peso, altura);
            atualizarResultado();
        } catch (NumberFormatException ex) {
            showError("Peso e Altura precisam ser números válidos.");
        } catch (IllegalArgumentException ex) {
            showWarning(ex.getMessage());
        }
    }

    private void calcularIMCBebe(ActionEvent e) {
        try {
            String nome    = txtNome.getText().trim();
            double peso    = Double.parseDouble(txtPeso.getText());
            double altura  = Double.parseDouble(txtAltura.getText());
            int idadeMeses = Integer.parseInt(txtIdadeMeses.getText());
            validarDados(nome, peso, altura, idadeMeses);
            controller.adicionarRegistroInfantil(nome, peso, altura, idadeMeses);
            atualizarResultado();
        } catch (NumberFormatException ex) {
            showError("Peso, Altura e Idade precisam ser números válidos.");
        } catch (IllegalArgumentException ex) {
            showWarning(ex.getMessage());
        }
    }

    private void validarDados(String nome, double peso, double altura, int idadeMeses) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O campo Nome não pode ficar vazio.");
        }
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e Altura devem ser valores positivos.");
        }
        if (idadeMeses < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }

    private void atualizarResultado() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Adultos ===\n");
        for (IMCRecord r : controller.getHistorico()) {
            sb.append(r).append("\n\n");
        }
        sb.append("=== Bebês ===\n");
        for (IMCRecord r : controller.getHistoricoInfantil()) { // ou ChildBMIRecord, se preferir separação clara
            sb.append(r).append("\n\n");
        }
        txtAreaResultado.setText(sb.toString());
    }

    private void exportarTXT(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Texto (*.txt)", "txt"));
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = ensureExtension(chooser.getSelectedFile(), ".txt");
            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
                out.println(txtAreaResultado.getText());
                JOptionPane.showMessageDialog(this, "Exportado com sucesso: " + file.getAbsolutePath());
            } catch (IOException ex) {
                showError("Erro ao exportar TXT: " + ex.getMessage());
            }
        }
    }

    private File ensureExtension(File f, String ext) {
        if (!f.getName().toLowerCase().endsWith(ext)) {
            return new File(f.getParentFile(), f.getName() + ext);
        }
        return f;
    }

    private void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    private void showWarning(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(JanelaPrincipal::new);
    }
}