package kapitel_09.Aufgabenstellung_094_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
class UhrzeitFormatException extends Exception {
	UhrzeitFormatException() {
		super();
	}

	UhrzeitFormatException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
public class Uhrzeit extends JFrame {

	private JPanel contentPane;
	private JTextField tfStunden;
	private JTextField tfMinuten;
	private JLabel lblUhrzeit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uhrzeit frame = new Uhrzeit();
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
	public Uhrzeit() {
		setTitle("Uhrzeit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblStunden = new JLabel("Stunden");
		lblStunden.setBounds(10, 10, 75, 13);
		contentPane.add(lblStunden);

		JLabel lblMinuten = new JLabel("Minuten");
		lblMinuten.setBounds(85, 10, 75, 13);
		contentPane.add(lblMinuten);

		tfStunden = new JTextField();
		tfStunden.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfStunden.requestFocus();
				}
			}
		});
		tfStunden.setBounds(10, 25, 60, 19);
		contentPane.add(tfStunden);
		tfStunden.setColumns(10);

		tfMinuten = new JTextField();
		tfMinuten.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnen();
				}
			}
		});
		tfMinuten.setBounds(85, 25, 60, 19);
		contentPane.add(tfMinuten);
		tfMinuten.setColumns(10);

		lblUhrzeit = new JLabel();
		lblUhrzeit.setBounds(10, 100, 300, 13);
		contentPane.add(lblUhrzeit);

		JButton btnUmrechnen = new JButton("Übernehmen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				umrechnen();
			}
		});
		btnUmrechnen.setBounds(192, 24, 103, 21);
		contentPane.add(btnUmrechnen);

		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(192, 71, 103, 21);
		contentPane.add(btnEnde);
	}

	private void umrechnen() {
		try {

			int stunden = Integer.parseInt(tfStunden.getText());
			if ((stunden < 0) || (stunden > 23)) {
				tfStunden.requestFocus();
				tfStunden.selectAll();
				throw new UhrzeitFormatException("Ungültige Stundenangabe");
			}

			int minuten = Integer.parseInt(tfMinuten.getText());
			if ((minuten < 0) || (minuten > 59)) {
				tfMinuten.requestFocus();
				tfMinuten.selectAll();
				throw new UhrzeitFormatException("Ungültige Minutenangabe");
			}

			lblUhrzeit.setText("Deine Uhrzeit: " + stunden + ":" + minuten + " Uhr");

		} catch (UhrzeitFormatException e) {
			lblUhrzeit.setText("Ungültige Uhrzeit " + e.getMessage());
		} catch (NumberFormatException e) {
			tfStunden.requestFocus();
			tfStunden.selectAll();
			lblUhrzeit.setText("Ungültige Uhrzeit ");
		}
	}
}
