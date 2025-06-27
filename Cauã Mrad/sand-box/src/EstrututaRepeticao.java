import java.util.List;

public class EstrututaRepeticao {

    public static void main(String[] args) {
        
        //i = i + 1 == i++
        //for
        for(int i = 1; i <= 5; i++) {
            System.out.println("valor: " + i);

        } 

        //proxima aula Lista e for melhor


        int contador = 0;
        while (contador < 5) {
            System.out.println("contador: "+contador);
            contador++;
        }

        List<String> nomes = List.of("Cauã", "fulano" , "xavier");
        for(String nome : nomes) {
            System.out.println(nome);
        }









    }

}
