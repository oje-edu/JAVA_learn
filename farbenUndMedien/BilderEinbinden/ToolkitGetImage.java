package farbenUndMedien.BilderEinbinden;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ToolkitGetImage extends Canvas {

    public void paint(Graphics g) {

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("src/farbenUndMedien/BilderEinbinden/java-logo.jpg");
        g.drawImage(i, 120,100,this);

    }
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ToolkitGetImage c = new ToolkitGetImage();
        f.add(c);

        f.setVisible(true);
    }
}
