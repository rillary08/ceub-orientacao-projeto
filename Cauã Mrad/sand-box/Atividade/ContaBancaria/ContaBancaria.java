<<<<<<< HEAD:Cauã Mrad/sand-box/Atividade/ContaBancaria/ContaBancaria.java
=======



import java.util.function.DoubleUnaryOperator;

//Declarando a conta bancaria

>>>>>>> 78dd5bbdb8cd34e3d595cbc60381a65bcca79c63:Cauã Mrad/sand-box/Atividade/ContaBancaria.java
public class ContaBancaria {
    Double valor;
    Double saldo;
    String nome;
    String conta;

        //Construtor da conta bancaria
public ContaBancaria(String nome, Double saldo, Double valor, String conta){

    this.nome = nome;
    this.saldo = saldo;
    this.valor = valor;    
    this.conta = conta;
}

//Método adicionar dinheiro na conta
public void deposito(Double valor){
    System.out.println(saldo + valor);
}
        //método sacar dinheiro
public void sacar(Double valor){
    if (saldo - valor <= 0) {
        System.out.println("Saldo indisponível para saque");
    } else {
        System.out.println(saldo - valor);
    }
}

        //Método para mostrar informações da conta
public void infoConta(){
    System.out.println("\nNome: " + nome +
                             "\nSaldo: " + saldo +
                            "\nConta: " + conta);
}
    


public void deposito(int i, int j) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deposito'");
}

}
