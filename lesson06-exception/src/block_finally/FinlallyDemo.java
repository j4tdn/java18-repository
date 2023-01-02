package block_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinlallyDemo {
	public static String PATH = "data.txt";
	
	public static void main(String[] args) {
		File file = new File(PATH);
		if (file.exists()) {
			String[] students = { 
					"1, Le Teo, 26", 
					"2, Van Na, 22", 
					"3, Van tai, 23",
					"4, Van tai, 18",
					"5, Van tai, 18",
					"6, Van tai, 18",
					"7, Van tai, 18",
					"8, Van tai, 18",
					"9, Van tai, 18"};
			write(students, file);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}