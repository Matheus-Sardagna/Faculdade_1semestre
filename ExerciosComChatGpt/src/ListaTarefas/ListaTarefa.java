package ListaTarefas;

import javax.swing.*;
import java.util.ArrayList;

public class ListaTarefa {
    private String nomeTarefa;
    private String dataTarefa;
    private boolean status;
    private ArrayList<ListaTarefa> tarefas = new ArrayList<>();

    public ListaTarefa(String nomeTarefa, String dataTarefa, boolean status) {
        this.nomeTarefa = nomeTarefa;
        this.dataTarefa = dataTarefa;
        this.status = status;

    }

  public void adicionarTarefa(String nomeTarefa, String dataTarefa, boolean status) {
        ListaTarefa tarefa = new ListaTarefa(nomeTarefa, dataTarefa, status);
        tarefas.add(tarefa);
   }

    public void listarTarefa() {
        if (tarefas != null) {
            for (ListaTarefa tarefa : tarefas) {
                if (tarefa.isStatus()) {
                    JOptionPane.showMessageDialog(null,"NOME: " +
                            tarefa.getNomeTarefa() +
                            "\nDATA :" +
                            tarefa.getDataTarefa()+
                            "\nSTATUS: Tarefa feita");
                }else {
                    JOptionPane.showMessageDialog(null,"NOME: " +
                            tarefa.getNomeTarefa() +
                            "\nDATA :" +
                            tarefa.getDataTarefa()+
                            "\nSTATUS: Não foi feita");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há tarefas para listar.");
        }
    }
    public void editarTarefa() {
        if (tarefas != null) {
            for (ListaTarefa tarefa : tarefas) {
                String nomeTarefa = JOptionPane.showInputDialog(null, "Nome da tarefa");
                if (tarefa.getNomeTarefa().equals(nomeTarefa)) {
                    String dataTarefa = JOptionPane.showInputDialog(null, "Data da tarefa");
                    boolean status = JOptionPane.showConfirmDialog(null, "Tarefa feita?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    tarefa.setDataTarefa(dataTarefa);
                    tarefa.setStatus(status);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há tarefas para editar.");
        }
    }

    public void deletarTarefa(String nomeTarefa) {
        for (int i = 0; i < tarefas.size(); i++) {
            ListaTarefa tarefa = tarefas.get(i);
            if (tarefa.getNomeTarefa().equals(nomeTarefa)) {
                tarefas.remove(tarefa);
            }

        }
    }

    public String getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(String dataTarefa) {
        this.dataTarefa = dataTarefa;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
