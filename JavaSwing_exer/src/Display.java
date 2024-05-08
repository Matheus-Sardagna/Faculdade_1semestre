import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame {
    private JLabel label;
    private JButton button;
    public Display() {
        setVisible(true);
        setTitle("Eu q mando");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Criando um rótulo
        label = new JLabel("Olá, Mundo!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
        // Criando um botão
        button = new JButton("Clique aqui!");
        button.setFont(new Font("Terminus",Font.HANGING_BASELINE, 10));
        button.setForeground(new Color(62, 0, 63));
        button.setBackground(new Color(0xE3B713));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Display.this, "Você clicou no botão!");
            }
        });
        add(button, BorderLayout.SOUTH);
    }
}
