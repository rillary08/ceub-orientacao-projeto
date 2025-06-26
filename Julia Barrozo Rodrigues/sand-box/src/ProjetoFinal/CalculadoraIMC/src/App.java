import controller.IMCController;
import model.Pessoa;
import model.RegistroIMC;
import view.JanelaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
    Pessoa pessoa = new Pessoa ("Julia", 1.77, 52.0);
    RegistroIMC registroIMC = new RegistroIMC("Julia - 16/06/2025", 1.77, 50.0);
    IMCController IMCController = new IMCController();
    registroIMC.calcularIMC();
    registroIMC.classificarIMC();
    IMCController.adicionarRegistro("Julia - 16/06/2025", 1.77, 50.0);
    IMCController.getHistorico();
    }
}
