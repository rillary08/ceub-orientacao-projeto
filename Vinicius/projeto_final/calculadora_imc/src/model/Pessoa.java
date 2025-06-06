package model;

import model.contract.IPessoa;

public class Pessoa implements IPessoa {

    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
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
