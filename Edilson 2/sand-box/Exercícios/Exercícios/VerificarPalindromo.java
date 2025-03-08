public class VerificarPalindromo {

    public static Boolean verificarPalindromo(String palavra) {
        palavra = palavra.toLowerCase();

        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    } 

    public static void main(String[] args) {
        String palavra = "Hanah";

        if (verificarPalindromo(palavra)) {
            System.out.println(palavra + " É um Palindromo.");
        } else {
            System.out.println(palavra + " Não é um Palindromo");
        }
    }

    }

