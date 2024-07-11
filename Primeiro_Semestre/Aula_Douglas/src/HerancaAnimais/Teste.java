package HerancaAnimais;

import java.util.Scanner;

public class Teste {
    public static void main(String args[]) {
        Cachorro cachorro = new Cachorro("sadal");
        Gato gato = new Gato("rex");
        Papagaio papagaio = new Papagaio(true, "cleber");
        Lagarto lagarto = new Lagarto(false, "Lartin");



        System.out.println("Nome do Papagaio: " + papagaio.getNome());
        System.out.println("Quantidade de Patas do papagaio: " + papagaio.getQtdPatas());
        System.out.println("Quantidade  de Ovos do papagaio: " + papagaio.getQtdOvos());
        if (papagaio.isPena() == true) {
            System.out.println("O papagaio tem pena!!!");
        }

        System.out.println("Nome do Papagaio: " + lagarto.getNome());
        System.out.println("Quantidade de Patas do papagaio: " + lagarto.getQtdPatas());
        System.out.println("Quantidade  de Ovos do papagaio: " + lagarto.getQtdOvos());
        if (papagaio.isPena() == false) {
            System.out.println("O papagaio tem pena!!!");
        }


        System.out.println("Nome do gato: " + gato.getNome());
        System.out.println("Quantidade  de Patas: " + gato.getQtdPatas());

        System.out.println("Nome do Cahorro: " + cachorro.getNome());
        System.out.println("Quantidade  de Patas: " + cachorro.getQtdPatas());

    }
}

