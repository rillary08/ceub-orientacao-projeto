import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class ExportadorCSV {
    public static void exportar(String caminho, List<Pessoa> registros) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
            for (Pessoa p : registros) {
                bw.write(p.getNome() + "," +
                         p.getPeso() + "," +
                         p.getAltura() + "," +
                         p.calcularIMC() + "," +
                         LocalDate.now() + "," +
                         p.getTipo());
                bw.newLine();
            }
            System.out.println("Exportado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

