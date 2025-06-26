// classe abstrata (SuperClasse)
public abstract class Pessoa {
    protected String nome;
    protected String cpf;

    // Construtor
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Método abstrado que vai ser sobreescrito nas SubClasses
    public abstract void apresentar();

}
