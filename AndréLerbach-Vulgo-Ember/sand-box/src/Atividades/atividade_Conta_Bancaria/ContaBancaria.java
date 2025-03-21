package atividade_Conta_Bancaria;

public class ContaBancaria {
    Double dinheiro;
    String nome;
    String cpf;


    public ContaBancaria(String nome, String cpf){
        this.dinheiro = 500.00;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void saldo(){
        System.out.println("\n Saldo na conta:"+dinheiro);
    }

    public void depositar(){
        System.out.println(dinheiro+100);
    }

    public void sacar(){
        if (dinheiro <= 0){
            System.out.println("Saldo indisponível para saque");
        } else {
            System.out.println(dinheiro-100);
        }
    }

    public void info() {
        System.out.println("\n Nome: "+nome+
                            "\n CPF: "+cpf+
                            "\n Saldo: "+dinheiro);
    }
}