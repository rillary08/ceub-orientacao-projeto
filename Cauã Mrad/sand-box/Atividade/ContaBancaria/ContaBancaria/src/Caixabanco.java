public class Caixabanco {
    public static void main(String[] args) {
        
        // Declarando as variáveis da classe
   ContaBancaria cauã = new ContaBancaria("cauã", 1500.0, 400.0, "Conta Corrente");
       
        // Método Informação
    cauã.infoConta();

        //Método depósito
    cauã.deposito(500.0);

        //Método saque
    cauã.sacar(500.0);
  
   }

    

}
