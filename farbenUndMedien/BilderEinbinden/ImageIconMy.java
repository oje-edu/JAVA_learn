package farbenUndMedien.BilderEinbinden;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ImageIconMy extends JFrame {

    public ImageIconMy() {
        super("ImageIconExtends");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label1 = new JLabel();
        label1.setIcon(new ImageIcon("src/farbenUndMedien/BilderEinbinden/java-logo.jpg"));
        c.add(label1);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageIconMy();
    }
}