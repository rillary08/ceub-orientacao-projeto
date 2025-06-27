// Classe Aluno herdando características de Pessoa
public class Aluno extends Pessoa{

    // Variável nível
    private Nivel nivel;

    // construtor
    public Aluno(String nome, String cpf, Nivel nivel) {
        super(nome, cpf);
        this.nivel = nivel;
    }

    // Só o getter, pq n precisamos de setters
    public Nivel getNivel() {
        return nivel;
    }

    // Método que vai ser sobreescrito
    @Override
    public void apresentar() {
        System.out.println("Nome: "+getNome()+
                            "\n CPF: "+getCpf()+
                            "\n Nivel: "+getNivel());
    }
}
