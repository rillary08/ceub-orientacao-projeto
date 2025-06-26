package controller;

import java.util.ArrayList;
import java.util.List;

import model.IMCRecord;
import model.contract.IIMCController;

public class IMCController implements IIMCController {

    private final List<IMCRecord> historicoAdulto   = new ArrayList<>();
    private final List<IMCRecord> historicoInfantil = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, double peso, double altura) {
        IMCRecord registro = new IMCRecord(nome, peso, altura);
        historicoAdulto.add(registro);
    }

    @Override
    public void adicionarRegistroInfantil(String nome, double peso, double altura, int idadeMeses) {

        String nomeFormatado = String.format("%s (Bebê - %d meses)", nome, idadeMeses);
        IMCRecord registro = new IMCRecord(nomeFormatado, peso, altura);
        historicoInfantil.add(registro);
    }

    @Override
    public List<IMCRecord> getHistorico() {
        return historicoAdulto;
    }

    @Override
    public List<IMCRecord> getHistoricoInfantil() {
        return historicoInfantil;
    }
}