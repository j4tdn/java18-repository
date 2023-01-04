package block_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.DesktopIconUI;

public class FinallyDemo {

	private static final String PATH = "data.txt";

	public static void main(String[] args) {
		File file = new File(PATH);
		if (file.exists()) {
			String[] employees = { "1, Le Teo, 26",
					"2, Le Teo 1, 22", 
					"3, Le Teo 2, 23", 
					"4, Van Na, 28a",
					"5, Van Tai, 18", 
					"6, Van Tai 1, 18", 
					"7, Van Tai 2, 18", 
					"8, Van Tai 3, bb", 
					"9, Van Tai 4, 18" };
			write(employees, file);
			open(file);
		}

	}

	public static void write(String[] employees, File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);

			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				String line = null;
				if (!tokens[2].matches("\\d+")) {
					line = ">>> Employee " + tokens[0] + " has wrong data ...";
				} else {
					int factor = (Integer.parseInt(tokens[2]) - 20) * 2;
					line = tokens[0] + "---> " + factor;
				}
				fw.write(line + "\n");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
