import javax.swing.*;
import java.util.Scanner;

public class Gato {
    public Scanner scanner = new Scanner(System.in);
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

    public void alterarNome(String novoNome) {
        System.out.println("Escreva um novo nome para o gato: ");
        novoNome = scanner.nextLine();
        this.nome = novoNome;

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
