package model;

import model.contract.ICalculoIMC;

public class RegistroIMCInfantil extends Pessoa implements ICalculoIMC {

    private int idadeMeses;
    private double imc;
    private String classificacao;

    public RegistroIMCInfantil(String nome, Double peso, Double altura, int idadeMeses) {
        super(nome, peso, altura);
        this.idadeMeses = idadeMeses;
        this.imc = calcularIMC();
        this.classificacao = classificarIMC();
    }

    public int getIdadeMeses() {
        return idadeMeses;
    }

    @Override
    public Double calcularIMC() {
        imc = getPeso() / (getAltura() * getAltura());
        return imc;
    }

    @Override
    public String classificarIMC() {
        classificacao = "IMC infantil (avaliação baseada em idade: " + idadeMeses + " meses)";
        return classificacao;
    }

    public double getImc() {
        return imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
               "\nIdade: " + idadeMeses + " meses" +
               "\nAltura: " + getAltura() + " m" +
               "\nPeso: " + getPeso() + " kg" +
               "\nIMC estimado: " + String.format("%.2f", imc) +
               "\nClassificação: " + classificacao;
    }
}