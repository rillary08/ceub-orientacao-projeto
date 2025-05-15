public final class Aluno extends Pessoa{
    // Atributo nível
    protected String nivel;

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    // Método nível
    public void nivel(String nivel){
        System.out.println("Nível: " + nivel);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bruno", "11111111222");
        aluno.apresentar();
        aluno.nivel("Iniciante");
    }
}

