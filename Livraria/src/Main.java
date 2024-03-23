import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;


        while (opcao != 4) {

            System.out.println("========= Menu =========");
            System.out.println("(1) Adicionar Livro ");
            System.out.println("(2) Remover Livro");
            System.out.println("(3) Buscar livro");
            System.out.println("(4) Para sair"); // 5 para sair -->  amanha vou tentar
//      System.out.println("(4) Editar livro");  --> Irei fazer amanha pois nao tenho tempo hj :(
            System.out.println("Escreva sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Escreva o nome do titulo do livro: ");
                    String titulo = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Escreva o nome do autor: ");
                    String autor = scanner.nextLine();

                    System.out.println("Escreva a quantidade de páginas do livro: ");
                    int qtdPaginas = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Escreva o genero do livro: ");
                    String genero = scanner.nextLine();

                    livraria.adcionarLivros(titulo,autor,qtdPaginas,genero);
                    break;


                case 2:
                    System.out.println("Escreva o nome do título: ");
                    titulo = scanner.nextLine();
                    scanner.nextLine();
                    livraria.removerLivros(titulo);

                    break;

                case 3:
                    System.out.println("Escreva o nome do Livro que queira buscar: ");
                    titulo = scanner.nextLine();
                    scanner.nextLine();
                    Livro livroBuscado = livraria.buscarLivros(titulo);
                    for (Livro livro : livraria.getLivros()) {
                        if (livroBuscado != null) {
                            System.out.println("Título: " + livro.getTitulo() + "\nAutor: " + livro.getAutor() + "\nGenêro: " + livro.getGenero() + "\nQuantidade de páginas: " + livro.getQtdPaginas());
                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("vazando");
                    return;
                default:
                    System.out.println("Opçao errada");
            }
        }




    }
}