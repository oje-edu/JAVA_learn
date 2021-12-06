package kapitel_10._Notenbilanz_;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
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
	private JTextField tfNotes;
	private JButton btnApplyAmount;
	private JLabel lblNote;
	private JTextField tfNote;
	private JButton btnApplyNote;
	private JLabel lblNotesCount;
	private JLabel lblNotesAvg;
	private JLabel lblBestNote;
	private JLabel lblWorstNote;
	private JButton btnNew;
	private JLabel lblNotes;
	private JTextField tfNotesNumber;
	private JTextField tfNewValue;
	private JLabel lblNotesNumber;
	private JButton btnNotesNumber;
	private JLabel lblNewValue;
	private JButton btnSaveNewValue;

	private DecimalFormat df;

	private int notesCount, count, notesNumber;
	private double total, bestNote, worstNote, notesAvg;
	private double[] notes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notenbilanz frame = new Notenbilanz();
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
	public Notenbilanz() {
		setTitle("Notenbilanz - von Unbekannt ;-)");
		df = new DecimalFormat("###,##0.00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 324);
		cPane = new JPanel();
		cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		cPane.setBackground(Color.MAGENTA);
		setContentPane(cPane);
		cPane.setLayout(null);

		JLabel lblCountNotes = new JLabel("Anzahl Noten");
		lblCountNotes.setBounds(10, 11, 81, 14);
		cPane.add(lblCountNotes);

		tfNotes = new JTextField();
		tfNotes.setBorder(null);
		tfNotes.setBounds(5, 26, 86, 20);
		tfNotes.setBackground(new Color(0,179,179));
		tfNotes.setForeground(Color.WHITE);
		cPane.add(tfNotes);
		tfNotes.setColumns(10);

		btnApplyAmount = new JButton("Übernehmen");
		btnApplyAmount.setBorderPainted(false);
		btnApplyAmount.setBorder(null);
		btnApplyAmount.setBounds(112, 25, 134, 23);
		btnApplyAmount.setBackground(Color.DARK_GRAY);
		btnApplyAmount.setForeground(Color.MAGENTA);
		btnApplyAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anzahlUebernehmen();
			}
		});
		cPane.add(btnApplyAmount);

		JButton btnEnd = new JButton("Ende");
		btnEnd.setBorderPainted(false);
		btnEnd.setBorder(null);
		btnEnd.setBounds(335, 252, 89, 23);
		btnEnd.setBackground(Color.DARK_GRAY);
		btnEnd.setForeground(Color.MAGENTA);
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cPane.add(btnEnd);

		lblNote = new JLabel("1.Note");
		lblNote.setBounds(10, 69, 81, 14);
		lblNote.setVisible(false);
		cPane.add(lblNote);

		tfNote = new JTextField();
		tfNote.setBorder(null);
		tfNote.setBounds(5, 84, 86, 20);
		tfNote.setBackground(new Color(0,179,179));
		tfNote.setForeground(Color.WHITE);
		tfNote.setVisible(false);
		cPane.add(tfNote);
		tfNote.setColumns(10);

		btnApplyNote = new JButton("Übernehmen");
		btnApplyNote.setBorderPainted(false);
		btnApplyNote.setBorder(null);
		btnApplyNote.setBounds(117, 83, 129, 23);
		btnApplyNote.setBackground(Color.DARK_GRAY);
		btnApplyNote.setForeground(Color.MAGENTA);
		btnApplyNote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noteUebernehmen();
			}
		});
		btnApplyNote.setVisible(false);
		cPane.add(btnApplyNote);

		lblNotesCount = new JLabel("");
		lblNotesCount.setBounds(10, 120, 236, 14);
		cPane.add(lblNotesCount);

		lblNotesAvg = new JLabel("");
		lblNotesAvg.setBounds(10, 145, 236, 14);
		cPane.add(lblNotesAvg);

		lblBestNote = new JLabel("");
		lblBestNote.setBounds(10, 170, 236, 14);
		cPane.add(lblBestNote);

		lblWorstNote = new JLabel("");
		lblWorstNote.setBounds(10, 198, 236, 14);
		cPane.add(lblWorstNote);

		btnNew = new JButton("Neue Berechnung");
		btnNew.setBorderPainted(false);
		btnNew.setBorder(null);
		btnNew.setBounds(256, 25, 168, 23);
		btnNew.setBackground(Color.DARK_GRAY);
		btnNew.setForeground(Color.MAGENTA);
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				neueBerechnung();
			}
		});
		btnNew.setVisible(false);
		cPane.add(btnNew);

		lblNotes = new JLabel("");
		lblNotes.setBounds(10, 225, 414, 14);
		cPane.add(lblNotes);

		tfNotesNumber = new JTextField();
		tfNotesNumber.setBorder(null);
		tfNotesNumber.setBounds(256, 84, 33, 20);
		tfNotesNumber.setBackground(new Color(0,179,179));
		tfNotesNumber.setForeground(Color.WHITE);
		tfNotesNumber.setVisible(false);
		cPane.add(tfNotesNumber);
		tfNotesNumber.setColumns(10);


		lblNotesNumber = new JLabel(" Note bearbeiten");
		lblNotesNumber.setBounds(299, 87, 102, 14);
		lblNotesNumber.setVisible(false);
		cPane.add(lblNotesNumber);

		btnNotesNumber = new JButton("OK");
		btnNotesNumber.setBorderPainted(false);
		btnNotesNumber.setBorder(null);
		btnNotesNumber.setBounds(411, 84, 55, 21);
		btnNotesNumber.setBackground(Color.DARK_GRAY);
		btnNotesNumber.setForeground(Color.MAGENTA);
		btnNotesNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ok();
			}
		});
		btnNotesNumber.setVisible(false);
		cPane.add(btnNotesNumber);

		lblNewValue = new JLabel("1.Note");
		lblNewValue.setBounds(256, 120, 46, 14);
		lblNewValue.setVisible(false);
		cPane.add(lblNewValue);

		tfNewValue = new JTextField();
		tfNewValue.setBorder(null);
		tfNewValue.setBounds(253, 139, 60, 20);
		tfNewValue.setBackground(new Color(0,179,179));
		tfNewValue.setForeground(Color.WHITE);
		tfNewValue.setVisible(false);
		cPane.add(tfNewValue);
		tfNewValue.setColumns(10);

		btnSaveNewValue = new JButton("Speichern");
		btnSaveNewValue.setBorderPainted(false);
		btnSaveNewValue.setBorder(null);
		btnSaveNewValue.setBounds(335, 138, 131, 23);
		btnSaveNewValue.setBackground(Color.DARK_GRAY);
		btnSaveNewValue.setForeground(Color.MAGENTA);
		btnSaveNewValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				speichern();
			}
		});
		btnSaveNewValue.setVisible(false);
		cPane.add(btnSaveNewValue);

	}

	private void anzahlUebernehmen() {
		try {
			notesCount = Integer.parseInt(tfNotes.getText());
			notes = new double[notesCount];
			count = 1;
			total = 0;
			bestNote = 6;
			worstNote = 0;
			btnApplyAmount.setVisible(false);
			tfNotes.setEditable(false);
			lblNote.setVisible(true);
			tfNote.setVisible(true);
			btnApplyNote.setVisible(true);
			tfNote.requestFocus();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Anzahl der Noten eingeben!");
			tfNotes.requestFocus();
		}
	}

	private void noteUebernehmen() {
		try {
			if (!tfNote.getText().equals("") && Double.parseDouble(tfNote.getText()) >= 1
					&& Double.parseDouble(tfNote.getText()) <= 6) {
				total = total + Double.parseDouble(tfNote.getText());
				notes[count - 1] = Double.parseDouble(tfNote.getText());
				notesAvg = total / count;
				lblNotesAvg.setText("Notenschnitt: " + df.format(notesAvg));
				lblNotesCount.setText("Anzahl eingegebene Noten: " + Integer.toString(count));

				if (Double.parseDouble(tfNote.getText()) > worstNote) {
					worstNote = Double.parseDouble(tfNote.getText());
					lblWorstNote.setText("schlechteste Note: " + Double.toString(worstNote));
				}
				if (Double.parseDouble(tfNote.getText()) < bestNote) {
					bestNote = Double.parseDouble(tfNote.getText());
					lblBestNote.setText("beste Note: " + Double.toString(bestNote));
				}
				if (count == notesCount) {
					notesAvg = total / notesCount;
					btnApplyNote.setVisible(false);
					btnNew.setVisible(true);
					lblNotes.setText("Noten: ");
					for (int i = 0; i < notes.length; i++) {
						lblNotes.setText(lblNotes.getText() + " " + notes[i]);
					}
					lblNotesNumber.setVisible(true);
					tfNotesNumber.setVisible(true);
					btnNotesNumber.setVisible(true);

				} else {
					count++;
					lblNote.setText(Integer.toString(count) + ".Note");
					tfNote.setText("");
					tfNote.requestFocus();
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "gültige Note eingeben!");
			tfNote.requestFocus();
		}
	}

	private void neueBerechnung() {
		count = 1;
		lblNote.setText(Integer.toString(count) + ".Note");
		total = 0;
		bestNote = 6;
		worstNote = 0;
		btnApplyAmount.setVisible(true);
		tfNotes.setEditable(true);
		lblNote.setVisible(false);
		tfNote.setVisible(false);
		tfNote.setText("");
		btnApplyNote.setVisible(false);
		tfNotes.setText("");
		tfNotes.requestFocus();
		lblNotesAvg.setText("");
		lblBestNote.setText("");
		lblWorstNote.setText("");
		lblNotesCount.setText("");
		btnNew.setVisible(false);
		lblNotes.setText("");
		lblNotesNumber.setVisible(false);
		tfNotesNumber.setText("1");
		tfNotesNumber.setVisible(false);
		btnNotesNumber.setVisible(false);
		lblNewValue.setVisible(false);
		tfNewValue.setVisible(false);
		btnSaveNewValue.setVisible(false);
	}

	private void ok() {
		try {
			notesNumber = Integer.parseInt(tfNotesNumber.getText()) - 1;
			if ((notesNumber >= 0) && (notesNumber < notesCount)) {
				lblNewValue.setText(notesNumber + 1 + ". Note");
				lblNewValue.setVisible(true);
				tfNewValue.setVisible(true);
				btnSaveNewValue.setVisible(true);
				tfNewValue.setText(String.valueOf(notes[notesNumber]));
				tfNewValue.requestFocus();
			} else {
				JOptionPane.showMessageDialog(null, "Notennummer ausserhalb des gültigen Bereichs!");
				tfNotesNumber.requestFocus();
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "ungültiges Zahlenformat!");
		}
	}

	private void speichern() {
		try {
			notes[notesNumber] = Double.parseDouble(tfNewValue.getText());
			total = 0;
			bestNote = notes[0];
			worstNote = notes[0];
			lblNotes.setText("Noten: ");
			for (double note : notes) {
				total = total + note;
				if (bestNote > note) {
					bestNote = note;
				}
				if (worstNote < note) {
					worstNote = note;
				}
				lblNotes.setText(lblNotes.getText() + " " + note);
			}
			notesAvg = total / notesCount;
			lblBestNote.setText("beste Note: " + Double.toString(bestNote));
			lblWorstNote.setText("schlechteste Note: " + Double.toString(worstNote));
			lblNotesAvg.setText("Notenschnitt: " + Double.toString(notesAvg));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ungültiges Zahlenformat!");
		}
	}
}