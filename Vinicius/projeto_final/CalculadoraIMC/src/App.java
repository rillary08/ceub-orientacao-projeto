import javax.swing.SwingUtilities;
import view.JanelaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia JanelaPrincipal na EDT (Event-Dispatch Thread) do Swing
        SwingUtilities.invokeLater(JanelaPrincipal::new);
    }
}