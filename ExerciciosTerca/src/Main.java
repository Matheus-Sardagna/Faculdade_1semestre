import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.modelo = JOptionPane.showInputDialog("Escreva o  modelo do carro: ");
        carro1.cor = JOptionPane.showInputDialog("Escreva a cor do carro: ");
        carro1.marca = JOptionPane.showInputDialog("Escreva a marca do carro: ");

        System.out.println("Cor do carro: " + carro1.cor + "\nO modelo do carro: " + carro1.modelo + "\nCor do carro:"+carro1.marca);
        carro1.acelerar();
        carro1.frear();
        carro1.view();

    }


}