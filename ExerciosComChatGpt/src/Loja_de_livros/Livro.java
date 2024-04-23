package Loja_de_livros;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private double preco;

    public Livro(int id, String titulo, String autor, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
