package farbenUndMedien.Farben;

import javax.swing.*;
import java.awt.*;

public class JPanelMy {

    public static void main(String[] args) {

        JFrame f = new JFrame("Hello");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel c = new JPanel();
        c.setSize(400, 300);
        // c.setBackground(new Color(0x008080));
        // c.setBackground(new Color(0, 128, 128));
        c.setBackground(new Color(128, 228, 200));
        f.add(c);

        f.setVisible(true);
    }
}
