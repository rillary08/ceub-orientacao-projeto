import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadesAulas {

    public static void main(String[] args) {

        // somaDoisNumeros();
        //reordenarLista();
        System.out.println(verificaPalindromo("civic"));
    }

    // Vitoria
    // 1. Crie um programa que receba dois números inteiros e imprima a soma deles.
    private static void somaDoisNumeros() {
        Integer numero1 = 1;
        Integer numero2 = 3;
        System.out.println(numero1 + numero2);
    }

    // Edilson
    // 2. Desenvolva um programa que leia uma lista de nomes e os imprima em ordem
    // alfabética.
    private static void reordenarLista() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite o nomes: [Digite 'parar' para encerrar]");

        while (true) {
            String nome = scanner.nextLine();
            if (nome.trim().equalsIgnoreCase("parar")) {
                break;
            }
            nomes.add(nome);
        }

        // Ordenar lista
        Collections.sort(nomes, (nome1, nome2) -> nome2.compareTo(nome1));

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

        //João Amorim
        //3. Crie um programa para verificar se a palavra é palíndromo.
        private static boolean verificaPalindromo(String palavra){
            String invertida = new StringBuilder(palavra).reverse().toString();
            return palavra.equalsIgnoreCase(invertida); //na linha 12 está o restante do código

            
        }
}