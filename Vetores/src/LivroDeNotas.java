import javax.swing.*;
import java.util.Random;

public class LivroDeNotas {
    private String nomeDisciplina;
    private double nota1 [];
    private double nota2 [];
    private double media [];
    private int qtdAlunos;

    public LivroDeNotas(String nomeDisciplina, int qtdAlunos) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = new double[qtdAlunos];
        this.nota2 = new double[qtdAlunos];
        this.media = new double[qtdAlunos];
        this.qtdAlunos = qtdAlunos;
    }

    public void gerarNotas() {
        Random gerador = new Random();
        for (int i = 0; i < this.qtdAlunos; i++) {
            this.nota1[i] = gerador.nextDouble() * 10;
            this.nota2[i] = gerador.nextDouble() * 10;
        }
    }

    public void calcularMedia() {
        for (int i = 0; i < this.nota1.length; i++) {
            double media = (this.nota1[i] + this.nota2[i]) / 2;
            this.media[i] = media;
        }
    }

    public void mostrarMedias ( ) {
        String todasAsMedias = "";
        for (int i = 0; i < qtdAlunos; i++) {
            todasAsMedias += String.format("Aluno %d: %.2f\n", i + 1, media[i]);
        }
        JOptionPane.showMessageDialog(null, todasAsMedias);
    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void exibeMaior () {
        //suponha que o primeiro seja o maior
        double maior = this.media[0];

        //olhe para os demais, um a um
        for (int i = 1; i < this.qtdAlunos; i++) {
            //se encontrar um maior, atualize a variável
            if (this.media[i] > maior)
                maior = this.media[i];
        }
        //exibe o maior, que está na variável maior
        JOptionPane.showMessageDialog(null, "Maior média: " + media);
    }

    public void mediaDaTurma () {
        double mediaDaTurma = 0;
        for (int i = 0; i < this.qtdAlunos; i++) {
            mediaDaTurma += this.media[i];
        }
        JOptionPane.showMessageDialog(null, "Média da turma: " + (mediaDaTurma / this.qtdAlunos));
    }

    public double variancia () {
        double mediaDaTurma = 0;
        for (int i = 0; i < this.qtdAlunos; i++) {
            mediaDaTurma += this.media[i];
        }
        mediaDaTurma = mediaDaTurma / this.qtdAlunos;
        double soma = 0;
        for (int i = 0; i < this.qtdAlunos; i++) {
            soma += Math.pow(this.media[i] - mediaDaTurma, 2);
        }
        return soma / (this.qtdAlunos - 1);
    }

    public double desvioPadrao () {
        return Math.sqrt(this.variancia());
    }



}
