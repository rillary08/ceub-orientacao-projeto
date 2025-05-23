import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void exibirDadosInternetRepouso(Dispositivo dispositivo){
        dispositivo.acessarInternet();
        dispositivo.entrarModoEconomiaEnergia();

    }
    public static void main(String[] args) throws Exception {

       
        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Celular());
        dispositivos.add(new RoboAspirador());
        dispositivos.add(new VideoGame());

      Collections.shuffle(dispositivos);

        for(Dispositivo d : dispositivos) {

// 1° exemplo de polimorfismo, mesmo método, objetivos diferentes, comportamentos diferentes
// Isso resulta em polimorfismo na prática
            exibirDadosInternetRepouso(d);
        }
// 2° parte exemplo overide
        RoboAspirador robo = new RoboAspirador();
        RoboIroomba roboIroomba = new RoboIroomba();

        robo.aspirar(); //aspirar normal
        roboIroomba. aspirar(); // aspirar normal + mapear a casa

    }
}

abstract class Dispositivo {

    protected Double porcentagemBateria;
    public abstract void acessarInternet();
    public abstract void entrarModoEconomiaEnergia();

}

class Celular extends Dispositivo{

public void realizarLigacao(){
    System.out.println("Realizando Ligação");
}
    @Override
    public void acessarInternet() {
        System.out.println("Criando conexão 4G");
        
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Diminuir o brilho da tela");
    }

}

class VideoGame extends Dispositivo{

public void executarJogo(){
        System.out.println("Executar Jogo");
    }
    @Override
    public void acessarInternet() {
        System.out.println("Iniciando conexão com RJ45");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Desliga o controle");
    }
    
}

class RoboAspirador extends Dispositivo{

public void aspirar() {
    System.out.println("Iniciando aspiração de pó");
}
    @Override
    public void acessarInternet() {
       System.out.println("Iniciar conexão com Wi-fi");
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Retorna para a base");
    }
    
}

class RoboMondial extends RoboAspirador{
    // comportamento padrão herdado de RoboAspirador
}

class RoboIroomba extends RoboAspirador{

    @Override
    public void aspirar() {
        System.out.println("Mapeando a casa");
        super.aspirar();
    }

}
