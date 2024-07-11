package primeiro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sadals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i  = 0; i < 10; i++) {
            System.out.println("Escreva um nome: ");
            String sadal = scanner.nextLine();
            sadals.add(sadal);
        }

        for (String nome : sadals) {
            System.out.println(nome);
        }


    }
}