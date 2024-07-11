import javax.swing.*;

public class Produto {
    //Alternativa a
    private String nome;
    private String descricao;
    private double preco;

    //Alternativa b
    public Produto(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = 0.0;
    }

    //Alternativa c
    //getter and setters


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
//Alternativa d
    public void aumentaPreco(double porcentagem) {
        if (porcentagem < 0) {
            System.out.println("Porcentagem inválida. O preço não será alterado.");
            return;
        }
        this.preco *= (1 + porcentagem / 100);
    }
//Alternativa e
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null,"Nome: " + getNome() + "\nDescrição: " + getDescricao() + "\nPreço: " + getPreco());
    }
}
