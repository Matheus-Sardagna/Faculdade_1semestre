import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Menu========\n" +
                "(1) Adição 2 valores inteiros\n" +
                "(2) Subtração\n" +
                "(3) Multiplicação\n" +
                "(4) Divisão\n" +
                "(5) Exponenciação\n" +
                "(6) Fatorial\n" +
                "(7) Adição de 3 valores\n" +
                "(8) Adição de 2 valores texto\n" +
                "Escreva a sua opção: ");
        int tipo = scanner.nextInt();
        System.out.println("Digite o valor 1: ");
        int valor1 = scanner.nextInt();
        int valor2 = 0;
        if (tipo != 6) {
            System.out.println("Digite o valor 2: ");
            valor2 = scanner.nextInt();
        }
        scanner.close();

        switch (tipo) {
            case 1:
                System.out.println("Adição 2 valores inteiros = " + operacao.soma(valor1, valor2));
                break;

            case 2:
                operacao.setNmrMinuendo(valor1);
                operacao.setNmrSubtraendo(valor2);
                System.out.println("Subtração = " + operacao.subtracao());
                break;

            case 3:
                operacao.setNmrGenerico1(valor1);
                operacao.setNmrGenerico2((valor2));
                System.out.println("Multiplicação = " + operacao.multiplicacao());
                break;

            case 4:
                operacao.setNmrGenerico1(valor1);
                operacao.setNmrGenerico2(valor2);
                System.out.println("Divisão = " + operacao.divisao());
                break;

            case 5:
                operacao.setNmrGenerico1(valor1);
                operacao.setNmrGenerico2(valor2);
                System.out.println("Exponenciação = " + operacao.exponenciacao(valor1,valor2));
                break;

            case 6:
                //Manda para o método fatorial (set) ----> operacao.setNmrFatorial(valor1);
                operacao.setNmrFatorial(valor1);
                //Pega o valor lançado para exibir já fatorado -- > operacao.getNmrFatorial();
                System.out.println("Fatorial = " + operacao.getNmrFatorial());
                break;

            case 7:
                //Insere os valores direto no print
                System.out.println("Soma com 3 números: " + operacao.soma(valor1,valor2,78));

            case 8:
                //Insere direto os valores no print
                System.out.println("Soma de dois valores Texto: " + operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));

            default:
                System.out.println("Operação inválida");
        }


    }
}