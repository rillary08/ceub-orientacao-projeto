import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sobreposicao {

    // Polimorfismo do tipo OVERLOAD

    // Seguindo um dos princípios SOLID
    // public static void exibirDadosInternetRepouso(Dispositivo celular){
    //     celular.acessarInternet();
    //     celular.entrarModoEconomiaEnergia();
    // }

    public static void exibirDadosInternetRepouso(Dispositivo dispositivo){
        dispositivo.acessarInternet();
        dispositivo.entrarModoEconomiaEnergia();
    }
    public static void main(String[] args) {

        // Um possível polimorfismo paramétrico, mas não foi abordado em aula
        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Celular());
        dispositivos.add(new RoboAspirador());
        dispositivos.add(new VideoGame());
        Collections.shuffle(dispositivos);

        for(Dispositivo d : dispositivos){
            exibirDadosInternetRepouso(d);
        }

        // Segunda parte
        System.out.println("");
        System.out.println("[--- Segunda Parte ---]");
        System.out.println("");

        RoboAspirador robo = new RoboAspirador();
        RoboIRoomba roboIRoomba = new RoboIRoomba();

        robo.aspirar();
        roboIRoomba.aspirar();

    }
}

abstract class Dispositivo{
    protected Double porcentagemBateria;

    // Métodos que serão sobreescritos (sobreposição)
    public abstract void acessarInternet();
    public abstract void entrarModoEconomiaEnergia();
}

class Celular extends Dispositivo{

    public void acessarAplicacao(){
        System.out.println("Abrindo APP");
    }

    // Métodos que estão sendo sobreescritos
    @Override
    public void acessarInternet() {
        System.out.println("Acessando internet via 4g");
    }

    // Métodos que estão sendo sobreescritos
    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Diminuir o brilho da tela");
    }

}

class VideoGame extends Dispositivo{

    public void iniciarJogo(){
        System.out.println("iniciando jogo");
    }

    // Métodos que estão sendo sobreescritos
    @Override
    public void acessarInternet() {
        System.out.println("Iniciando conexão via RJ45");
    }

    // Métodos que estão sendo sobreescritos
    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Aviso: Controle com bateria baixa");
    }
}

class RoboAspirador extends Dispositivo {

    public void aspirar(){
        System.out.println("MOH CHEIRADÃO NO PÓ");
    }

    // Métodos que estão sendo sobreescritos
    @Override
    public void acessarInternet() {
        System.out.println("Iniciar com o WIFI");
    }

    // Métodos que estão sendo sobreescritos
    @Override
    public void entrarModoEconomiaEnergia() {
        System.out.println("Retorna para a Base");
    }

}

class RoboMondial extends RoboAspirador{
    // Comportamento padrão herdado do RoboAspirador
}

// Exemplo de Sobrecarga
class RoboIRoomba extends RoboAspirador{

    @Override
    public void aspirar() {
        System.out.println("Mapeando a casa");
        super.aspirar();
    }
}