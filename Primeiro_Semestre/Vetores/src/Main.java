import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //instancia um livro de notas para a disciplina Programação com 10 alunos
        LivroDeNotas livro = new LivroDeNotas("Programação", 10);

        //gera notas aleatórias
        livro.gerarNotas();
        //calcula as médias

        livro.calcularMedia();
        //exibe as médias
        livro.mostrarMedias();

        //Exibe a maior média
        livro.exibeMaior();

        //exibe a média da turma
        livro.mediaDaTurma();

        //exibe a variância
        JOptionPane.showMessageDialog(null, "Variância: " + livro.variancia());

        //exibe o desvio padrão
        JOptionPane.showMessageDialog(null, "Desvio padrão: " + livro.desvioPadrao());
    }

}
