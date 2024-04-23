package Loja_de_livros;

import java.awt.*;
import java.util.ArrayList;

public class LojaLivro {
    private ArrayList<Livro> livros;

    private ArrayList<Cliente> clientes;

    public LojaLivro() {
        this.livros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarLivros(Livro  livro ) {
        livros.add(livro);
        System.out.println("Livro adicionado " + livro.getTitulo());

    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado" + cliente.getNome());
    }

    public boolean venderLivro(Livro livro, Cliente cliente) {
        if (!livros.contains(livro)) {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível na loja.");
            return false;
        }

        if (!clientes.contains(cliente)) {
            System.out.println("O cliente " + cliente.getNome() + " não está cadastrado na loja.");
            return false;
        }

        livros.remove(livro);
        System.out.println("Livro vendido: " + livro.getTitulo() + " para o cliente " + cliente.getNome());
        return true;
    }

    public void listarLivro() {
        System.out.println("Livros disponíveis na loja:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}
