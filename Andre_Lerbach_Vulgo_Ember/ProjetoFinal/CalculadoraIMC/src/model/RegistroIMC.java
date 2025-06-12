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
        imc = getPeso()/(getAltura()+getAltura());
        return imc;
    }

    @Override
    public String classificarIMC() {
        if (imc < 18.5) {
            classificacao = "Abaixo do Peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            classificacao = "Obesidade Grau 1";
        } else if (imc >= 35 && imc <= 39.9) {
            classificacao = "Obesidade Grau 2";
        } else if (imc >= 40) {
            classificacao = "Obesidade Grau 3";
        }
        System.out.println("\n De acordo com seu IMC, você está: "+classificacao+
                            "\n E seu IMC é: "+imc);

        return classificacao;
    }

}
