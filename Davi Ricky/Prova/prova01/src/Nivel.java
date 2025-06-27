// Classe nivel que vai ser associada ao aluno
public class Nivel{

    // variável
    public String nivel;

    // construtor
    public Nivel(String nivel){
        this.nivel = "Iniciante";
    }

    // Só o getter, pq não precisamos de setters
    public String getNivel() {
        return nivel;
    }

    public String toString(){
        return getNivel();
    }
}
