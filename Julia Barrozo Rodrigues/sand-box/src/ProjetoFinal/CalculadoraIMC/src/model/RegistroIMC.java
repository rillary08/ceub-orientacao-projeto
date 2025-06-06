package model;

import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC{

    private double item;
    private String classificacao;
    
    public RegistroIMC(String nome, Double peso, Double altura) {
        super(nome, peso, altura);
    }

    @Override
    public double calcularIMC() {
        // voce deve escrever o metodo calcular IMC
        return 0.0;
    }

    @Override
    public String classificarIMC() {
        // voce deve escrever o metodo classificarIMC e retornar como esta a pessoa
        return "Obeso";
    }

}
