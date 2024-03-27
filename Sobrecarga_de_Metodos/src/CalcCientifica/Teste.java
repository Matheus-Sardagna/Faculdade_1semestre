package CalcCientifica;

import java.util.Scanner;

public class Teste {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraCientifica calculadora = new CalculadoraCientifica();

        System.out.println("========= Menu =========\n" +
                "(1) Potênciação\n" +
                "(2) Radiação\n" +
                "(3) Potência com outros tipos de valores\n" +
                "(4) Raiz com outro tipos de valores\n" +
                "Escolha a opção: ");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Escreva a base: ");
                double base = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Escreva o expoente: ");
                double expoente = scanner.nextDouble();


                System.out.println("Potência = " + calculadora.potenciacao(base,expoente));
                break;

            case 2:
                System.out.println("Escreva o radicando: ");
                double radicando = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Escreva o indice: ");
                double indice = scanner.nextDouble();


                System.out.println("Potência = " + calculadora.radiacao(radicando,indice));
                break;

            case 3:
                System.out.println("Tipos de números para a potência\n" +
                        "(1) Byte\n" +
                        "(2) String\n" +
                        "(3) Int/Double\n" +
                        "Escolha uma: " );
                int escolha2 = scanner.nextInt();

                if (escolha2 == 1) {
                    System.out.println("Escreva a base: ");
                    byte base1 = scanner.nextByte();
                    scanner.nextLine();

                    System.out.println("Escreva o expoente: ");
                    byte expoente1 = scanner.nextByte();

                    System.out.println("Potêcia do tipo byte: " + calculadora.pontencia(base1,expoente1));

                } else if (escolha2 == 2) {
                    System.out.println("Escreva a base: ");
                    String base1 = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Escreva o expoente: ");
                    String expoente1 = scanner.nextLine();

                    System.out.println("Potêcia do tipo String: " + calculadora.pontencia(base1,expoente1));

                } else if (escolha2 == 3) {
                    System.out.println("Escreva a base: ");
                    int base1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Escreva o expoente: ");
                    double expoente1 = scanner.nextDouble();

                    System.out.println("Potêcia do tipo Int/Double: " + calculadora.pontencia(base1,expoente1));

                } else {
                    System.out.println("Numero errado");
                }
                break;

            case 4:
                System.out.println("Tipos de números para a raiz\n" +
                        "(1) Int\n" +
                        "(2) Double\n" +
                        "(3) String\n" +
                        "Escolha uma: " );
                int escolha3 = scanner.nextInt();

                if (escolha3 == 1) {
                    System.out.println("Escreva a raiz em inteiro: ");
                    int raiz = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Raiz do tipo Int: " + calculadora.raiz(raiz));

                } else if (escolha3 == 2) {
                    System.out.println("Escreva a base: ");
                    Double raiz = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Raiz do tipo Double: " + calculadora.raiz(raiz));

                } else if (escolha3 == 3) {
                    System.out.println("Escreva a base: ");
                    String raiz = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Raiz do tipo String: " + calculadora.raiz(raiz));

                } else {
                    System.out.println("Numero errado");
                }
                break;

            default:
                System.out.println("Escolha uma opção certa!!!");
        }


    }
}
