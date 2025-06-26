public class EstruturaFluxo {
    public static void main(String[] args) {
    
    // if e else //
    
        int idade = 18;
    
        if(idade >= 18){
            System.out.println("Você é meior de idade");
        }else{
            System.out.println("Sou de menor");
        }
    
    
    // operador ternário (condição) ? operação caso true ; operação caso false; //
    
        String status = (idade >= 18) ? "Maior de idade" : "Sou de menor";
        System.out.println(status);
    
    int dia = 2;
    
        switch (dia) {
            case 1:
            System.out.println("Primeiro Dia");
                break;
    
            case 2:
            System.out.println("Segundo dia");
                break;
    
            default:
            System.out.println("Dia não encontrado");
                break;
        }
    
    
    }
    }