package kapitel_11._Verzeichnisinhalt;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class FileChooser extends JFrame {

    private JPanel cPane;
    private JTextField tfFolder;
    private File folder;
    private DefaultListModel<String> foldersModel, filesModel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    FileChooser frame = new FileChooser();
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
    public FileChooser() {
	setTitle("Verzeichnisinhalt");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 308);
	cPane = new JPanel();
	cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(cPane);
	cPane.setLayout(null);

	JLabel lblFolder = new JLabel("Verzeichnis");
	lblFolder.setBounds(10, 11, 161, 14);
	cPane.add(lblFolder);

	tfFolder = new JTextField();
	tfFolder.setBounds(10, 25, 414, 20);
	cPane.add(tfFolder);
	tfFolder.setColumns(10);

	JButton btnShowItems = new JButton("Inhalt anzeigen");
	btnShowItems.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	foldersModel.clear();
	    	filesModel.clear();
	    	showItemsBtn();
	    }
	});
	btnShowItems.setBounds(10, 56, 161, 23);
	cPane.add(btnShowItems);

	JLabel lblFolders = new JLabel("Verzeichnisse");
	lblFolders.setBounds(10, 90, 161, 14);
	cPane.add(lblFolders);

	JLabel lblFiles = new JLabel("Dateien");
	lblFiles.setBounds(229, 90, 133, 14);
	cPane.add(lblFiles);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 105, 193, 125);
	cPane.add(scrollPane);

	JList<String> listFolders = new JList<String>();
	scrollPane.setViewportView(listFolders);

	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(229, 105, 195, 125);
	cPane.add(scrollPane_1);

	JList<String> listFiles = new JList<String>();
	scrollPane_1.setViewportView(listFiles);

	JButton btnEnd = new JButton("Ende");
	btnEnd.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	System.exit(0);
	    }
	});
	btnEnd.setBounds(173, 241, 89, 23);
	cPane.add(btnEnd);
	
	foldersModel = new DefaultListModel<String>();
	listFolders.setModel(foldersModel);
	filesModel = new DefaultListModel<String>();
	listFiles.setModel(filesModel);

	JButton btnSelect = new JButton("Auswählen ...");
	btnSelect.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	selectBtn();
	    }
	});
	btnSelect.setBounds(305, 56, 119, 23);
	cPane.add(btnSelect);
    }
    
    void showItemsBtn() {
		if (tfFolder.getText().isEmpty()) {
		    JOptionPane.showMessageDialog(null, "Verzeichnisname fehlt!");
		} else {
		    folder = new File(tfFolder.getText());
		    if (folder.exists() && folder.isDirectory()) {
			String[] items = folder.list();
				for (String item : items) {
					File f = new File(folder, item);
					if (f.isDirectory()) {
						foldersModel.addElement(item);
					} else {
						filesModel.addElement(item);
					}
				}
		    } else {
		    	JOptionPane.showMessageDialog(null, "Verzeichnis existiert nicht!");
		    }
		}
    }
    
    void selectBtn() {
    	JFileChooser fc = new JFileChooser();
    	fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    	int status = fc.showOpenDialog(null);
    	if (status == JFileChooser.APPROVE_OPTION) {
    		File selFile = fc.getSelectedFile();
    		tfFolder.setText(selFile.getPath());
    	}
    }
}