package Forma;

import java.util.ArrayList;

public class Forma {
    //private ArrayList<Forma.Forma> objetos = new ArrayList<>();
    private double base;
    private double altura;

    public Forma(double base, double altura) {
        this.base =  base;
        this.altura = altura;
    }

    public void calcularArea() {
        double calc = base * altura;
        System.out.println(calc);
    }

    public void desenhar() {
        //Sem info ainda
    }
    //Getter and Setters


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
