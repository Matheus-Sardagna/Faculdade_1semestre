package Delivere;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private ArrayList<ItemPedido> itens;

    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public void adicionarItens(ItemPedido item) {
        if (itens.contains(item)) {
            System.out.println("Escolha outro item pois esse ja existe!!");
        } else {
            itens.add(item);
            System.out.println("Item foi adicionado!");
        }
    }
    public void removerItens(ItemPedido removItem) {
        if (itens.isEmpty()) {
            System.out.println("Esta vazio!!");
        } else if (!itens.contains(removItem)) {
            System.out.println("Esse item não existe");
        }else {
            itens.remove(removItem);
            System.out.println("Item foi removido!!");
        }
    }
    public ArrayList<ItemPedido> listarItens() {
        return itens;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido ").append(numero).append(":\n");
        for (ItemPedido item : itens) {
            sb.append("- ").append(item).append("\n");
        }
        return sb.toString();
    }
}

