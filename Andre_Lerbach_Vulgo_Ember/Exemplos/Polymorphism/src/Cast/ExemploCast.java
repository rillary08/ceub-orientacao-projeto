package Cast;

import java.util.ArrayList;
import java.util.List;


public class ExemploCast {
    public static void main(String[] args) {
        List<Pagamento> listaPagamento = new ArrayList<>();
        listaPagamento.add(new CartaoCredito(100, 1000.0));
        listaPagamento.add(new boleto(100, "1234-5678-9012-3456"));

        for(Pagamento p : listaPagamento){
            p.processar();

            if (p instanceof CartaoCredito) {
                CartaoCredito cartao = (CartaoCredito)p;
                Double limite = cartao.getValorLimite();
                System.out.println("Limite: " + limite);
            }

            if (p instanceof boleto) {
                boleto boleto = (boleto)p;
                String codBar = boleto.getCodigoDeBarras();
                System.out.println("Boleto: " + codBar);
            }
        }
    }
}

class Pagamento {
    private double valor;
    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processar(){
        System.out.println("Processando pagamento de " +valor);
    }

    public double getValor() {
        return valor;
    }
}

class CartaoCredito extends Pagamento {

    private Double valorLimite;

    public CartaoCredito(double valor, Double valorLimite) {
        super(valor);
        this.valorLimite = valorLimite;
    }

    public Double getValorLimite() {
        return valorLimite - super.getValor();
    }
}

class boleto extends Pagamento {
    private String codigoDeBarras;

    public boleto(double valor, String codigoDeBarras) {
        super(valor);
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getCodigoDeBarras() {
        return this.codigoDeBarras;
    }
}