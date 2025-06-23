package model.contract;

import java.util.List;
import model.RegistroIMC;

public interface IIMCController {
    void adicionarRegistro(String nome, double peso, double altura);
    void adicionarRegistroInfantil(String nome, double peso, double altura, int idadeMeses);
    List<RegistroIMC> getHistorico();
    List<RegistroIMC> getHistoricoInfantil();
}