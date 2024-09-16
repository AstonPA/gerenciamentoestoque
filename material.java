public class Material {
    private String nome;
    private int quantidade;
    private String codigo;

    public Material(String nome, int quantidade, String codigo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente para remover.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Material [nome=" + nome + ", quantidade=" + quantidade + ", codigo=" + codigo + "]";
    }
}
