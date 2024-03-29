package Escola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunosDisciplina;

    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunosDisciplina = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        System.out.println("Adicionou Disciplina!");
    }

    public void adicionarAluno(Aluno aluno ) {
        if (!alunosDisciplina.contains(aluno)) {
            alunosDisciplina.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado à disciplina " + nome);
        }else {
            System.out.println("Aluno " +  aluno.getNome() + "já esta cadastrado na disciplina!!");
        }

    }

    public void removerAluno(String nomeAluno){
        Aluno alunoRemover = null;
        for (Aluno aluno : alunosDisciplina) {
            if (aluno.getNome().equals(nomeAluno)) {
                alunoRemover = aluno;
                alunosDisciplina.remove(nomeAluno);

            }
        }
        if (alunoRemover != null){
            alunosDisciplina.remove(alunoRemover);
            System.out.println("Aluno " + nomeAluno + " foi removido!!" + nome);
        } else {
            System.out.println("Aluno " + nomeAluno + "não foi cadastrado na discplina de " + nome);
        }

    }

    public  void listarAlunosMatriculados(){
        System.out.println("Alunos matriculados na disciplina " + nome + " :");
        for (Aluno aluno : alunosDisciplina) {
            System.out.println("-Alunos na mátéria :" + aluno.getNome());
        }
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
