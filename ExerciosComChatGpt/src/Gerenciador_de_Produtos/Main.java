package Gerenciador_de_Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto;
        int opcao = 10000;
        while (opcao != 0) {
            System.out.println("=======Menu=======\n" +
                    "(1) Adicionar produto\n" +
                    "(2) Remover produtos\n" +
                    "(3) Exibir produtos\n" +
                    "(4) Calcular o valor do estoque\n" +
                    "(0) Sair\n" +
                    "Escreva a sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escreva o nome do produto: ");
                    scanner.nextLine();

                    String nome = scanner.nextLine();

                    System.out.println("Escreva o preço do produto: ");
                    double preco = scanner.nextDouble();

                    System.out.println("Escreva a quantidade do produto: ");
                    int qtdProduto = scanner.nextInt();

                    produto = new Produto(nome, preco, qtdProduto);
                    produtos.add(produto);
                    break;

                case 2:
                    System.out.println("Escreva o nome do produto que quer remover:");
                    String nomeP = scanner.nextLine();

                    scanner.nextLine();

                    for (Produto p : produtos)
                        if (p.getNome().equalsIgnoreCase(nomeP)){
                            produtos.remove(p);
                            System.out.println("Produto Removido!!");
                            break;
                        }
                    break;

                case 4:
                    for (Produto p : produtos) {
                        p.calcularValorEstoque();
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Lista de produtos:");
                    for (Produto p : produtos) {
                        System.out.println(p.getNome()
                                + ":"
                                + "\n - Preço: "
                                + p.getPreco()
                                + "\n - Quantidade: "
                                + p.getQtdEstoque());
                    }
                    break;
                case 0:

                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
