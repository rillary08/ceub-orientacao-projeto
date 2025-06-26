package model;

import model.contract.IPessoa;

public class Pessoa implements IPessoa {

    private String nome;
    private Double peso;
    private Double altura;

    public Pessoa (String nome, Double peso, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public double getAltura() {
        return this.altura;
    }

}
