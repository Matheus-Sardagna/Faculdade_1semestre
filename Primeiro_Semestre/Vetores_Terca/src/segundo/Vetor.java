package segundo;

public class Vetor {
    public static void main(String[] args) {
            double[] notas = {8.6 , 9.6 , 7.3 , 8.9};
            int sum = 0;
            double soma = 0;

            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            double media = soma / notas.length;

            for (double nota : notas) {

                sum +=1 ;

                System.out.println("Aluno " + sum + ": " + nota);
            }

            }
}
