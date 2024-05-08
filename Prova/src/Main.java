import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Escreva o nome do produto: ");
        String descricao = JOptionPane.showInputDialog(null,"Escreva a descrição do produto");

        Produto p1 = new Produto(nome,descricao);

        double novoPreco = -2;

        while (novoPreco != 0) {
            novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite um preço para o produto(0 pra sair):"));
            if (novoPreco != 0 && (p1.getPreco() == 0 || novoPreco < p1.getPreco())) {
                p1.setPreco(novoPreco);
            }
        }
        p1.aumentaPreco(2);
        p1.mostrarDados();
    }
}