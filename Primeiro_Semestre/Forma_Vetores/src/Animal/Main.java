package Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];

        for (int i = 0; i < animais.length; i++) {
            if (i % 2 == 0) {
                animais[i] = new Cachorro(12, "Tobi");
            } else {
                animais[i] = new Gato(5, "Freed");
            }
        }
        for (int i = 0; i < animais.length; i++){
            animais[i].exibirInfo();
            animais[i].fazerBarulho();
            animais[i].mover();
        }

    }
}
