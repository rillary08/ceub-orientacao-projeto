package Atividade;



public class Caixabanco {

    public static void main (string[] args){
        
        //declarando as avariáveis da classe
       ContaBancaria cauã = new ContaBancaria("cauã",1500.0, 400,0, "conta corrente");

       //Método de informação
       cauã.infoconta();

       //Método de deposito
       cauã.deposito(400,0);

       //Método de saque
       cauã.sacar(300.0);

    
    }



}
