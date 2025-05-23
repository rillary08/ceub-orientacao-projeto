public class pessoa {

}
public abstract class Pessoa {

    protected String nome;

    protected String cpf;



    public Pessoa(String nome, String cpf) {

        this.nome = nome;

        this.cpf = cpf;

    }



    public abstract void apresentar();

}









public class Professor extends Pessoa {

    private List<String> idiomas;



    public Professor(String nome, String cpf, List<String> idiomas) {

        super(nome, cpf);

        this.idiomas = idiomas;

    }



    @Override

    public void apresentar() {

        System.out.println("Olá, sou o professor " + nome + ", leciono os idiomas: " + String.join(", ", idiomas) + ".");

    }

}







import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Maria", "123.456.789-00", "Intermediário");

        Professor professor = new Professor("Carlos", "987.654.321-00", Arrays.asList("Inglês", "Espanhol"));



        aluno.apresentar();

        professor.apresentar();

    }

}

