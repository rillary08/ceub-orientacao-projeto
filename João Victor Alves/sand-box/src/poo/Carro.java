package poo;

public class Carro {
    //atributos
    String chassi;
    String motor;
    String marca;
    String modelo;
    Integer portas;
    Integer ano;

    //Construtor
    public Carro(String chassi, String motor, Integer ano){
        this.chassi = chassi;
        this.motor = motor;
        this.ano = ano;
        this.portas = 2;
    }
    //metodo
    public void ligarcarro(){
        System.out.println("ligando");
    }

    public void acelerar(){
        System.out.println("acelerendo");
    }

    public void freiar(){
        System.out.println("freiando");
    }

    public void exibirdados(){
        System.out.println("Exibindo");
    }
}
