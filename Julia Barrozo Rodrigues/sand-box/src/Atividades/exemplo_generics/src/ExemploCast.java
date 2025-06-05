import java.util.ArrayList;
import java.util.List;

public class ExemploCast {
    public static void main(String[] args) {
        List<Pagamento> listaPagamentos = new ArrayList<>();
        listaPagamentos.add(new CartaoCredito(100.0,1000.0));
        listaPagamentos.add(new Boleto(250.0,"123123.12312314525612.1325318724962.129646921"));

        for (Pagamento p : listaPagamentos) {
            p.processar();
            if(p instanceof CartaoCredito) {
                CartaoCredito cartao = (CartaoCredito)p; // type cast pode ser tratado como do tipo cartao
                Double limite = cartao.getLimiteDisponivel();
                System.out.println("Meu limite é: " + limite);
            }
            if (p instanceof Boleto) {
                Boleto boleto = (Boleto)p; // pode ser tratado como do tipo boleto
                String codBar = boleto.getCodBar();
                System.out.println("Meu boleto é: " + codBar);
            }
        }
        
    }
}
class Pagamento {
    private Double valor;

    public Pagamento(Double valor) {
        this.valor = valor;
    }

    public void processar() {
        System.out.println("Processando pagamento de R$" + this.valor);
    }

    public Double getValor() {
        return this.valor;
    }
}
class CartaoCredito extends Pagamento {

    private Double valorLimite;

    public CartaoCredito(Double valor, Double valorLimite) {
        super(valor);
        this.valorLimite = valorLimite;
    }       
    public Double getLimiteDisponivel() {
        return valorLimite - super.getValor();
    }
}

class Boleto extends Pagamento {

    private String codBar;

    public Boleto(Double valor, String codBar) {
        super(valor);
        this.codBar = codBar;
    }
    public String getCodBar() {
        return codBar;
    }
}