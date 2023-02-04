package block_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyDemo {
	private static final String PATH = "data.txt";
	
	public static void main(String[] args) {
		File file = new File(PATH);
		if (file.exists()) {
			String[] employees = {
					"1, NGUYEN A, 27",
					"2, NGUYEN B, 26",
					"3, NGUYEN C, 2g",
					"4, NGUYEN D, 10",
					"5, NGUYEN E, 40",
					"6, NGUYEN F, 25"
			};
			// 1 --> (age-initAge)*2 (hệ số)
			write(employees, file);
			open(file);
		}
	}
	
	public static void write(String[] employees, File file) {
		FileWriter fw = null;
		try {
			// open and connect file
			fw = new FileWriter(file);
			// write file
			for (String employee: employees) {
				String [] tokens = employee.split(", ");
				String line = null;
				if (!tokens[2].matches("\\d+")) {
					line = ">>> Employee " + tokens[0] + " has wrong data";
				} else {
					int factor = (Integer.parseInt(tokens[2]) - 20) *2;
					line = tokens[0] + "-->" + factor;
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
