public class ContaBancaria {

    private double saldo;

    public void depositar (double valor){

    }

    public boolean sacar() {
        return false;
    }

    public void imprimirSaldo(){
        System.out.println("SALDO: " + saldo);
    }

    public static void main(String[] args) {

        ContaBancaria contaNey = new ContaBancaria();

        contaNey.saldo = 1000;
        contaNey.imprimirSaldo();

        ContaBancaria contaProf = new ContaBancaria();

        contaProf.saldo = 100;
        contaProf.imprimirSaldo();

    }
}
