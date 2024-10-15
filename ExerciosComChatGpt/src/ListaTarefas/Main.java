package ListaTarefas;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = null;
        int escolha = 10;
        while (escolha != 0) {
            escolha = Integer.parseInt(showInputDialog(null, " ============Menu============ \n" +
                    " (1) Adicionar tarefa \n" +
                    " (2) Listar tarefa \n" +
                    " (0) Sair "));

            switch (escolha) {
                case 1:
                    String nome = showInputDialog(null, "Qual o nome da tarefa: ");
                    String data = showInputDialog(null, "Qual a data da tarefa: ");
                    int opcao = JOptionPane.showConfirmDialog(null, "A tarefa está feita?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (opcao == JOptionPane.YES_OPTION) {
                        boolean statusLista = true;
                        listaTarefa = new ListaTarefa(nome, data, statusLista);
                    } else {
                        boolean statusLista = false;
                        listaTarefa = new ListaTarefa(nome, data, statusLista);
                    }
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    listaTarefa.listarTarefa();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
