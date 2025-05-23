public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("PHGS", "Ferrari", 2026, 1,"Rosa");
carro1.ExibirInformacoes();
carro1.setAno(2015);
System.out.println(carro1.getAno());
    }

}

