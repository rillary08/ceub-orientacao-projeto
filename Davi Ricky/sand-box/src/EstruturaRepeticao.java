import java.util.List;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            //System.out.println("Valor "+i);
        } 

        

        int contador = 0;
        while (contador < 5) {
            System.out.println("contador: " + contador);
            contador ++;
        }

        List<String> nomes = List.of("Godoi", "Sabrina", "Carlos" );
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
    }
}
