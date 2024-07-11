package HerancaAnimais;

public class Animal {
    private String nome;
    private int qtdPatas;

    public Animal() {
        this.nome = "Nome";
        this.qtdPatas = 0;
    }

    public Animal(String nome) {
        this.nome = nome;
        this.qtdPatas = 0;
    }

    public Animal(String nome, int qtdPatas) {
        this.nome = nome;
        this.qtdPatas = qtdPatas;
    }

    //    -------------------------------------------------- Getters and  Setters -----------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
}
