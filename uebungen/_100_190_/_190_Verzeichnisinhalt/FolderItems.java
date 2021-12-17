package uebungen._100_190_._190_Verzeichnisinhalt;

import java.io.File;
import java.util.ArrayList;

public class FolderItems {

	public static void main(String[] args) {
		String path = "src";

		File f1 = new File(path);
		String f1List[] = f1.list();
		ArrayList<File> folder = new ArrayList<>();
		ArrayList<File> file = new ArrayList<>();

		for (int i = 0; i < f1List.length; i++) {
			File item = new File(f1.getPath() + "/" + f1List[i]);
			if (item.isDirectory()) {
				folder.add(item);
			}
			else if (item.isFile()) {
				file.add(item);
			}
		}
		System.out.println("Verzeichnisse: ");
		for (File f : folder) {
			System.out.println(f.getName());
		}
		
		System.out.println();

		System.out.println("Dateien: ");
		for (File f : file) {
			System.out.println(f.getName());
		}
	}
}

// Schreibe ein Programm, dass von einem Verzeichnisinhalt zwei ArrayListen erstellt.
// Eine mit den Verzeichnissen und eine mit den Datein.
// Die Inhalte der ArrayListen am Ende sortiert werden
