/*package Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeAula {

    public static void main(String[] args) {
        // somaDoisNumeros();
        // reordenarLista();
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

    // João Amorim
    // 3. Crie um programa para verificar se uma palavra é palíndromo.
    private static boolean verificaPalindromo(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);
    }
}



//verificação do palindromo solicitando a palavra para o usuário

import java.util.Scanner;

public class VerificaPalindromo {
    
    //crie um programa que verifica se uma palavra é palindromo

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma palavra: "); //solicita ao usuário que insira uma palavra
            String palavra = scanner.nextLine();
        
         if (verificapalindromo(palavra)) { //verifica se a palavra é um palíndromo e imprime a mensagem correspondente
            System.out.println("É palíndromo");}
        else {
            System.out.println("Não é palíndromo");}
        
         scanner.close(); //fecha o scanner
    } 
   
    private static boolean verificapalindromo(String palavra){
        
        //método que inverte

        String invertida = new StringBuilder(palavra).reverse().toString(); //inverte a palavra e transforma em string
        return palavra.equalsIgnoreCase(invertida); //compara com a palvra armazenada e retorna true ou false
    }
}

Atividade soma

package atividades;

import java.util.Arrays;
import java.util.Scanner;

public class atividadeAula {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número :");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número :");
        int num2 = scanner.nextInt();
        System.out.println("A soma é " + (num1 + num2));

    }

}*/
