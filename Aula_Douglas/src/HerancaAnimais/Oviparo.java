package HerancaAnimais;

public class Oviparo extends Animal{
    private boolean pena;
    private int qtdOvos;

    public Oviparo(boolean pena, String nome, int qtdOvos,int qtdPatas) {
        super(nome, qtdPatas);
        this.pena = pena;
        this.qtdOvos = qtdOvos;
    }


    public boolean isPena() {
        return pena;
    }

    public int getQtdOvos() {
        return qtdOvos;
    }
}
