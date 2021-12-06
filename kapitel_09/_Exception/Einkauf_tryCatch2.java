package kapitel_09._Exception;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Einkauf_tryCatch2 extends JFrame {

	private JPanel cPane;
	private JLabel lResp;
	private JTextField tfSt;
	private JTextField tfStPreis;
	private JTextField tfRabatt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einkauf_tryCatch2 frame = new Einkauf_tryCatch2();
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
	public Einkauf_tryCatch2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		setTitle("Einkaufspreis");
		cPane = new JPanel();
		cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		cPane.setLayout(null);
		setContentPane(cPane);

		// Labels
		JLabel lSt = new JLabel("Stückzahl");
		lSt.setBounds(10, 10, 70, 20);
		cPane.add(lSt);

		JLabel lStPreis = new JLabel("Stückpreis");
		lStPreis.setBounds(135, 10, 70, 20);
		cPane.add(lStPreis);

		JLabel lRabatt = new JLabel("Rabatt (%)");
		lRabatt.setBounds(260, 10, 70, 20);
		cPane.add(lRabatt);

		// Textfields
		tfSt = new JTextField();
		tfSt.setBounds(10, 30, 100, 20);
		tfSt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfStPreis.requestFocus();
				}
			}
		});
		cPane.add(tfSt);

		tfStPreis = new JTextField();
		tfStPreis.setBounds(135, 30, 100, 20);
		tfStPreis.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfRabatt.requestFocus();
				}
			}
		});
		cPane.add(tfStPreis);

		tfRabatt = new JTextField();
		tfRabatt.setBounds(260, 30, 100, 20);
		tfRabatt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					calc();
				}
			}
		});
		cPane.add(tfRabatt);

		// Buttons
		JButton bCalc = new JButton("Berechnen");
		bCalc.setBounds(380, 30, 150, 30);
		bCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		cPane.add(bCalc);

		JButton bEnd = new JButton("Ende");
		bEnd.setBounds(400, 150, 100, 30);
		bEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cPane.add(bEnd);

		lResp = new JLabel();
		lResp.setBounds(100, 50, 500, 30);
		cPane.add(lResp);

		cPane.setVisible(true);
	}

	private void calc() {
		int stueckZahl;
		double rabattSatz, stueckPreis, bruttoPreis, rabatt, einkaufspreis;
		try {
			stueckZahl = Integer.parseInt(tfSt.getText());
			stueckPreis = Double.parseDouble(tfStPreis.getText());
			rabattSatz = Double.parseDouble(tfRabatt.getText());

			bruttoPreis = stueckZahl * stueckPreis;
			rabatt = bruttoPreis * rabattSatz / 100;
			einkaufspreis = bruttoPreis - rabatt;

			DecimalFormat f = new DecimalFormat("#0.00");

			lResp.setText("Einkaufspreis " + f.format(einkaufspreis) + " €");
			tfSt.requestFocus();
			tfSt.selectAll();
		} catch (NumberFormatException e) {
			lResp.setText("Falsches Zahlenformat!");
			tfSt.requestFocus();
			tfSt.selectAll();
		} catch (Exception e) {
			lResp.setText("Fehler bei der Eingabe! " + e);
			tfSt.requestFocus();
			tfSt.selectAll();
		}
	}
}
