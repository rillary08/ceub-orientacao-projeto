public class App {

    private static void fiscalizar(Veiculo veiculo){
        veiculo.ligar();
        veiculo.exibirInfo();
    }



    public static void main(String[] args) throws Exception {
       Carro punto = new Carro("punto", 2010);
       Moto moto = new Moto("honnet", 2020);

       Sedan porsche = new Sedan("918 Spyder", 2014);


       fiscalizar(porsche);
       fiscalizar(moto);
       fiscalizar(punto);
    }

    

  
}
