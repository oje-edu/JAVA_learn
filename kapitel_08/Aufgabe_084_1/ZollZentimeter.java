package kapitel_08.Aufgabe_084_1;

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
public class ZollZentimeter extends JFrame {

	private JPanel contentPane;
	private JLabel unitCm;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZollZentimeter frame = new ZollZentimeter();
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
	public ZollZentimeter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Umrechnung Zoll in cm");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel unitInch = new JLabel("Zoll");
		unitInch.setBounds(10,10,100, 10);
		contentPane.add(unitInch);
		
		unitCm = new JLabel();
		unitCm.setBounds(200,140,100,20);
		contentPane.add(unitCm);
		
		tf1 = new JTextField();
		tf1.setBounds(10,30,100,30);
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					calc();
				}
			}
		});
		contentPane.add(tf1);
		
		JButton bCalc = new JButton("Umrechnen");
		bCalc.setBounds(10,80,100,30);
		bCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		contentPane.add(bCalc);
		
		JButton bEnd = new JButton("Ende");
		bEnd.setBounds(320,80,100,30);
		bEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(bEnd);
		
		contentPane.setVisible(true);
	}
	
	private void calc() {
		double inch = Double.parseDouble(tf1.getText());
		double cm = inch * 2.54;
		DecimalFormat f = new DecimalFormat("#0.00");
		unitCm.setText(f.format(cm) + " cm");
		tf1.requestFocus();
		tf1.selectAll();
	}
}
