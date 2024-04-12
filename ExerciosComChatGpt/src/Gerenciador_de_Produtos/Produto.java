package Gerenciador_de_Produtos;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private  int QtdEstoque;


    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.QtdEstoque = qtdEstoque;

    }
    
    public void calcularValorEstoque() {
         double valor =  preco * QtdEstoque;
        System.out.println("Valor total do estoque: " + valor);
    }


//---------------------------------------------- GETTERS AND SETTERS -------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstoque() {
        return QtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        QtdEstoque = qtdEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
