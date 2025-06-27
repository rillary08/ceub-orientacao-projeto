// Classe professor gerdando características de Pessoa
public class Professor extends Pessoa{

    // Vetor de idiomas e os idiomas
    private Idioma langage;

    // Construtor, vai dar erro nas listas (desaprendi a fazer vetores durante a prova)
    public Professor(String nome, String cpf, Idioma langage) {
        super(nome, cpf);
        this.langage = langage;
    }

    // Getters, pq não precisamos de setters aqui
    public Idioma getLangage() {
        return langage;
    }

    // Sobreescrevendo o método da superclasse
    @Override
    public void apresentar() {
        System.out.println("Nome: "+getNome()+
                            "\n CPF: "+getCpf()+
                            "\n Idiomas: "+getLangage());
    }

}
