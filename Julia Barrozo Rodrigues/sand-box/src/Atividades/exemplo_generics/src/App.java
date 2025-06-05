public class App {
    public static void main(String[] args) throws Exception {
        Caixa<Integer> caixaInteiro = new Caixa<Integer>(); // T é declarado como Integer
        caixaInteiro.salvar(20);
        Integer retorno = caixaInteiro.get();
        System.out.println(retorno);

        Caixa<String> caixaString = new Caixa<String>(); // T é declarado como String
        caixaString.salvar("Julia");
        String retornoString = caixaString.get();
        System.out.println(retornoString);

        Caixa<Produto> caixaProduto = new Caixa<Produto>(); // T é declarado como Produto
        caixaProduto.salvar(new Produto("Camisa", "R$ 50"));
        String nomeProduto = caixaProduto.get().getNome();
        System.out.println("Nome Produto: " + nomeProduto );
    }
}
class Caixa<T> { // <T> é um parametro de tipo generico, representa Type. T vai ser declarado quando a classe for instanciada
    private T conteudo; // o atributo conteudo vai ser do tipo que for passado como parametro

    public void salvar(T item) {
        this.conteudo = item;
    }

    public T get() {
        return this.conteudo;
    }
}
class Produto {
    private String nome;
    private String preco;

    public Produto(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return this.nome;
    }
    public String getPreco() {
        return this.preco;
    }
}    

