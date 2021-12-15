package farbenUndMedien.BilderEinbinden;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BufferedImageMy {

    public static void main(String[] args) throws IOException {

        JFrame f = new JFrame("Test");
        f.setSize(400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage myPicture = ImageIO.read(new File("src/farbenUndMedien/BilderEinbinden/java-logo.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setBounds(20, 30, 200, 200);
        f.add(picLabel);

        f.setVisible(true);
    }
}
