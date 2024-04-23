package Loja_de_livros;

public class Main {
    public static void main (String args[]) {
        // Criando uma instância da loja de livros
        LojaLivro lojaLivro = new LojaLivro();

        // Criando alguns livros
        Livro livro1 = new Livro(1, "Dom Quixote", "Miguel de Cervantes", 29.99);
        Livro livro2 = new Livro(2, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 19.99);
        Livro livro3 = new Livro(3, "A Arte da Guerra", "Sun Tzu", 14.99);

        // Adicionando os livros à loja
        lojaLivro.adicionarLivros(livro1);
        lojaLivro.adicionarLivros(livro2);
        lojaLivro.adicionarLivros(livro3);

        // Listando os livros disponíveis na loja
        lojaLivro.listarLivro();
    }
}
