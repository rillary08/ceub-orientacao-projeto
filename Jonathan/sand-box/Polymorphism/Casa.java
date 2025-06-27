import java.util.ArrayList;
import java.util.List;
public class Casa {

    public static void exibirDadosInternetRepouso(Dispositivo dispositivo){
        dispositivo.acessarInternet();
        dispositivo.entrarModoEconomiaEnergia();
    }

    public static void main(String[] args) {

        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Celular());
        dispositivos.add(new RoboAspirador());
        dispositivos.add(new VideoGame());
        Collection.shuffle(dispositivos);

        for(Dispositivo d : dispositivos){
            exibirDadosInternetRepouso(d);
        }

        // Segunda parte
        RoboAspirador robo = new RoboAspirador();
        RoboIRoomba RoboIRoomba = new RoboIRoomba();

        robo.aspirar();
        RoboIRoomba.aspirar();

    }

}




abstract class Dispositivo {

    protected Double porcentagemBateria;

    public abstract void acessarInternet();
    public abstract void entrarModoEconomiaEnergia();
    
}




class Celular extends Dispositivo {

    public void acessarAplicacao() {
        System.out.println("Abrir APP");       
    }

    @Override
    public void acessarInternet() {
        System.out.println("Criando conexão 4G");       
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Diminuir brilho da tela."); 
    }
    
}




class VideoGame extends Dispositivo {

    public void executarJogo() {
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




class RoboAspirador extends Dispositivo {

    public void aspirar() {
        System.out.println("Iniciando aspiração de pó");
    }

    @Override
    public void acessarInternet() {
        System.out.println("Iniciando com WIFI");       
    }

    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Retornar para a base"); 
    }
    
}




class RoboMondial extends RoboAspirador {

}

class RoboIRoomba extends Eispositivo {

    @Override
    public void aspirar() {
        System.out.println("Mapeando a casa");
        super.aspirar();
    }
}






