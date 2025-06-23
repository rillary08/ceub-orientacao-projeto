package controller;

import java.util.ArrayList;
import java.util.List;

import model.RegistroIMC;
import model.contract.IIMCController;

public class IMCController implements IIMCController {

    private final List<RegistroIMC> historicoAdulto   = new ArrayList<>();
    private final List<RegistroIMC> historicoInfantil = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, double peso, double altura) {
        RegistroIMC registro = new RegistroIMC(nome, peso, altura);
        historicoAdulto.add(registro);
    }

    @Override
    public void adicionarRegistroInfantil(String nome, double peso, double altura, int idadeMeses) {
        // Se tiver classe específica RegistroIMCInfantil, instancie-a aqui
        String nomeFormatado = String.format("%s (Bebê - %d meses)", nome, idadeMeses);
        RegistroIMC registro = new RegistroIMC(nomeFormatado, peso, altura);
        historicoInfantil.add(registro);
    }

    @Override
    public List<RegistroIMC> getHistorico() {
        return historicoAdulto;
    }

    @Override
    public List<RegistroIMC> getHistoricoInfantil() {
        return historicoInfantil;
    }
}