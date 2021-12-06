package kapitel_08.Aufgabe_084_4;

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
public class Rechner extends JFrame {

	private JPanel cPane;
	private JTextField tfOp1;
	private JTextField tfOp2;
	private JTextField tfResp;


	private double a, b, result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner frame = new Rechner();
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
	public Rechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 200);
		setTitle("Rechner - von Unbekannt ;-)");
		cPane = new JPanel();
		cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		cPane.setLayout(null);
		setContentPane(cPane);

		// Labels (TOP)
		JLabel lOp1 = new JLabel("Operant1");
		lOp1.setBounds(10, 10, 70, 20);
		cPane.add(lOp1);

		JLabel lOp2 = new JLabel("Operant2");
		lOp2.setBounds(240, 10, 70, 20);
		cPane.add(lOp2);

		// Textfields (TOP)
		tfOp1 = new JTextField();
		tfOp1.setBounds(10, 30, 100, 20);
		tfOp1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfOp2.requestFocus();
				}
			}
		});
		cPane.add(tfOp1);

		tfOp2 = new JTextField();
		tfOp2.setBounds(240, 30, 100, 20);
		cPane.add(tfOp2);

		// Buttons
		JButton bPlus = new JButton("+");
		bPlus.setBounds(120, 30, 50, 30);
		bPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cPlus();
			}
		});
		cPane.add(bPlus);

		JButton bMinus = new JButton("-");
		bMinus.setBounds(180, 30, 50, 30);
		bMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cMinus();
			}
		});
		cPane.add(bMinus);

		JButton bMult = new JButton("*");
		bMult.setBounds(120, 70, 50, 30);
		bMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cMult();
			}
		});
		cPane.add(bMult);

		JButton bDiv = new JButton("/");
		bDiv.setBounds(180, 70, 50, 30);
		bDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cDiv();
			}
		});
		cPane.add(bDiv);

		// Label (Bottom)
		JLabel lResp = new JLabel("Ergebnis");
		lResp.setBounds(10, 100, 70, 20);
		cPane.add(lResp);

		// Textfield (Bottom)
		tfResp = new JTextField();
		tfResp.setBounds(10, 120, 330, 20);
		tfResp.setEditable(false);
		cPane.add(tfResp);

		cPane.setVisible(true);
	}

	private void cPlus() {
		if (tfOp1.getText().equals("") || tfOp2.getText().equals("")) {
			tfResp.setText("Bitte Operant eingeben");
		} else {
			a = Double.parseDouble(tfOp1.getText());
			b = Double.parseDouble(tfOp2.getText());
			result = a + b;
			tfResp.setText(a + " + " + b + " = " + result);
		}
	}

	private void cMinus() {
		if (tfOp1.getText().equals("") || tfOp2.getText().equals("")) {
			tfResp.setText("Bitte Operant eingeben");
		} else {
			a = Double.parseDouble(tfOp1.getText());
			b = Double.parseDouble(tfOp2.getText());
			result = a - b;
			tfResp.setText(a + " - " + b + " = " + result);
		}
	}

	private void cMult() {
		if (tfOp1.getText().equals("") || tfOp2.getText().equals("")) {
			tfResp.setText("Bitte Operant eingeben");
		} else {
			a = Double.parseDouble(tfOp1.getText());
			b = Double.parseDouble(tfOp2.getText());
			result = a * b;
			tfResp.setText(a + " * " + b + " = " + result);
		}
	}

	private void cDiv() {
		if (tfOp1.getText().equals("") || tfOp2.getText().equals("")) {
			tfResp.setText("Bitte Operant eingeben");
		} else {
			a = Double.parseDouble(tfOp1.getText());
			b = Double.parseDouble(tfOp2.getText());
			result = a / b;
			tfResp.setText(a + " / " + b + " = " + result);
		}
	}
}
