package kapitel_10.Aufgabe_104_5;

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
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Contactlist extends JFrame {

	private JPanel contentPane;
	private JTextField tfNachname;
	private JTextField tfVorname;
	private JTextField tfTelefon;
	private JTextField tfEmail;
	private DefaultListModel<String> kontakteModel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contactlist frame = new Contactlist();
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
	public Contactlist() {
		setTitle("Kontaktliste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(10, 11, 105, 14);
		contentPane.add(lblNachname);

		tfNachname = new JTextField();
		tfNachname.setBounds(10, 27, 131, 20);
		contentPane.add(tfNachname);
		tfNachname.setColumns(10);

		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(154, 11, 87, 14);
		contentPane.add(lblVorname);

		tfVorname = new JTextField();
		tfVorname.setBounds(155, 27, 131, 20);
		contentPane.add(tfVorname);
		tfVorname.setColumns(10);

		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(300, 11, 116, 14);
		contentPane.add(lblTelefon);

		tfTelefon = new JTextField();
		tfTelefon.setBounds(296, 27, 218, 20);
		contentPane.add(tfTelefon);
		tfTelefon.setColumns(10);

		JLabel lblEmail = new JLabel("eMail");
		lblEmail.setBounds(10, 58, 131, 14);
		contentPane.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(10, 74, 276, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);

		JButton btnUebernehmen = new JButton("Übernehmen >>");
		btnUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnApply();
			}
		});
		btnUebernehmen.setBounds(300, 73, 214, 23);
		contentPane.add(btnUebernehmen);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 119, 504, 105);
		contentPane.add(scrollPane);

		JList<String> listKontakte = new JList<>();
		scrollPane.setViewportView(listKontakte);

		JLabel lblKontaktliste = new JLabel("Kontaktliste");
		lblKontaktliste.setBounds(10, 105, 131, 14);
		contentPane.add(lblKontaktliste);

		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(396, 236, 89, 23);
		contentPane.add(btnEnde);

		kontakteModel = new DefaultListModel<>();
		listKontakte.setModel(kontakteModel);
	}
	
	void btnApply() {
		if (tfNachname.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Kein Name angegeben.");
			tfNachname.requestFocus();
		} else {
			kontakteModel.addElement(tfNachname.getText() + ";" + tfVorname.getText() + ";"
					+ tfTelefon.getText() + ";" + tfEmail.getText());
			tfNachname.setText("");
			tfVorname.setText("");
			tfTelefon.setText("");
			tfEmail.setText("");
			tfNachname.requestFocus();
		}
	}
}

/*
 * Erstellen Sie ein Programm mit dem Namen Kontaktliste zur Verwaltung einer
 * Liste von Kontaktdaten. Dazu erstellen Sie den Frame aus Abbildung 10.22
 * (Seite 381).
 * 
 * Beim Betätigen des Buttons Ende soll der Frame geschlossen und damit das
 * Programm beendet werden. Wird der Button Übernehmen betätigt, sollen die
 * Werte aus den Textfeldern als neue Zeile in die Listbox übernommen werden.
 * Dabei sollen die einzelnen Felder durch ein Semikolon getrennt werden.
 */
