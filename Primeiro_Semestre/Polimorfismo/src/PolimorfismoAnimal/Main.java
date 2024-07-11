package PolimorfismoAnimal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        gato.fazerBarulho();
        cachorro.fazerBarulho();
        animal.fazerBarulho();
    }
}