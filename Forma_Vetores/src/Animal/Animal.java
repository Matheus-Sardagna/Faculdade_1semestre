package Animal;

public class Animal {
    private int idade;
    private String nome;

    private String especie;

    public Animal(int idade, String nome, String especie) {
        this.idade = idade;
        this.nome = nome;
        this.especie = especie;
    }
    public void fazerBarulho () {
        System.out.println("Ain safadu");
    }

    public void mover () {
        System.out.println("Movendo");
    }

    public void exibirInfo() {
        System.out.println("Idade: " + idade + "\nNome: " + nome + "\nEspécie: " + especie);
    }

}
