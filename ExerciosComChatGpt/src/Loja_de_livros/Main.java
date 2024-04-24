package Loja_de_livros;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // Criando uma instância da loja de livros
        LojaLivro lojaLivro = new LojaLivro();
        Livro livro;
        Cliente cliente;
        Scanner scanner = new Scanner(System.in);
        int opcao = 10;
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            System.out.println("============Menu===========\n" +
                    "(1) Adicionar livro\n" +
                    "(2) Adicionar cliente\n" +
                    "(3) Lista de livros\n" +
                    "(0) Sair" +
                    "Escolha: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                int id = random.nextInt();
                System.out.println("Escreva o título do livro: ");
                scanner.nextLine();
                String titulo = scanner.nextLine();

                System.out.println("Escreva o nome do autor do livro: ");
                String autor = scanner.nextLine();

                System.out.println("Escreva o valor do livro: ");
                double preco = scanner.nextDouble();

                livro = new Livro(id, titulo, autor, preco);
                lojaLivro.adicionarLivros(livro);
            } else if (opcao == 2) {
                int id = random.nextInt();
                System.out.println("Escreva o nome: ");
                scanner.nextLine();
                String nome = scanner.nextLine();

                System.out.println("Escreva o email do cliente: ");
                String email = scanner.nextLine();


                cliente = new Cliente(id,nome,email);
                lojaLivro.adicionarCliente(cliente);
            } else if (opcao == 3) {
                lojaLivro.listarLivro();
            }

        }

    }
}
