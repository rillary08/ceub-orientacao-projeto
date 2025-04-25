public class App {

 private static void fiscalizar(veiculo veiculo){
    veiculo.Ligar();
    veiculo.exibirIngormacoes();
 }


    public static void main(String[] args) throws Exception {
       Carro punto = new Carro("punto", 2010);
       moto moto = new moto("hornet", 2020);
       sedan sedan = new sedan("corrola", 2021);

       fiscalizar(punto);
       fiscalizar(moto);
       

       punto.Ligar();
       punto.exibirIngormacoes();

       moto.Ligar();
       moto.exibirIngormacoes();

       if (punto instanceof veiculo) {
        System.out.println("Punto é veiculo");
       }
        
       if ((moto instanceof veiculo)) {
        System.out.println("Moto é veiculo");
        
       }

       System.out.println(moto.getTipoCombustivel());




    }
}
