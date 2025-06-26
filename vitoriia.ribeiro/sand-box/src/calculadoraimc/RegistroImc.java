public class RegistroImc extends Pessoa {

    public RegistroImc(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    @Override
    public String getTipo() {
        return "Adulto";
    }
}
