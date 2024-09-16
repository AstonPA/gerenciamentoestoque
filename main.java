import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaGerenciamento sistema = new SistemaGerenciamento();

        // Adicionar materiais
        Material sabao = new Material("Sabão", 50, "S001");
        Material desinfetante = new Material("Desinfetante", 30, "D001");

        sistema.adicionarMaterial(sabao);
        sistema.adicionarMaterial(desinfetante);

        // Registrar entradas
        sistema.registrarEntrada("S001", 20);
        sistema.registrarEntrada("D001", 15);

        // Registrar saídas
        sistema.registrarSaida("S001", 10);
        sistema.registrarSaida("D001", 5);

        // Consultar estoque
        System.out.println("Estoque Atual:");
        sistema.consultarEstoque();

        // Mostrar histórico
        System.out.println("\nHistórico:");
        sistema.mostrarHistorico();
    }
}
