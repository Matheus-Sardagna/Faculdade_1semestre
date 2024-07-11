package org.example;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame{
    private JLabel label;
    private JButton button;

    public Display() {
        setVisible(true);
        setTitle("Treinando");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Testando isso");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

    }
}
