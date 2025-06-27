public class App {
    public static void main(String[] args) throws Exception {
        Idioma idis = new Idioma(null);
        Professor fer = new Professor("Fernando", "742.632.965-96", idis);

        // Desaprendi a colocar atributos em vetores
        fer.apresentar();
        System.out.println("");

        // Desaprendi a como não fazer para apontar a memória, ao invés de mostrar a string
        Nivel ini = new Nivel("");
        Aluno ember = new Aluno("Ember Misaka", "741.965.153-96", ini);

        ember.apresentar();
    }
}
