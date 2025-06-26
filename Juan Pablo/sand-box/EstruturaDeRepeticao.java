import java.util.List;

public class EstruturaRepeticao {
public static void main(String[] args) {
    

// i = i + 1 == i++ //

    for(int i = 1; i < 5; i++) {

        System.out.println("Valor: " + i);
    }


// Próxima aula lista e for melhor
    int contador = 0;
    while (contador < 5) {
        System.out.println("Contador: "+contador);
        contador++;
    }

/////////////////////////////////////////////////////// - Aula 06/03
    

    List<String> nomes = List.of("Gerciane", "Maria", "João");
    for(String nome : nomes) {
        System.out.println(nome);
    }

}
}