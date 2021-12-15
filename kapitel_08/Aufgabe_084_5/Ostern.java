package kapitel_08.Aufgabe_084_5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Ostern extends JFrame {

	private JPanel cPane;
	private JTextField tfYear;
	private JLabel lInfo2;
	private JLabel lResp;

	private int y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ostern frame = new Ostern();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ostern() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 200);
		setTitle("Osterdatum - von Unbekannt ;-)");
		cPane = new JPanel();
		cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		cPane.setLayout(null);
		setContentPane(cPane);

		// (TOP)
		// Label
		JLabel lYear = new JLabel("Jahr > 1583");
		lYear.setBounds(10, 10, 70, 20);
		cPane.add(lYear);

		// Textfield
		tfYear = new JTextField();
		tfYear.setBounds(10, 30, 100, 20);
		tfYear.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					calc();
				}
			}
		});
		cPane.add(tfYear);

		// Button
		JButton bYear = new JButton("Datum für Ostersonntag berechnen");
		bYear.setBounds(140, 30, 250, 20);
		bYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		cPane.add(bYear);

		// Middle
		// Label
		JLabel lInfo1 = new JLabel("Datum für Ostersonntag:");
		lInfo1.setBounds(10, 75, 160, 20);
		cPane.add(lInfo1);

		lInfo2 = new JLabel();
		lInfo2.setBounds(180, 75, 230, 20);
		cPane.add(lInfo2);

		// Bottom
		// Label
		lResp = new JLabel();
		lResp.setBounds(10, 90, 200, 20);
		cPane.add(lResp);

		// Button
		JButton bEnd = new JButton("Ende");
		bEnd.setBounds(180, 120, 150, 20);
		bEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cPane.add(bEnd);

		cPane.setVisible(true);
	}

	private void calc() {
		y = Integer.parseInt(tfYear.getText());
		if (y > 1583) {
			int g = y % 19;
			int c = y / 100;
			int h = (c - c / 4 - (8 * c + 13) / 25 + 19 * g + 15) % 30;
			int i = h - (h / 28) * (1 - (29 / (h + 1)) * ((21 - g) / 11));
			int j = (y + y / 4 + i + 2 - c + c / 4) % 7;
			int l = i - j;
			int m = 3 + (l + 40) / 44;
			int d = l + 28 - 31 * (m / 4);
			lResp.setText(d + "." + m + "." + y);
		} else {
			lInfo2.setText("Berechnung nur für Jahreszahl > 1583");
		}
	}
}
