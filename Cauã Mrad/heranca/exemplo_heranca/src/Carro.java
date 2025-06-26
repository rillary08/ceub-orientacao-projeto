public class Carro extends veiculo {

    public Carro(String modelo, int ano) {
            super(modelo, ano);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    void Ligar() {
       System.out.println("Carro ligando com chave!");
    }

}
