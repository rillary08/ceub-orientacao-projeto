public class EstruturaFluxo {

public static void main(String[] args) {
    
int idade = 18;

//if-else

if (idade >= 18) {
    System.out.println("Vocé é de maior!");
    
}else{
    System.out.println("sou de menor!");
}
    //operador ternario

    String status = (idade >= 18) ? "maior de idade" : "sou de menor";
    System.out.println(status);

    int dia = 3;
         

    switch (dia) {
    case 1:
        System.out.println("primeiro dia");
        break;
    case 2:
        System.out.println("segundo dia");
        break;
    default:
        System.out.println("Dia nao encontrado");
        break;
    }






}





}
