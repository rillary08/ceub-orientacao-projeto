
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class TratamentoExcecoes {
    public static void main(String[] args) {

        try{
            int resultado = 10 / 0;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Você tentou divisão por zero, não pode!");
            //TODO: handle exception
        }
        try {
            Scanner scanner = new Scanner(new File("arquivo.txt"));
        }catch (FileNotFoundException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
