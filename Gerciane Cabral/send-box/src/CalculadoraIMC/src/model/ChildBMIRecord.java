package model;

import model.contract.ICalculoIMC;

public class ChildBMIRecord extends Pessoa implements ICalculoIMC {

    private int ageInMonths;
    private double bodyMassIndex;
    private String classification;

    public ChildBMIRecord(String nome, Double peso, Double altura, int ageInMonths) {
        super(nome, peso, altura);
        this.ageInMonths = ageInMonths;
        this.bodyMassIndex = calcularIMC();
        this.classification = classificarIMC();
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    @Override
    public Double calcularIMC() {
        double altura = getAltura();
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero para cálculo do IMC.");
        }
        bodyMassIndex = getPeso() / (altura * altura);
        return bodyMassIndex;
    }

    @Override
    public String classificarIMC() {
        return "Child BMI (evaluated for age: " + ageInMonths + " months)";
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public String getClassification() {
        return classification;
    }

    @Override
    public String toString() {
        return "\nName: " + getNome() +
               "\nAge: " + ageInMonths + " months" +
               "\nHeight: " + getAltura() + " m" +
               "\nWeight: " + getPeso() + " kg" +
               "\nEstimated BMI: " + String.format("%.2f", bodyMassIndex) +
               "\nClassification: " + classification;
    }
}