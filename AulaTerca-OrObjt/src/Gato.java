import javax.swing.*;

public class Gato {
    String nome;
    int idade;
    String raca;

    public void miar() {
        int miando = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva: \n(1) se ele estiver miando, \n(2) se ele não estiver miando  : "));


            if (miando == 1) {
                System.out.println("O gato está miando!!!");

            } else if (miando == 2) {
                System.out.println("o gato não esta miando!!");
            }else {
                System.out.println("Não exite essa opção");
            }

    }

    public void comer() {
        int comendo = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva: \n(1) se ele estiver miando, \n(2) se ele não estiver miando: "));

                if (comendo == 1) {
                    System.out.println("O gato esta comendo!!!");

                } else if (comendo == 2) {
                    System.out.println("o gato não esta comendo!!!");

                } else {
                    System.out.println("Escreva uma das opções certa!!");
                    return;
                }
    }



    public void idadeHumana() {
        int idadeHuman = this.idade * 12;
        System.out.println("A idade do gato em anos humanos: " + idadeHuman);
    }

    public void view(){
        System.out.println("O nome do gato: " + this.nome + "\nIdade do gato: " + this.idade + "\nRaça do gato: " + this.raca);
    }
}
