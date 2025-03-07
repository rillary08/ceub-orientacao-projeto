import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Java8Features {

public static void main(String[] args) {
    
List<Integer> idades = Arrays.asList(1,2,3);

List<String> idadesStrings = idades.stream()
.map(idade -> idade.toString())
.collect(Collectors.tolist());


LocalDate hoje = LocalDate.now();
System.out.println("data de hoje" + hoje.format(
    DateTimeFormatter.ofPattern("dd/mm/yyyy")));



    
}





}
