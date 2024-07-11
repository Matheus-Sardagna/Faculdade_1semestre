package Animal;

public class Gato extends Animal {

    public Gato(int idade, String nome) {
        super(idade,nome, "Gato");
    }
    public void fazerBarulho () {
        System.out.println("Miau");
    }
    public void mover () {
        System.out.println("Movendo");
    }

}
