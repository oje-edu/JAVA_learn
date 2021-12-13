package kapitel_11._Contactlist_;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

@SuppressWarnings("serial")
public class OJE_Contactlist extends JFrame {

	private JPanel cPane;
	private JTextField tfLastname;
	private JTextField tfFirstname;
	private JTextField tfTel;
	private JTextField tfEmail;
	private DefaultListModel<String> contactModel;
	
	// private String fileName = "." + File.separator + "kontakte.dat";
	private String fileName = "src/kapitel_11/_Contactlist_/contacts.dat";

	private int index;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OJE_Contactlist frame = new OJE_Contactlist();
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
	public OJE_Contactlist() {
		setTitle("Kontaktliste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 308);
		cPane = new JPanel();
		cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cPane);
		cPane.setLayout(null);

		JLabel lblLastname = new JLabel("Nachname");
		lblLastname.setBounds(154, 11, 87, 14);
		cPane.add(lblLastname);

		tfLastname = new JTextField();
		tfLastname.setBounds(155, 27, 131, 20);
		cPane.add(tfLastname);
		tfLastname.setColumns(10);

		JLabel lblFirstname = new JLabel("Vorname");
		lblFirstname.setBounds(10, 11, 105, 14);
		cPane.add(lblFirstname);

		tfFirstname = new JTextField();
		tfFirstname.setBounds(10, 27, 131, 20);
		cPane.add(tfFirstname);
		tfFirstname.setColumns(10);

		JLabel lblTel = new JLabel("Telefon");
		lblTel.setBounds(300, 11, 116, 14);
		cPane.add(lblTel);

		tfTel = new JTextField();
		tfTel.setBounds(296, 27, 218, 20);
		cPane.add(tfTel);
		tfTel.setColumns(10);

		JLabel lblEmail = new JLabel("eMail");
		lblEmail.setBounds(10, 58, 131, 14);
		cPane.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(10, 74, 276, 20);
		cPane.add(tfEmail);
		tfEmail.setColumns(10);

		JButton btnApply = new JButton("Hau weg!");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnApply();
			}
		});
		btnApply.setBounds(300, 73, 214, 23);
		cPane.add(btnApply);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 119, 504, 105);
		cPane.add(scrollPane);

		JList<String> listContacts= new JList<>();
		listContacts.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(listContacts);

		JLabel lblContactlist = new JLabel("Kontaktliste");
		lblContactlist.setBounds(10, 105, 131, 14);
		cPane.add(lblContactlist);

		JButton btnEnd = new JButton("Ende");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEnd();
			}
		});
		btnEnd.setBounds(425, 235, 89, 23);
		cPane.add(btnEnd);

		contactModel = new DefaultListModel<>();
		listContacts.setModel(contactModel);
		
		// Read
		readTheShit();

		JButton btnDelete = new JButton("markierten Eintrag löschen");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = listContacts.getSelectedIndex();
				btnDelete();
			}
		});
		btnDelete.setBounds(10, 235, 191, 23);
		cPane.add(btnDelete);

		JButton btnEdit = new JButton("bearbeiten");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = listContacts.getSelectedIndex();
				btnEdit();
			}
		});
		btnEdit.setBounds(247, 235, 124, 23);
		cPane.add(btnEdit);
	}
	
	void readTheShit() {
		File file = new File(fileName);
		BufferedReader in = null;
		if (!file.exists()) {
		    try {
			file.createNewFile();
		    } catch (IOException ex) {
		    	ex.printStackTrace();
		    }
		} else {
		    String adress;
		    try {
			in = new BufferedReader(new FileReader(fileName));
			while ((adress = in.readLine()) != null) {
			    contactModel.addElement(adress);
			}
		    } catch (IOException ex) {
		    	ex.printStackTrace();
		    } finally {
		    	if (in != null) {
		    		try {
		    			in.close();
		    		} catch (IOException e) {
		    			e.printStackTrace();
		    		}
		    	}
		    }
		}
	}

	void btnApply() {
		if (tfLastname.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Kein Name angegeben.");
			tfLastname.requestFocus();
		} else {
			contactModel.addElement(tfLastname.getText() + ";" + tfFirstname.getText() + ";" + tfTel.getText() + ";"
					+ tfEmail.getText());
			tfLastname.setText("");
			tfFirstname.setText("");
			tfTel.setText("");
			tfEmail.setText("");
			tfLastname.requestFocus();
		}
	}

	void btnDelete() {
		if (index >= 0) {
			contactModel.remove(index);
		} else {
			JOptionPane.showMessageDialog(null, "Kein Eintrag markiert.");
		}
	}

	void btnEdit() {
		if (index >= 0) {
			String zeile = (String) contactModel.getElementAt(index);
			String[] einzelwerte = zeile.split(";");
			tfLastname.setText(einzelwerte[0]);
			tfFirstname.setText(einzelwerte[1]);
			tfTel.setText(einzelwerte[2]);
			tfEmail.setText(einzelwerte[3]);
			contactModel.remove(index);
		}
	}
	
	void btnEnd() {
		BufferedWriter out = null;
		try {
		    out = new BufferedWriter(new FileWriter(fileName));
		    for (int i = 0; i < contactModel.getSize(); i++) {
		    	out.write(contactModel.get(i).toString());
		    	out.newLine();
		    }
		} catch (IOException ex) {
		    ex.printStackTrace();
		} finally {
		    if (out != null) {
		    	try {
		    		out.close();
		    	} catch (IOException ex) {
		    		ex.printStackTrace();
		    	}
		    }
		}
		System.exit(0);
	}
}

/*
Erweitern Sie das Programm aus Aufgabe 6 so,
dass ein Eintrag der Liste nachträglich bearbeitet werden kann.
Dazu sollte ein markierter Eintrag aus der Liste entfernt
und die Daten wieder zurück in die Textfelder übertragen werden.
Nachdem die Daten dort verändert worden sind,
können sie dann mit dem Button Übernehmen
wieder in die Liste übernommen werden (siehe Abbildung 10.24 auf Seite 382).
Um einen Eintrag aus der Liste zurück in die Textfelder zu übertragen,
können Sie den markierten Eintrag in eine Stringvariable übernehmen
und den Eintrag aus der Listbox löschen.
Mit der Methode substring der Klasse String kann
der erste Teilstring vom Anfang bis zum ersten Auftreten
eines Semikolons in das Textfeld für den Nachnamen übertragen werden.
Löschen Sie nun diesen ersten Teilstring aus der Stringvariablen,
und Sie können in gleicher Weise den Vornamen usw.
aus der Stringvariablen extrahieren.

Alternativ können Sie zum Zerlegen auch die Methode split()
der Klasse String verwenden.
Sie geben der Methode als Parameter das Trennzeichen (hier das Semikolon) mit.
Die Methode liefert ein String-Array zurück,
das die durch das Trennzeichen getrennten Einzelstrings enthält.
*/