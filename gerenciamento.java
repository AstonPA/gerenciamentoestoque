import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gerenciamento {
    private Map<String, Material> materiais = new HashMap<>();
    private List<Registro> historico = new ArrayList<>();

    public void adicionarMaterial(Material material) {
        materiais.put(material.getCodigo(), material);
    }

    public void registrarEntrada(String codigo, int quantidade) {
        Material material = materiais.get(codigo);
        if (material != null) {
            material.adicionarQuantidade(quantidade);
            Registro registro = new Registro(LocalData.now(), "Entrada", quantidade, material);
            historico.add(registro);
        } else {
            System.out.println("Material não encontrado.");
        }
    }

    public void registrarSaida(String codigo, int quantidade) {
        Material material = materiais.get(codigo);
        if (material != null) {
            material.removerQuantidade(quantidade);
            Registro registro = new Registro(LocalDate.now(), "Saída", quantidade, material);
            historico.add(registro);
        } else {
            System.out.println("Material não encontrado.");
        }
    }

    public void consultarEstoque() {
        for (Material material : materiais.values()) {
            System.out.println(material);
        }
    }

    public void mostrarHistorico() {
        for (Registro registro : historico) {
            System.out.println(registro);
        }
    }
}
