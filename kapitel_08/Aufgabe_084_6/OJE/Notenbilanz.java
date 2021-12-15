package kapitel_08.Aufgabe_084_6.OJE;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class Notenbilanz extends JFrame {

	private JPanel cPane;
	private JTextField tfCount;
	private JTextField tfNotes;
	private JLabel lInfo;
	private JLabel lNote;
	private JLabel lCount;
	private JLabel lResult;
	private JLabel lBestN;
	private JLabel lBadN;
	private JButton bOK1;
	private JButton bOK2;
	private JButton bNew;

	DecimalFormat f = new DecimalFormat("###,##0.00");

	private int notes, count;
	private double result, bestN, badN, avgN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notenbilanz frame = new Notenbilanz();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Notenbilanz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		setTitle("Notenbilanz - von Unbekannt ;-)");
		cPane = new JPanel();
		cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		cPane.setLayout(null);
		setContentPane(cPane);

		// (TOP)
		// Label
		lCount = new JLabel("Anzahl Noten");
		lCount.setBounds(10, 10, 100, 20);
		cPane.add(lCount);

		// Textfield
		tfCount = new JTextField();
		tfCount.setBounds(10, 30, 100, 20);
		cPane.add(tfCount);

		// Button
		bOK1 = new JButton("Übernehmen");
		bOK1.setBounds(140, 30, 250, 20);
		bOK1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstBtn();
			}
		});
		cPane.add(bOK1);

		bNew = new JButton("Neue Berechnung");
		bNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newBtn();
			}
		});
		bNew.setVisible(false);
		bNew.setBounds(256, 25, 168, 23);
		cPane.add(bNew);

		lInfo = new JLabel();
		lInfo.setBounds(200, 50, 200, 20);
		cPane.add(lInfo);

		// Middle
		// Label
		lNote = new JLabel();
		lNote.setBounds(10, 75, 100, 20);
		lNote.setText("1.Note");
		lNote.setVisible(false);
		cPane.add(lNote);

		tfNotes = new JTextField();
		tfNotes.setBounds(10, 100, 100, 20);
		tfNotes.setVisible(false);
		tfNotes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfNotes.setEditable(false);
					bOK1.setVisible(false);
				}
			}
		});
		cPane.add(tfNotes);

		// Button
		bOK2 = new JButton("Übernehmen");
		bOK2.setBounds(140, 100, 150, 20);
		bOK2.setVisible(false);
		bOK2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		cPane.add(bOK2);

		// Bottom
		// Label
		lCount = new JLabel();
		lCount.setBounds(10, 150, 200, 20);
		cPane.add(lCount);

		lResult = new JLabel();
		lResult.setBounds(10, 190, 200, 20);
		cPane.add(lResult);

		lBestN = new JLabel();
		lBestN.setBounds(10, 230, 200, 20);
		cPane.add(lBestN);

		lBadN = new JLabel();
		lBadN.setBounds(10, 270, 200, 20);
		cPane.add(lBadN);

		// Button
		JButton bEnd = new JButton("Ende");
		bEnd.setBounds(320, 320, 100, 20);
		bEnd.setVisible(true);
		bEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cPane.add(bEnd);

		cPane.setVisible(true);
	}

	private void firstBtn() {
		if (!(tfCount.getText().equals(""))) {
			notes = Integer.parseInt(tfCount.getText());
			count = 1;
			result = 0;
			bestN = 6;
			badN = 0;

			tfCount.setEditable(false);
			bOK1.setVisible(false);
			lInfo.setVisible(false);

			lNote.setVisible(true);
			tfNotes.setVisible(true);
			bOK2.setVisible(true);

			tfNotes.requestFocus();
		} else {
			lInfo.setText("Bitte Anzahl Noten eingeben");
			tfCount.requestFocus();
		}
	}

	private void newBtn() {
		if (!(tfCount.getText().equals(""))) {
			count = 1;
			result = 0;
			bestN = 6;
			badN = 0;
			lNote.setVisible(false);
			tfNotes.setVisible(false);
			bOK2.setVisible(false);
			bNew.setVisible(false);

			tfCount.setEditable(true);
			bOK1.setVisible(true);

			lNote.setText(Integer.toString(count) + ".Note");
			tfNotes.setText("");

			tfCount.setText("");
			tfCount.requestFocus();

			lResult.setText("");
			lBestN.setText("");
			lBadN.setText("");
			lCount.setText("");

		} else {
			lInfo.setText("Bitte Anzahl Noten eingeben");
			tfCount.requestFocus();
		}
	}

	private void calc() {
		if (!(tfNotes.getText().equals("")) && Double.parseDouble(tfNotes.getText()) >= 1
				&& Double.parseDouble(tfNotes.getText()) <= 6) {
			result = result + Double.parseDouble(tfNotes.getText());
			avgN = result / count;
			lResult.setText("Notenschnitt: " + f.format(avgN));
			lCount.setText("Anzahl eingegebene Noten: " + Integer.toString(count));

			if (Double.parseDouble(tfNotes.getText()) > badN) {
				badN = Double.parseDouble(tfNotes.getText());
				lBadN.setText("schlechteste Note: " + Double.toString(badN));
			}
			if (Double.parseDouble(tfNotes.getText()) < bestN) {
				bestN = Double.parseDouble(tfNotes.getText());
				lBestN.setText("beste Note: " + Double.toString(bestN));
			}
			if (count == notes) {
				avgN = result / notes;
				bOK2.setVisible(false);
				bNew.setVisible(true);
			} else {
				count++;
				lNote.setText(Integer.toString(count) + ".Note");
				tfNotes.setText("");
				tfNotes.requestFocus();
			}
		} else {
			JOptionPane.showMessageDialog(null, "gültige Note eingeben!");
			tfNotes.requestFocus();
		}
	}
}