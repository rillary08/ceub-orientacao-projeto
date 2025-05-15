public class Pessoa {
    // Atributos nome e cpf para cada pessoa
    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf){
            this.nome = nome;
            this.cpf = cpf;
    }

    // Método apresentar
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
    }
}
