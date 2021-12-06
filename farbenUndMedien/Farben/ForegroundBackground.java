package farbenUndMedien.Farben;

import javax.swing.*;
import java.awt.*;

public class ForegroundBackground {

    public static void main(String[] args) {

        // JFrame
        JFrame f = new JFrame("Urlaubanspruch");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel: HTML MIT Farbwort
        JLabel label1 = new JLabel("Hello World 1");
        label1.setForeground(new Color(0xFF0000));
        label1.setBounds(20, 40, 200, 30);
        f.add(label1);

        // JLabel: HTML mit Farbcode
        JLabel label2 = new JLabel("Hello World 2");
        label2.setBackground(new Color(0xFFAAAA));         // Funzt niet
        label2.setBounds(20, 70, 200, 30);
        f.add(label2);

        // setForeground()
        JTextField text1 = new JTextField("Hello World 3");
        text1.setForeground(new Color(0xFF0000));
        text1.setBounds(20, 110, 100, 30);
        f.add(text1);

        // setBackground(
        JTextField text2 = new JTextField("Hello World 4");
        text2.setBackground(new Color(0xFFAAAA));
        text2.setBounds(20, 150, 100, 30);
        f.add(text2);

        // JButton
        JButton button1 = new JButton("Hello World 5");
        button1.setForeground(new Color(0xFF0000));
        button1.setBounds(20, 190, 200, 30);
        f.add(button1);

        JButton button2 = new JButton("Hello World 5");
        button2.setBackground(new Color(0xFFAAAA));         // Funzt niet
        button2.setBounds(20, 230, 200, 30);
        f.add(button2);

        f.setVisible(true);
    }
}

