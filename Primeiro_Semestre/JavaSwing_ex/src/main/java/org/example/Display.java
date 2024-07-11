package org.example;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    public void SimpleGUI() {
        setTitle("Exemplo de Interface Gráfica");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Criando um rótulo
        Label label = new Label("Olá, Mundo!");
        label.set(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
        // Criando um botão
        button = new JButton("Clique aqui!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SimpleGUI.this, "Você clicou no botão!");
            }
        });
        add(button, BorderLayout.SOUTH);
    }
}
