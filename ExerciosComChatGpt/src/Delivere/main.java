package Delivere;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido(1);

        int opcao;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Adicionar Item ao Pedido");
            System.out.println("2. Remover Item do Pedido");
            System.out.println("3. Listar Itens do Pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nomeItem = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço unitário: ");
                    double precoUnitario = scanner.nextDouble();
                    scanner.nextLine();
                    ItemPedido novoItem = new ItemPedido(nomeItem, quantidade, precoUnitario);
                    pedido.adicionarItens(novoItem);
                    break;
                case 2:
                    System.out.print("Nome do item a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    ItemPedido itemRemover = null;

                    for (ItemPedido item : pedido.listarItens()) {
                        if (item.getNome().equalsIgnoreCase(nomeRemover)) {
                            itemRemover = item;
                            break;
                        }
                    }
                    if (itemRemover != null) {
                        pedido.removerItens(itemRemover);
                    } else {
                        System.out.println("Item não encontrado no pedido.");
                    }
                    break;
                case 3:
                    System.out.println(pedido);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
