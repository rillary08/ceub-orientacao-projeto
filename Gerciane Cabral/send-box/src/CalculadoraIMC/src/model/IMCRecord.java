package model;

import model.contract.ICalculoIMC;

public class IMCRecord extends Pessoa implements ICalculoIMC {
    private double bodyMassIndex;
    private String classification;

    public IMCRecord(String nome, Double peso, Double altura) {
        super(nome, peso, altura);
        this.bodyMassIndex = calcularIMC();
        this.classification = classificarIMC();
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
        if (bodyMassIndex < 18.5) {
            classification = "Underweight";
        } else if (bodyMassIndex <= 24.9) {
            classification = "Normal Weight";
        } else if (bodyMassIndex <= 29.9) {
            classification = "Overweight";
        } else if (bodyMassIndex <= 34.9) {
            classification = "Obesity Grade 1";
        } else if (bodyMassIndex <= 39.9) {
            classification = "Obesity Grade 2";
        } else {
            classification = "Obesity Grade 3";
        }
        return classification;
    }

    @Override
    public String toString() {
        return String.format(
            "\nName: %s\nHeight: %.2f m\nWeight: %.2f kg\nBMI: %.2f\nClassification: %s",
            getNome(), getAltura(), getPeso(), bodyMassIndex, classification
        );
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setBodyMassIndex(double bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
    }
}