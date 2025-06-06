package controller;

import java.util.ArrayList;
import java.util.List;

import model.contract.IIMCController;

public class IMCController implements IIMCController {

    private List<RegistroIMC> historico = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, double peso, double altura) {
        //Você 
        
    }

    @Override
    public List<RegistroIMC> getHistorico() {
        return historico;
        
    }

}
