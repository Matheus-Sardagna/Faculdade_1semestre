package ListaTarefas;

import javax.swing.*;
import java.util.ArrayList;

public class ListaTarefa {
    private String nomeTarefa;
    private String dataTarefa;
    private boolean status;
    private ArrayList< ListaTarefa> tarefas = new ArrayList<>();

    public ListaTarefa(String nomeTarefa, String dataTarefa, boolean status) {
        this.nomeTarefa = nomeTarefa;
        this.dataTarefa = dataTarefa;
        this.status = status;
    }

//    public void adicionarTarefa(String nomeTarefa, String dataTarefa, boolean status) {
//        tarefas.add(new ListaTarefa(nomeTarefa, dataTarefa, status));
//    } amanha termino


    public void listarTarefa() {
        if (isStatus()) {
            JOptionPane.showMessageDialog(null,"NOME: " +
                    getNomeTarefa() +
                    "\nDATA :" +
                    getDataTarefa()+
                    "\nSTATUS: Tarefa feita");
        }else {
            JOptionPane.showMessageDialog(null,"NOME: " +
                    getNomeTarefa() +
                    "\nDATA :" +
                    getDataTarefa()+
                    "STATUS: Não foi feita");
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
