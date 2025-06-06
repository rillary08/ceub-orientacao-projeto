package model;

import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC{

    private double imc;
    private String classificacao;

    public RegistroIMC(String nome, Double peso, Double altura) {
            super(nome, peso, altura);
        }
        @Override
    public Double calcularIMC() {
        // fazer O cálculo
        return 0.0;
    }

    @Override
    public String classificarIMC() {
        // fazer a classificação do IMC
        return null;
    }

}
