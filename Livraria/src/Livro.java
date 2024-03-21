public class Livro {
    private String titulo;
    private String autor;
    private int qtdPaginas;
    private String genero;

    public Livro(String titulo, String autor, int qtdPaginas, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public String getGenero() {
        return genero;
    }
//Criar uma metodo de criar um livro
}
