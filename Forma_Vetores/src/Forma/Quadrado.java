package Forma;

public class Quadrado extends Forma {

    public Quadrado(double base, double altura) {
        super(base, altura);
    }

    public void calcularArea(){
        double calc = getBase() * getAltura();
        System.out.println(calc);
    }
}
