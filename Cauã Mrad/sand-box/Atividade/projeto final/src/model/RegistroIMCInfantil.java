package model;

public class RegistroIMCInfantil extends Pessoa {

    private double imc;
    private String classificacao;

    public RegistroIMCInfantil(double altura, String nome, double peso) {
        super(altura, nome, peso);
    }

    public double calcularIMC() {
        this.imc = getPeso() / (getAltura() * getAltura());
        return this.imc;
    }

    public String classificarIMC() {
        if (imc < 14.0) {
            classificacao = "Abaixo do peso (Infantil)";
        } else if (imc < 17.0) {
            classificacao = "Peso normal (Infantil)";
        } else {
            classificacao = "Acima do peso (Infantil)";
        }
        return classificacao;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | IMC Infantil: %.2f | Classificação: %s", getNome(), imc, classificacao);
    }
}