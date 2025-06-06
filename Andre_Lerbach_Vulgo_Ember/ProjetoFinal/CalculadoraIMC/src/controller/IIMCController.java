package controller;

import java.util.List;
import model.RegistroIMC;

public interface IIMCController {
    void adicionarRegistro(String nome, Double peso, Double altura);
    List<RegistroIMC> getHistorico();
}
