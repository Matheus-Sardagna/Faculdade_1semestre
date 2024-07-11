package Delivere;

public class ItemPedido {
    private String nome;
    private int quantidade;
    private  double precoUnitario;


    public ItemPedido (String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return quantidade + "x " + nome + " - R$" + String.format("%.2f", precoUnitario * quantidade);
    }
}
