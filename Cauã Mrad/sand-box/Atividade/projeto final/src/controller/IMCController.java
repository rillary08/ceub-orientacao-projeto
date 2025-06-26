package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.RegistroIMC;
import model.contract.IIMCController;

public class IMCController implements IIMCController {

    private List<RegistroIMC> historico = new ArrayList<>();

    @Override
    public void adicionarRegistro(String nome, double peso, double altura) {
        RegistroIMC registro = new RegistroIMC(altura, nome, peso);
        registro.calcularIMC();
        registro.classificarIMC();
        historico.add(registro);
    }

    @Override
    public List<RegistroIMC> getHistorico() {
        return historico;
    }

    @Override
    public void exportarHistorico(String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (RegistroIMC registro : historico) {
                writer.write(String.format("%s,%.2f,%.2f,%.2f,%s,adulto\n",
                        registro.getNome(),
                        registro.getPeso(),
                        registro.getAltura(),
                        registro.calcularIMC(),
                        java.time.LocalDate.now()));
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}