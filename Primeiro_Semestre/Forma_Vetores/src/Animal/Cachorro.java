package Animal;

public class Cachorro extends Animal{

    public Cachorro(int idade, String nome) {
        super(idade,nome,"cachorro");
    }
    public void fazerBarulho () {
        System.out.println("Au Au");
    }

    public void mover () {
        System.out.println("Movendo");
    }
}
