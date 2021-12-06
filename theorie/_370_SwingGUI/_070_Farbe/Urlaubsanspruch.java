package theorie._370_SwingGUI._070_Farbe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Urlaubsanspruch {

	public static void main(String[] args) {
		FontUIResource fs = new FontUIResource("Monaco", FontUIResource.PLAIN, 32);

		// JFrame
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 300);
		
		f.setTitle("Urlaubsanspruch");
		f.setLayout(null); // Keinen LayoutManager benutzen

		// JLabel
		JLabel l1 = new JLabel("Alter");
		l1.setBounds(20, 30, 300, 35);
		l1.setFont(fs);
		f.add(l1);

		JLabel l2 = new JLabel("Zugehörigkeit");
		l2.setBounds(20, 70, 300, 35);
		l2.setFont(fs);
		f.add(l2);

		JLabel l3 = new JLabel("Behinderungsgrad");
		l3.setBounds(20, 110, 300, 35);
		l3.setFont(fs);
		f.add(l3);

		JLabel l4 = new JLabel("<html><span style='color:teal'>Urlaubsanspruch</span></html>");
		l4.setBounds(20, 210, 200, 30);
		f.add(l4);

		JLabel lres = new JLabel("<html><span style=color':#FF8C00'>Ergebnis</span></html>");
		lres.setBounds(240, 210, 200, 30);
		f.add(lres);

		// TextField
		JTextField t1 = new JTextField("");
		t1.setForeground(Color.PINK);
		t1.setBounds(340, 30, 100, 30);
		f.add(t1);

		JTextField t2 = new JTextField("");
		t2.setBounds(340, 70, 100, 30);
		f.add(t2);

		JTextField t3 = new JTextField("");
		t3.setBounds(340, 110, 100, 30);
		f.add(t3);

		// Button
		JButton b1 = new JButton("Hau Weg!");
		b1.setBounds(340, 160, 100, 30);
		f.add(b1);

		// Action Listener & ActionEvent
		// import java.awt.event.ActionListener;
		// import java.awt.event.ActionEvent;
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int alter = t1.getText().equals("") ? 0 : Integer.parseInt(t1.getText());
				int jahreImBetrieb = t2.getText().equals("") ? 0 : Integer.parseInt(t2.getText());
				int behinderung = t3.getText().equals("") ? 0 : Integer.parseInt(t3.getText());
				
				int urlaub = 26;
				if (behinderung >= 50)
					urlaub += 5;
				if (jahreImBetrieb > 10)
					urlaub += 2;
				if (alter < 18)
					urlaub += 4;
				else if (alter > 55)
					urlaub += 2;

				lres.setText(Integer.toString(urlaub) + " Tage");
			}
		});

		f.setVisible(true); // Frame sichtbar machen
	}
}
