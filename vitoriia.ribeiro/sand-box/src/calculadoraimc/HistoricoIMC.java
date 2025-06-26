import java.util.ArrayList;
import java.util.List;

public class HistoricoIMC {
    private List<Pessoa> registros = new ArrayList<>();

    public void adicionar(Pessoa p) {
        registros.add(p);
    }

    public List<Pessoa> getRegistros() {
        return registros;
    }
}

