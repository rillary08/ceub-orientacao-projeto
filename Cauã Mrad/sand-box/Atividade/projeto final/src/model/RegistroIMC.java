package model;

import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC {

    private double imc;
    private String classificacao;

    public RegistroIMC(double altura, String nome, double peso) {
        super(altura, nome, peso);
    }

    @Override
    public double calcularIMC() {
        this.imc = getPeso() / (getAltura() * getAltura());
        return this.imc;
    }

    @Override
    public String classificarIMC() {
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }
        return classificacao;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | IMC: %.2f | Classificação: %s", getNome(), imc, classificacao);
    }
}