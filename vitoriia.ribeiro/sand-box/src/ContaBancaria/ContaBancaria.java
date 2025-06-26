
public class ContaBancaria {

   
    Double dinheiro;
    Double saldo;
    String nome;
    String cpf;


    
    public ContaBancaria(String nome, String cpf){
        this.saldo = 500.00;
        this.nome = nome;
        this.cpf = cpf;
    }

    
    public void depositar(Double dinheiro){
        System.out.println(saldo+dinheiro);
    }

    
    public void sacar(Double dinheiro){
        if (saldo-dinheiro <= 0){
            System.out.println("Saldo indisponível para saque");
        } else {
            System.out.println(saldo-dinheiro);
        }
    }

    public void info() {
        System.out.println("\n Nome: "+nome+
                            "\n CPF: "+cpf+
                            "\n Saldo: "+saldo);
    }

}