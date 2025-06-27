public class sedan extends Carro {

    public sedan(String modelo, int ano) {
        super(modelo, ano);
        
    }




    @Override
    void Ligar() {
        System.out.println("Acende farol");
        super.Ligar();
    }

}
