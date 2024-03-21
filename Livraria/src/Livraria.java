import java.util.ArrayList;

public class Livraria {
    private ArrayList<Livro> livros = new ArrayList<>();

//    public Livraria() {
//        livros = new ArrayList<>();
//   }

    public void adcionarLivros(Livro livro) {
        livros.add(livro);
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


    public ArrayList<Livro> getLivros() {
        return livros;
    }


}