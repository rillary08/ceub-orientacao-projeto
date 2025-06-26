public class moto extends veiculo{

    public moto(String modelo, int ano) {
            super(modelo, ano);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    void Ligar() {
     System.out.println("Moto ligando");  
    }
    
    @Override
    public String getTipoCombustivel(){
        return "gasolina";
    }

}
