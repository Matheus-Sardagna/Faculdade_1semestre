import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.nome = JOptionPane.showInputDialog(null,"Escreva o nome do gato: ");
        gato.idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva a idade do gato: "));
        gato.raca = JOptionPane.showInputDialog(null,"Escreva a raca do gato: ");

        gato.alterarNome(gato.nome);
        gato.comer();
        gato.miar();
        gato.idadeHumana();
        gato.view();

    }
}