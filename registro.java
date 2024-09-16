import java.time.LocalDate;

public class Registro {
    private LocalDate data;
    private String tipo; // Entrada ou Saída
    private int quantidade;
    private Material material;

    public Registro(LocalDate data, String tipo, int quantidade, Material material) {
        this.data = data;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Registro [data=" + data + ", tipo=" + tipo + ", quantidade=" + quantidade + ", material=" + material + "]";
    }
}
