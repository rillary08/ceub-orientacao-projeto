package model.contract;

import java.util.List;
import model.IMCRecord;

public interface IIMCController {
    void adicionarRegistro(String nome, double peso, double altura);
    void adicionarRegistroInfantil(String nome, double peso, double altura, int idadeMeses);
    List<IMCRecord> getHistorico();
    List<IMCRecord> getHistoricoInfantil();
}