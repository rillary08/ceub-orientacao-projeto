public abstract class Pessoa {
    protected String nome;
    protected double peso;
    protected double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract double calcularIMC();

    public abstract String getTipo();

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
