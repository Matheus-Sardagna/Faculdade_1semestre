package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("Email?");
                    Pessoa p = new Pessoa ();
                    p.setNome(nome);
                    p.setFone(fone);
                    p.setEmail(email);
                    p.inserir();
                    break;
                case 2:
                    String nome1 = JOptionPane.showInputDialog("Nome?");
                    String fone2 = JOptionPane.showInputDialog("Fone?");
                    String email3 = JOptionPane.showInputDialog("Email?");
                    int codigo =
                            Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                    Pessoa p2 = new Pessoa ();
                    p2.setNome(nome1);
                    p2.setFone(fone2);
                    p2.setEmail(email3);
                    p2.setCodigo(codigo);
                    p2.atualizar();
                break;
                case 3:
                    int codigo1 = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                    Pessoa p3 = new Pessoa ();
                    p3.setCodigo(codigo1);
                    p3.apagar();
                    break;
                case 4:
                    Pessoa p6 = new Pessoa();
                    p6.listar();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        }while (op != 0);
    }
}