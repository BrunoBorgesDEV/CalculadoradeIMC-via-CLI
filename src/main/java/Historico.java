import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<String> registros = new ArrayList<>();

    public void adicionar(String r) {
        registros.add(r);
    }

    public void exibir() {
        if (registros.isEmpty()) {
            System.out.println("Nenhum cálculo registrado.");
            return;
        }
        for (String r : registros) {
            System.out.println(" -> " + r);
        }
    }
}