import javax.swing.JOptionPane;
import java.util.*;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
//        ex10();
//        ex11();
//        ex12();
//        ex14();
//        ex15();
//        ex16();
    }
    public static void ex3() {
        //3. Ler um número e verificar se ele é par ou ímpar
        System.out.println("Escreva um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!!" + numero);
        }else {
            System.out.println("O número é ímpar!!");
        }
//        int nmrDigitado;
//        nmrDigitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva um número para "));
//
//        System.out.println(nmrDigitado % 2 == 0 ? "Sim o número é par!!" + nmrDigitado : "Não, o número é ímpar!!" + nmrDigitado);
    }

    public static void ex4() {
//        4.Tendo como dados de entrada a altura (h) e o sexo de uma pessoa (um caracter m ou f),
//        construir um programa que calcula seu peso ideal, utilizando as seguintes fórmulas:
//        Para homens: (72.7*h) - 58
//        Para mulheres: (62.1*h) - 44.7

        System.out.println("Escreva seu sexo: --> (M)masculino // (F)feminino: ");
        String sexo = scanner.nextLine();

        System.out.println("Escreva a sua altura atual: ");
        double altura = scanner.nextDouble();

        if (sexo == "M") {
            double calc =  (72.7* altura) - 58;
            System.out.println("O seu peso ideal é: " + calc);
        } else if (sexo == "F") {
            double calc =  (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é: " + calc);
        }else {
            System.out.println("Não exite essa opção!!");
        }


//        Outra forma:
//        String sexo;
//        double calculoM;
//        double calculoF;
//
//        System.out.println("Escreva o seu sexo --> (M)masculino // (F)feminino: ");
//        sexo = scanner.nextLine();
//
//        System.out.println("Escreva a sua altura: ");
//        double altura = scanner.nextDouble();
//
//
//
//        calculoM =  (72.7 * altura) - 58;
//        calculoF = (62.1 * altura) - 44.7;
//
////        sexo = String.parseString(JOptionPane.showInputDialog("")); ---> Dúvida
//        System.out.println( sexo == "M" ? "O peso ideal é: " +  calculoM : "O Peso ideal é: " + calculoF);
    }
    public static void ex5() {

//        5.Fazer um programa que recebe três números inteiros, calcula e mostra a soma desses
//        números.

        System.out.println("Escreva o primeiro número: ");
        int nmr1 = scanner.nextInt();

        System.out.println("Escreva o segundo número: \n");
        int nmr2 = scanner.nextInt();

        System.out.println("Escreva o terceiro número: \n");
        int nmr3 = scanner.nextInt();

        int calc = nmr1 + nmr2 + nmr3;
        System.out.println("O números somados são: " + calc);
    }

    public static void ex6() {
//        6. Fazer um programa que recebe três notas, calcula e mostra a média aritmética dessas notas.

        System.out.println("Escreva o primeira nota: ");
        double nmr1 = scanner.nextInt();

        System.out.println("Escreva o segunda nota: \n");
        double nmr2 = scanner.nextInt();

        System.out.println("Escreva o terceira nota: \n");
        double nmr3 = scanner.nextInt();

        double calc = nmr1 + nmr2 + nmr3 / 3;
        System.out.println("A média é: " + calc);
    }

    public static void ex7() {
//        7. Fazer um programa que calcula e mostra a área de um triângulo, sabendo que:
//        área = (base * altura) / 2.
        System.out.println("Escreva a base: ");
        double base = scanner.nextDouble();

        System.out.println("Escreva a altura: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
    }

    public static void ex8() {
//        8.Fazer um programa que calcula e mostra a área de um círculo, sabendo que:
//        área = pi * r2
        System.out.println("Escreva o núemro do raio: ");
        double raio = scanner.nextDouble();

        double areaCirculo = 3.14 * (raio * raio);

        System.out.println("A área do circul é: " + areaCirculo);
    }

    public static void ex9() {
//        9. Fazer um programa que recebe um número positivo, calcula e mostra:
//        a) O número digitado ao quadrado;
//        b) O número digitado ao cubo;
//        c) A raiz quadrada do número digitado.

        System.out.println("Escreva o numero: ");
        int nmr = scanner.nextInt();



        System.out.println("O numero ao quadrado: " + Math.pow(nmr , 2));
        System.out.println("O numero ao cubo: " + Math.pow(nmr , 3));
        System.out.println("A raiz: " + Math.sqrt(nmr));
    }

    public static void ex10() {
//        10. Fazer um programa que recebe o preço de um produto, calcula e mostra o novo preço
//        sabendo-se que este sofreu um desconto de 10%.
        double precoProduto;
        precoProduto = Double.parseDouble(JOptionPane.showInputDialog(null,"O valor do novo produto: "));

        double precoReajuste = precoProduto * 0.10;
        System.out.println("O novo preço do produto é: " + precoReajuste);
    }

    public static void ex11() {
//        11. Fazer um programa que recebe o salário-base de um funcionário, calcula e mostra o salário
//        a receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base e paga
//        imposto de 7% sobre o salário-base
        double salarioAjustado;
        double salarioBruto;
        double salarioAntigo;
        salarioBruto = Double.parseDouble(JOptionPane.showInputDialog(null,"Escreva o valor do salário bruto: "));
        salarioAjustado = (salarioBruto * 0.05) + salarioBruto - (salarioBruto * 0.07);
        salarioAntigo = salarioBruto - (salarioBruto * 0.07);

        System.out.println("O salário antigo: " + salarioAntigo  + "\nO novo sálario é: " + salarioAjustado);
    }

    public static void ex12() {
//        12.Fazer um programa que recebe o salário de um funcionário e o percentual de aumento,
//        calcula e mostra o valor do aumento e o novo salário

        double salario;
        int porcentagem;
        double valorAjustado;
        double salarioNovo;

        System.out.println("Escreva o valor do salário: ");
        salario = scanner.nextDouble();

        System.out.println("Escreva a porcentagem que você quer aumentar do salário: ");
        porcentagem = scanner.nextInt();

        valorAjustado = (salario /100) * porcentagem;
        salarioNovo = valorAjustado + salario;

        System.out.println("Valor do aumento do salário: " + valorAjustado + "\nValor do salário novo: " + salarioNovo);
    }

    public static void ex14() {
//        14.Fazer um programa que recebe dois números e mostra o maior.
        int nmr1;
        int nmr2;
        String resultado;

        nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva o primeiro número: "));
        nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o segundo número: "));

        resultado = nmr1 > nmr2 ? "O primeiro número é maior!!: " + nmr1 :  nmr2 > nmr1 ? "O segundo número é o maior" + nmr2 : "Os dois números sao iguais!!!!" ;
        System.out.println(resultado);
    }
    public static void ex15() {
//        15.Fazer um programa que recebe três números e mostra-os em ordem crescente
        int nmr1;
        int nmr2;
        int nmr3;
        int menorNumero;
        int maiorNumero;
        int numeroDoMeio;

        nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva o primeiro número: "));
        nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o segundo número: "));
        nmr3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o terceira número: "));

        menorNumero = Math.min(nmr1, Math.min(nmr2, nmr3));
        maiorNumero = Math.max(nmr1, Math.max(nmr2, nmr3));
        numeroDoMeio = nmr1 + nmr2 + nmr3 - menorNumero - maiorNumero;

        System.out.println(menorNumero+ " , "+ numeroDoMeio+ " , " + maiorNumero );
    }
    public static void ex16() {
//      16.Fazer um programa que recebe três números inteiros em ordem crescente e um quarto
//número também inteiro que não siga esta regra. Mostra, em seguida, os quatro números em
//ordem crescente.
        int nmr1;
        int nmr2;
        int nmr3;
        int nmr4;
        int menorNumero;
        int maiorNumero;
        int numeroDoMeio;

        nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva o primeiro número: "));
        nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o segundo número: "));
        nmr3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o terceira número: "));
        nmr4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o quarto número: "));

        menorNumero = Math.min(nmr1, Math.min(nmr2, nmr3));
        maiorNumero = Math.max(nmr1, Math.max(nmr2, nmr3));
        numeroDoMeio = nmr1 + nmr2 + nmr3 - menorNumero - maiorNumero;

        int[] ordem = {nmr1, nmr2, nmr3, nmr4};
        Arrays.sort(ordem);

        // Mostra os números em ordem crescente
        System.out.println("Os números em ordem crescente são: " + ordem[0] + ", " + ordem[1] + ", " + ordem[2] + ", " + ordem[3]);
    }
}
