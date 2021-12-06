package theorie._370_SwingGUI._020_JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Urlaubsanspruch {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 300);
		f.setTitle("Urlaubsanspruch");
		f.setLayout(null);   					// Keinen LayoutManager benutzen
			
		
		// JLabel
		JLabel l1 = new JLabel("Alter");
		l1.setBounds(20, 30, 200, 30);
		
		JLabel l2 = new JLabel("Betriebszugehörigkeit");
		l2.setBounds(20, 70, 200, 30);
		
		JLabel l3 = new JLabel("Behinderungsgrad");
		l3.setBounds(20, 110, 200, 30);
		
		JLabel l4 = new JLabel("Urlaubsanspruch");
		l4.setBounds(20, 210, 200, 30);
		
		JLabel res = new JLabel("Ergebnis");
		res.setBounds(240, 210, 200, 30);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(res);
		
		f.setVisible(true); 					// Frame sichtbar machen
	}
}
