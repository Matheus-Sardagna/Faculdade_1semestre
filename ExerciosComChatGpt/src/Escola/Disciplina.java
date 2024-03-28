package Escola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunosDisciplina;

    public void adicionarAluno(Aluno aluno) {
        alunosDisciplina.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        alunosDisciplina.add(aluno);
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
