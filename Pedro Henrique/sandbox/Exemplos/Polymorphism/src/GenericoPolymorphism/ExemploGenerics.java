package GenericoPolymorphism;
public class ExemploGenerics {
    public static void main(String[] args) {
        Caixa<Integer> caixa = new Caixa<Integer>(null);
        caixa.salvar(10);
        Integer retorno = caixa.get();
        System.out.println(retorno);

        Caixa<String> caixa2 = new Caixa<String>(null);
        caixa2.salvar("Teste");
        String retorno2 = caixa2.get();
        System.out.println(retorno2);
        
        Caixa<Produto> caixa3 = new Caixa<Produto>(null);
        caixa3.salvar(new Produto("Notebook", 3000));
        String nomeProduto = caixa3.get().getNome();
        System.out.println("Nome do produto: " + nomeProduto);
    }
}

class Caixa<T> {
    private T conteudo;
    Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    public void salvar(T item) {
        this.conteudo = item;
    }

    public T get() {
        return this.conteudo;
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}