import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
    private ArrayList<Livro> livros = new ArrayList<>();

    public Scanner scanner = new Scanner(System.in);

//    public Livraria() {
//        livros = new ArrayList<>();
//   }

    public void adcionarLivros(String titulo, String autor, int qtdPaginas, String genero ) {
        Livro novoLivro = new Livro(titulo, autor,qtdPaginas, genero);
        livros.add(novoLivro);
    }

    public void removerLivros(String titulo) {
        for (int i = 0; i < livros.size(); i++){
            if(livros.get(i).getTitulo().equals(titulo)){
                livros.remove(i);
                break;
            }
        }
    }



    public Livro buscarLivros(String titulo) {
        for (Livro livro: livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }


    public void editarLivro(String titulo) {
        Livro livro = buscarLivros(titulo);
        if (livro != null) {
            System.out.println("Novo título:");
            String novoTitulo = scanner.nextLine();
            System.out.println("Novo autor:");
            String novoAutor = scanner.nextLine();
            System.out.println("Nova quantidade de páginas:");
            int novaQtdPaginas = Integer.parseInt(scanner.nextLine());
            System.out.println("Novo gênero:");
            String novoGenero = scanner.nextLine();

            livro.setTitulo(novoTitulo);
            livro.setAutor(novoAutor);
            livro.setQtdPaginas(novaQtdPaginas);
            livro.setGenero(novoGenero);

            System.out.println("Livro editado com sucesso.");

        }
    }
    public ArrayList<Livro> getLivros() {
        return livros;
    }


}