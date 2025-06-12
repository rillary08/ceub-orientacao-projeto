import model.Pessoa;
import model.RegistroIMC;

public class App {
    public static void main(String[] args) throws Exception {
        RegistroIMC andre = new RegistroIMC("Ember", 70.0, 1.75);

        andre.calcularIMC();
        andre.classificarIMC();
    }
}
