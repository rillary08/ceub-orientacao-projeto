public class RegistroImcInfantil extends Pessoa {

    public RegistroImcInfantil(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public double calcularIMC() {
        // Exemplo de cálculo infantil (pode ser refinado)
        return peso / (altura * altura) * 1.1; // só para diferenciar
    }

    @Override
    public String getTipo() {
        return "Infantil";
    }
}
