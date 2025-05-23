import java.util.ArrayList;
import java.util.List;

public class Carro extends Veiculo {

    private String cor;
    List<Carro> listaCarros = new ArrayList<>();

    public Carro(String placa, String marca, int ano, int qtdPorta, String cor) {
        super(placa, marca, ano, qtdPorta); // super é de classe mãe
        this.cor = cor;
        //TODO Auto-generated constructor stub
    }
    public String getCor(){
        return cor;
    }
    
    @Override //reescrever um método que está na classe mãe - veiculo
    public void ExibirInformacoes(){

        System.out.println( "cor: " + getCor());

}
    public void adicionarCarro(Carro carro) {
        listaCarros.add(carro);
    }
}
