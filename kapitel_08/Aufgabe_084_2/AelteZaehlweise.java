package kapitel_08.Aufgabe_084_2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
// import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AelteZaehlweise extends JFrame {

	private JPanel cPane;
	private JLabel unitGros;
	private JLabel unitSchock;
	private JLabel unitDutzend;
	private JLabel unitStueck;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AelteZaehlweise frame = new AelteZaehlweise();
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
	public AelteZaehlweise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setTitle("Alte Zählweise");
		cPane = new JPanel();
		cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		cPane.setLayout(null);
		setContentPane(cPane);
		
		JLabel lMain = new JLabel("Geben Sie eine Stückzahl an:");
		lMain.setBounds(10,10,300,20);
		cPane.add(lMain);
		
		// Textfield
		tf1 = new JTextField();
		tf1.setBounds(10,40,100,30);
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					calc();
				}
			}
		});
		cPane.add(tf1);
		
		// Button TOP
		JButton bCalc = new JButton("In alte Zählmaße umrechnen");
		bCalc.setBounds(180,40,250,30);
		bCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		cPane.add(bCalc);
		
		unitGros = new JLabel();
		unitGros.setBounds(10,180,100,20);
		cPane.add(unitGros);
		
		unitSchock = new JLabel();
		unitSchock.setBounds(10,210,100,20);
		cPane.add(unitSchock);
		
		unitDutzend = new JLabel();
		unitDutzend.setBounds(10,240,100,20);
		cPane.add(unitDutzend);
		
		unitStueck = new JLabel();
		unitStueck.setBounds(10,270,100,20);
		cPane.add(unitStueck);
		

		// Button BOTTOM
		
		JButton bEnd = new JButton("Ende");
		bEnd.setBounds(220,250,100,30);
		bEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cPane.add(bEnd);
		
		cPane.setVisible(true);
	}
	
	private void calc() {
		int gros, dutz, schock;
		int st = Integer.parseInt(tf1.getText());
		gros = st / 144;
		st = st % 144;
		schock = st / 60;
		st = st % 60;
		dutz = st / 12;
		st = st % 12;

		
		// DecimalFormat f = new DecimalFormat("#0.00");
		unitDutzend.setText(dutz + " Dutzend");
		unitSchock.setText(schock + " Schock");
		unitGros.setText(gros + " Gros");
		unitStueck.setText(st + " Stoß");
		tf1.requestFocus();
		tf1.selectAll();
	}

}
