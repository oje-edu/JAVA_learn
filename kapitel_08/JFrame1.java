package kapitel_08;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class JFrame1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 816966099082086076L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame1 frame = new JFrame1();
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
	public JFrame1() {
		// setBounds(new Rectangle(100, 100, 1050, 750));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JFrame1");
		setBounds(100, 100, 1050, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}

}
