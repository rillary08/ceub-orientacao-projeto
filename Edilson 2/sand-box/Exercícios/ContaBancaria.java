class ContaBancaria {
    private String titular;
    private double saldo;
    private String tipoConta;

    public ContaBancaria(String titular, double saldo, String tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João Silva", 1500.00, "Corrente");
        ContaBancaria conta2 = new ContaBancaria("Maria Oliveira", 2500.00, "Poupança");
        
        conta1.exibirInformacoes();
        conta1.depositar(500);
        conta1.sacar(300);
        conta1.exibirInformacoes();

        conta2.exibirInformacoes();
        conta2.sacar(2700);
        conta2.depositar(1000);
        conta2.exibirInformacoes();
    }
}