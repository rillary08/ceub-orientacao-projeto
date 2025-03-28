package atividades;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String tipoConta;

    // Construtor
    public ContaBancaria(String titular, String tipoConta, double saldoInicial) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar valor
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar valor
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: R$" + saldo);
    }

    // Método principal para teste
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o tipo de conta: ");
        String tipoConta = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, tipoConta, saldoInicial);
        conta.exibirInformacoes();

        System.out.print("Digite o valor para depósito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.print("Digite o valor para saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        conta.exibirInformacoes();
        scanner.close();
    }
}
