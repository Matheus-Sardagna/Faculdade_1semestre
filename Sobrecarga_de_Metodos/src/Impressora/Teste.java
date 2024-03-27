package Impressora;

public class Teste {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();

        impressora.exibir(1.2);
        impressora.exibir(1.4 , 1.3);
        impressora.exibir(1.3,"b");
        impressora.exibir("a", 2);
        impressora.exibir(1,2,"a");
        impressora.exibir("a","b","c");
   }
}