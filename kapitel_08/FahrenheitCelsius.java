package kapitel_08;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class FahrenheitCelsius extends JFrame {

	private JPanel contentPane;
	private JTextField tfFahrenheit;
	private JTextField tfCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FahrenheitCelsius frame = new FahrenheitCelsius();
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
	public FahrenheitCelsius() {
		setTitle("Umrechnung Fahrenheit Celsius");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFahrenheit = new JLabel("Grad Fahrenheit");
		lblFahrenheit.setBounds(10, 10, 123, 13);
		contentPane.add(lblFahrenheit);

		tfFahrenheit = new JTextField();
		tfFahrenheit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnen();
				}
			}
		});
		tfFahrenheit.setBounds(10, 25, 123, 19);
		contentPane.add(tfFahrenheit);
		tfFahrenheit.setColumns(10);

		JLabel lblCelsius = new JLabel("Grad Celsius");
		lblCelsius.setBounds(10, 54, 123, 13);
		contentPane.add(lblCelsius);

		tfCelsius = new JTextField();
		tfCelsius.setEditable(false);
		tfCelsius.setBounds(10, 72, 123, 19);
		contentPane.add(tfCelsius);
		tfCelsius.setColumns(10);

		JButton btnUmrechnen = new JButton("Umrechnen");
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
		double fahrenheit = Double.parseDouble(tfFahrenheit.getText());
		double celsius = (fahrenheit - 32) * 5 / 9;
		DecimalFormat f = new DecimalFormat("#0.00");
		tfCelsius.setText(f.format(celsius));
		tfFahrenheit.requestFocus();
		tfFahrenheit.selectAll();
	}
}
