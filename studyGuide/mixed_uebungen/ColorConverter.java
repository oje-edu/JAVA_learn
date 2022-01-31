package studyGuide.mixed_uebungen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class ColorConverter extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4040851372994487035L;
	private JPanel contentPane;
	private JTextField input;
	private JButton btnCalc;
	private JTextField output;
	private JButton btnCopy;
	private JLabel preview;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorConverter frame = new ColorConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ColorConverter() {

		setTitle("Farbkonverter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 160);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		preview = new JLabel("");
		preview.setBounds(315, 10, 70, 65);
		preview.setOpaque(true);
		preview.setVisible(false);

		contentPane.add(preview);

		input = new JTextField();
		input.setBounds(10, 10, 300, 30);

		input.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {

				btnCopy.setVisible(false);
				preview.setVisible(false);

			}

			public void focusLost(FocusEvent e) {
			}

		});

		contentPane.add(input);

		btnCopy = new JButton("Copy");
		btnCopy.setBounds(315, 80, 70, 30);
		// btnCopy.setVisible(false);

		contentPane.add(btnCopy);

		btnCopy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String result = output.getText();
				StringSelection resultCopy = new StringSelection(result);
				Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
				cp.setContents(resultCopy, null);

			}

		});

		btnCalc = new JButton("Berechnen");
		btnCalc.setBounds(10, 45, 300, 30);

		contentPane.add(btnCalc);

		btnCalc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String userInput = sanitizeInput(input.getText());

				if (userInput.equals("")) {
					output.setText("Leere Eingabe");
					output.setDisabledTextColor(Color.RED);
					input.requestFocus();
					return;
				}

				String result = (userInput.startsWith("#")) ? hexToRGB(userInput) : RGBToHex(userInput);

				Color c = setColor(result);
				output.setDisabledTextColor(c);
				output.setText(result);
				btnCopy.setVisible(true);
				preview.setBackground(c);
				preview.setVisible(true);

			}
		});

		output = new JTextField();
		output.setBounds(10, 80, 300, 30);
		output.setEnabled(false);

		contentPane.add(output);

	} // EndOfConstructor

	private Color setColor(String value) {

		int r, g, b;
		if (value.startsWith("#")) {
			value = value.substring(1);
			r = Integer.parseInt(String.valueOf(value.charAt(0)) + String.valueOf(value.charAt(0)), 16);
			g = Integer.parseInt(String.valueOf(value.charAt(1)) + String.valueOf(value.charAt(1)), 16);
			b = Integer.parseInt(String.valueOf(value.charAt(2)) + String.valueOf(value.charAt(2)), 16);
		} else {
			value = sanitizeRGBInput(value).toLowerCase();
			String[] channels = value.split(",");
			r = Integer.parseInt(channels[0]);
			g = Integer.parseInt(channels[1]);
			b = Integer.parseInt(channels[2]);
		}

		return new Color(r, g, b);

	}

	private String sanitizeInput(String input) {

		String s;
		s = input.replaceAll("\\s+", "").toLowerCase();

		return s;
	}

	private String sanitizeRGBInput(String input) {

		if (input.startsWith("rgb(")) {
			input = input.substring(4);
		}
		if (input.startsWith("rgba(")) {
			input = input.substring(5);
		}

		if (input.endsWith(")")) {
			input = input.substring(0, input.length() - 1);
		}

		return input;
	}

	private boolean validateHexValue(String hex) {

		if (hex.length() != 3 && hex.length() != 6)
			return false;
		if (!hex.matches("[0-9a-f]+"))
			return false;

		return true;
	}

	private boolean validateRGBValue(String rgb) {

		String[] channels = rgb.split(",");

		if (channels.length < 3)
			return false;

		for (int i = 0; i < 3; i++) {

			if (!channels[i].matches("[0-9]+"))
				return false;
			int value = Integer.parseInt(channels[i]);
			if (value < 0 || value > 255)
				return false;
		}

		return true;
	}

	private String normalizeHexValue(String hex) {

		String r = String.valueOf(hex.charAt(0)) + String.valueOf(hex.charAt(0));
		String g = String.valueOf(hex.charAt(1)) + String.valueOf(hex.charAt(1));
		String b = String.valueOf(hex.charAt(2)) + String.valueOf(hex.charAt(2));

		return String.format("%s%s%s", r, g, b);
	}

	private String calculateRGB(String hex) {

		String r = hex.substring(0, 2);
		String g = hex.substring(2, 4);
		String b = hex.substring(4);

		int red = Integer.parseInt(r, 16);
		int green = Integer.parseInt(g, 16);
		int blue = Integer.parseInt(b, 16);

		return String.format("rgb(%s,%s,%s)", red, green, blue);
	}

	private String calculateHex(String rgb) {

		String[] channels = rgb.split(",");
		StringBuilder sb = new StringBuilder("#");
		for (int i = 0; i < 3; i++) {
			int value = Integer.parseInt(channels[i]);
			sb.append(Integer.toHexString(value));
		}

		return sb.toString().toLowerCase();

	}

	private String hexToRGB(String userInput) {

		String hex = userInput.substring(1);

		if (!validateHexValue(hex)) {
			output.setText("Falsche Eingabe");
			output.setDisabledTextColor(Color.RED);
			input.requestFocus();
			return null;
		}

		if (hex.length() == 3)
			hex = normalizeHexValue(hex);

		return calculateRGB(hex);
	}

	private String RGBToHex(String userInput) {

		userInput = sanitizeRGBInput(userInput);

		if (!validateRGBValue(userInput)) {
			output.setText("Falsche Eingabe");
			output.setDisabledTextColor(Color.RED);
			input.requestFocus();
			return null;
		}

		return calculateHex(userInput);
	}

}
