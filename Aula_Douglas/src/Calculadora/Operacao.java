package Calculadora;

public class Operacao {

    //Atributos
    private int nmrFatorial = 0;
    private int nmrMinuendo = 0;
    private int nmrSubtraendo = 0;
    private int nmrGenerico1 = 0;
    private int nmrGenerico2 = 0;

    //Métodos
    public  int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static double exponenciacao(int numero1, int numero2) {
        //Fui obrigado a colar em valor double para rodar o código
        return Math.pow(numero1,numero2);
    }

    public int subtracao() {
        return nmrMinuendo - nmrSubtraendo;
    }

    private int fatorialRecursivo(int numero) {
        if ((numero == 1 || numero == 0)) {
            return 1;
        }else {
            return fatorialRecursivo(numero -1 )*numero;
        }
    }

    public int multiplicacao() {
        return this.nmrGenerico1 * this.nmrGenerico2;
    }

    public double divisao() {
        return this.nmrGenerico1 / this.nmrGenerico2;
    }
    //sobrecarga
    public int soma(int numero1,int numero2,int numero3) {
        return numero1 + numero2 + numero3;
    }

    public int soma(String numero1, String numero2) {
        return Integer.parseInt(numero1) + Integer.parseInt(numero2);
    }

    //Getters AND Setters

    public void setNmrGenerico1(int numero) {
        this.nmrGenerico1 = numero;
    }

    public void setNmrGenerico2(int numero) {
        this.nmrGenerico2 = numero;
    }

    public int getNmrFatorial() {
        return fatorialRecursivo((nmrFatorial));
    }

    public void setNmrFatorial(int numero) {
        this.nmrFatorial = numero;
    }

    public void setNmrMinuendo(int numero) {
        this.nmrMinuendo = numero;
    }

    public void  setNmrSubtraendo(int numero) {
        this.nmrSubtraendo = numero;
    }
}


