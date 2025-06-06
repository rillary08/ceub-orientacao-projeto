package model.contract;

import java.util.List;

public interface IIMCController {
    void adicionarRegistro(String nome, double peso, double altura);
    List<String> getHistorico();
}
