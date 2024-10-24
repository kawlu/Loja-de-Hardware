package Catalogo;

public class Produto {
    private String nome;
    private String descricao;
    private float preco;
    private int estoque;
    private int quantidade;
    private float valorUnitario;

    public Produto(String nome, String descricao, float preco, int estoque, int quantidade, float valorUnitario) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public Produto(String nome, String descricao, float preco, int estoque, int quantidade) {
        this(nome, descricao, preco, estoque, quantidade, preco);
    }

    public Produto(String nome, String descricao, float preco, int estoque) {
        this(nome, descricao, preco, estoque, 1, preco);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float calcularValorTotal() {
        return valorUnitario * quantidade;
    }

    public double getValorTotal() {
        return this.calcularValorTotal();
    }
}
