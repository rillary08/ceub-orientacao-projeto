public class Professor extends Pessoa{
    // Atributo idioma
    protected String idiomas;

    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    // Método idiomas
    public void idiomas(String idiomas){
        System.out.println("Idiomas: " + idiomas);
    }

    public static void main(String[] args) {
        Professor prof = new Professor("Fernando", "11111111111");
        prof.apresentar();
        prof.idiomas("Ingês");
    }
}

