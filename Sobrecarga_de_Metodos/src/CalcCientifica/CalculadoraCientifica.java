package CalcCientifica;

public class CalculadoraCientifica {

    //3
    public double potenciacao(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }

    public double radiacao(double numero, double indice) {
        return Math.pow(numero, 1.0 / indice);
    }

    //Raiz 3.1.1 à 3.1.3
    public double raiz(int numero) {
        return Math.sqrt(numero);
    }

    public double raiz(double numero) {
        return Math.sqrt(numero);
    }

    public double raiz(String numero) {
        //n sei oque esta de errado
        return Math.sqrt(Double.parseDouble(numero));
    }

    //Pontencia 3.2.1 à 3.2.3

    public double pontencia(byte numero1, byte numero2) {
        return Math.pow(numero1, numero2);
    }

    public double pontencia(String numero1, String numero2) {
        //n sei oque esta de errado
        return Math.pow(Double.parseDouble(numero1), Double.parseDouble(numero2));
    }

    public double pontencia(int numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }
}


    //Nesse caso n presciso
    //------------------------------------------------> Getters AND Setters <------------------------------------------------
    //Numero1
//    public double getNumero1() {
//        return numero1;
//    }
//
//    public void setNumero1(double numero1) {
//        this.numero1 = numero1;
//    }
//    //Numero2
//    public double getNumero2() {
//        return numero2;
//    }
//
//    public void setNumero2(double numero2) {
//        this.numero2 = numero2;
//    }
//}
