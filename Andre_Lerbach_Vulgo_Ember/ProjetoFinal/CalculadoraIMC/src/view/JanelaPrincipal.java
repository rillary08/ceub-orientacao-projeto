package view;

import controller.IMCController;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.RegistroIMC;
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

        // --- Campos Adulto
        add(new JLabel("Nome:"));
        add(txtNome);
        add(new JLabel("Peso (kg):"));
        add(txtPeso);
        add(new JLabel("Altura (m):"));
        add(txtAltura);

        JButton btnCalcularAdulto = new JButton("Calcular IMC Adulto");
        btnCalcularAdulto.addActionListener(this::calcularIMC);
        add(btnCalcularAdulto);

        // --- Campos Bebê
        add(new JLabel("Idade (meses):"));
        add(txtIdadeMeses);

        JButton btnCalcularBebe = new JButton("Calcular IMC Bebê");
        btnCalcularBebe.addActionListener(this::calcularIMCBebe);
        add(btnCalcularBebe);

        // --- Exportação
        JButton btnExportTxt = new JButton("Exportar TXT");
        btnExportTxt.addActionListener(this::exportarTXT);
        add(btnExportTxt);

        JButton btnExportCsv = new JButton("Exportar CSV");
        btnExportCsv.addActionListener(this::exportarCSV);
        add(btnExportCsv);

        // --- Área de resultado
        txtAreaResultado.setEditable(false);
        add(new JScrollPane(txtAreaResultado));

        // Configurações finais
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Cálculo Adulto
    private void calcularIMC(ActionEvent e) {
        try {
            String nome   = txtNome.getText().trim();
            double peso   = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            validarDados(nome, peso, altura, 0);

            controller.adicionarRegistro(nome, peso, altura);
            atualizarResultado();
            limparCamposAdulto();

        } catch (NumberFormatException ex) {
            showError("Peso e Altura precisam ser números válidos.");
        } catch (IllegalArgumentException ex) {
            showWarning(ex.getMessage());
        }
    }

    // Cálculo Infantil
    private void calcularIMCBebe(ActionEvent e) {
        try {
            String nome      = txtNome.getText().trim();
            double peso      = Double.parseDouble(txtPeso.getText());
            double altura    = Double.parseDouble(txtAltura.getText());
            int idadeMeses   = Integer.parseInt(txtIdadeMeses.getText());
            validarDados(nome, peso, altura, idadeMeses);

            controller.adicionarRegistroInfantil(nome, peso, altura, idadeMeses);
            atualizarResultado();
            limparCamposBebe();

        } catch (NumberFormatException ex) {
            showError("Peso, Altura e Idade precisam ser números válidos.");
        } catch (IllegalArgumentException ex) {
            showWarning(ex.getMessage());
        }
    }

    // Validação comum
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

    // Atualiza área de texto
    private void atualizarResultado() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Adultos ===\n");
        for (RegistroIMC r : controller.getHistorico()) {
            sb.append(r).append("\n\n");
        }
        sb.append("=== Bebês ===\n");
        for (RegistroIMC r : controller.getHistoricoInfantil()) {
            sb.append(r).append("\n\n");
        }
        txtAreaResultado.setText(sb.toString());
    }

    // Exporta TXT
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

    // Exporta CSV
    private void exportarCSV(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("CSV (*.csv)", "csv"));
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = ensureExtension(chooser.getSelectedFile(), ".csv");
            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
                // Cabeçalho
                out.println("Tipo,Nome,Peso,Altura,IMC,Classificacao");
                // Adultos
                for (RegistroIMC r : controller.getHistorico()) {
                    out.printf("Adulto,\"%s\",%.2f,%.2f,%.2f,\"%s\"%n",
                               r.getNome(), r.getPeso(), r.getAltura(), r.getImc(), r.getClassificacao());
                }
                // Bebês
                for (RegistroIMC r : controller.getHistoricoInfantil()) {
                    out.printf("Bebê,\"%s\",%.2f,%.2f,%.2f,\"%s\"%n",
                               r.getNome(), r.getPeso(), r.getAltura(), r.getImc(), r.getClassificacao());
                }
                JOptionPane.showMessageDialog(this, "Exportado com sucesso: " + file.getAbsolutePath());
            } catch (IOException ex) {
                showError("Erro ao exportar CSV: " + ex.getMessage());
            }
        }
    }

    // Garante extensão no nome do arquivo
    private File ensureExtension(File f, String ext) {
        if (!f.getName().toLowerCase().endsWith(ext)) {
            return new File(f.getParentFile(), f.getName() + ext);
        }
        return f;
    }

    private void limparCamposAdulto() {
        txtNome.setText("");
        txtPeso.setText("");
        txtAltura.setText("");
        txtNome.requestFocus();
    }

    private void limparCamposBebe() {
        txtNome.setText("");
        txtPeso.setText("");
        txtAltura.setText("");
        txtIdadeMeses.setText("");
        txtNome.requestFocus();
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