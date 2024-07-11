package Forma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Forma[] objetos = new Forma[2];

        for (int i = 0; i < objetos.length;i++ ) {
            objetos[i] = new Quadrado(5,10);
        }

        for (int i = 0; i < objetos.length; i++) {
            objetos[i].calcularArea();

        }
    }
}