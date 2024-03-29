package Escola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Professor professor = null;
        Aluno aluno = null;
        Disciplina disciplina = null;
        int contador = 10;
        while (contador != 0) {
            System.out.println("========= Menu =======\n" +
                    "(1) Matricular o Aluno\n" +
                    "(2) Contratar Professor\n" +
                    "(3) Cadatrar Disciplina\n" +
                    "(4) Adicionar Aluno na disciplina\n" +
                    "(0) Sair" +
                    "Escolha uma opção: ");
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Escreva o nome do aluno: ");
                String nome = scanner.nextLine();

                scanner.nextLine();
                System.out.println("Escreva a idade do aluno: ");
                int idade = scanner.nextInt();

                aluno = new Aluno(nome,idade);



            } else if (opcao == 2) {
                System.out.println("Escreva o nome do professor: ");
                String nome = scanner.nextLine();

                scanner.nextLine();
                System.out.println("Escreva a idade do professor: ");
                int idade = scanner.nextInt();

                professor = new Professor(nome,idade);

            } else if (opcao == 3) {
                System.out.println("Escreva o nome do professor: ");
                String nome = scanner.nextLine();

                disciplina.adicionarDisciplina();


            } else if (opcao == 4) {
                System.out.println("Escreva o nome da disciplina: ");
                String nomeDisciplina = scanner.nextLine();

                System.out.println("Escreva o nome do aluno: ");
                String nomeAluno = scanner.nextLine();

                // Verificando se a disciplina existe e se o aluno foi instanciado
                if (disciplina.getNome() != null && aluno.getNome() != null) {
                    disciplina.adicionarAluno(aluno);
                    System.out.println("Aluno " + aluno.getNome() + " adicionado à disciplina " + disciplina.getNome());
                } else {
                    System.out.println("Disciplina ou aluno não foram corretamente cadastrados.");
                }
            }
        }
    }
}