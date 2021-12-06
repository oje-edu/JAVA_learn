package farbenUndMedien.Farben;

import javax.swing.*;

public class HTML {

    public static void main(String[] args) {

        // JFrame
        JFrame f = new JFrame("Urlaubanspruch");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel: HTML MIT Farbwort
        JLabel label1 = new JLabel("<html><span style='color:teal'>Hello World</span></html>");
        label1.setBounds(20, 40, 200, 30);
        f.add(label1);

        // JLabel: HTML mit Farbcode
        JLabel label2 = new JLabel("<html><span style='color:#FF8C00'>Hello World</span></html>");
        label2.setBounds(20, 70, 200, 30);
        f.add(label2);

        // JTextField: Funzt niet

        // JButton
        JButton button = new JButton("<html><span style='color:#FF8C00'>Hello World</span></html>");
        button.setBounds(20, 110, 200, 30);
        f.add(button);

        f.setVisible(true);
    }
}

