import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {
    public Interface() {
//        JFrame jFrame = new JFrame();
//        jFrame.setVisible(true);
//        jFrame.setBackground(Color.yellow);
//        jFrame.setLocation(450,100);
//        jFrame.setSize(500,500);
//        jFrame.setTitle("Calculadora");
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.yellow);
        setLocation(450,100);
        setSize(500,500);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Do botão
        setLayout(null);
        JButton jButton = new JButton();
        add(jButton);
        jButton.setText("=");
        jButton.setFont(new Font("Arial",Font.HANGING_BASELINE, 40));
        jButton.setForeground(new Color(0, 0, 0));
        jButton.setBackground(new Color(90, 90, 138));
        jButton.setBounds(360,400,120,55);

        setLayout(null);
        JButton jButton2 = new JButton();
        add(jButton2);
        jButton2.setText("√");
        jButton2.setFont(new Font("Arial",Font.HANGING_BASELINE, 40));
        jButton2.setForeground(new Color(0, 0, 0));
        jButton2.setBackground(new Color(90, 90, 138));
        jButton2.setBounds(360,220,120,55);

        setLayout(null);
        JButton jButton3 = new JButton();
        add(jButton3);
        jButton3.setText("%");
        jButton3.setFont(new Font("Arial",Font.HANGING_BASELINE, 40));
        jButton3.setForeground(new Color(0, 0, 0));
        jButton3.setBackground(new Color(90, 90, 138));
        jButton3.setBounds(4,160,120,55);

        setLayout(null);
        JButton jButton4 = new JButton();
        add(jButton4);
        jButton4.setText("x");
        jButton4.setFont(new Font("Arial",Font.HANGING_BASELINE, 40));
        jButton4.setForeground(new Color(0, 0, 0));
        jButton4.setBackground(new Color(90, 90, 138));
        jButton4.setBounds(360,340,120,55);

        setLayout(null);
        JButton jButton5 = new JButton();
        add(jButton5);
        jButton5.setText("÷");
        jButton5.setFont(new Font("Arial",Font.HANGING_BASELINE, 40));
        jButton5.setForeground(new Color(0, 0, 0));
        jButton5.setBackground(new Color(90, 90, 138));
        jButton5.setBounds(360,160,120,55);

        setLayout(null);
        JButton jButton6 = new JButton();
        add(jButton6);
        jButton6.setText("-");
        jButton6.setFont(new Font("Arial",Font.HANGING_BASELINE, 40));
        jButton6.setForeground(new Color(0, 0, 0));
        jButton6.setBackground(new Color(90, 90, 138));
        jButton6.setBounds(360,280,120,55);

        setLayout(null);
        JButton jButton7 = new JButton();
        add(jButton7);
        jButton7.setText("+");
        jButton7.setFont(new Font("Arial",Font.HANGING_BASELINE, 40));
        jButton7.setForeground(new Color(0, 0, 0));
        jButton7.setBackground(new Color(90, 90, 138));
        jButton7.setBounds(360,400,120,55);
    }
}
