package controller;

import java.util.ArrayList;
import java.util.List;
import model.RegistroIMC;

public class IMCController implements IIMCController {

    private List<RegistroIMC> historico = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, Double peso, Double altura) {
        // Fazer o registro
    }

    @Override
    public List<RegistroIMC> getHistorico() {
        // Fazer a consulta
        return null;
    }

}
