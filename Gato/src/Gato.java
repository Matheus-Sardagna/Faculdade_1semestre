import javax.swing.*;
import java.util.ArrayList;

public class Gato {

    private ArrayList<Gato> gatos;
    public String nome;
    private int idade;
    private String raca;

    private boolean vacinado;

    public Gato(){
        gatos = new ArrayList<>();
    }

    public void adotarGatos(Gato gato) {
        gatos.add(gato);
    }

    public void vacinarGato(String nome) {
       for (Gato gato : gatos) {
           if (gato.getNome().equals(nome)) {
               System.out.println("Gato Vacinado");
               gato.vacinado = true;
               break;
           }else {
               System.out.println("");
           }

       }

    }

    public void miar() {
        String miando = JOptionPane.showInputDialog(null, "Se ele está miando escreva (1), Caso não esteja digite (2)");
        if (miando == "1") {
            System.out.println("Gato esta miando!!");
        } else {
            System.out.println("Gato não esta miando!!");

        }

    }

    public void idadeHumana() {
        int idadeHuman = this.idade * 12;
        System.out.println("A idade humanda do gato é: " + idadeHuman);

    }


    //Getters and Setter
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }



    public void se(boolean vacinado) {
        this.vacinado = vacinado;
    }
}
