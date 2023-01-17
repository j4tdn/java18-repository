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
			String[] employees = { "1, Le Teo, 26", "2, Le Teo, -25", "3, Le Teo, 24", "4, Le Teo, 23", "5, Le Teo, 22",
					"6, Le Teo, 21", };
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
					line = ">>> Emloyee" + tokens[0] + "has wrong data";
				} else {
					int factor = (Integer.parseInt(tokens[2]) - 20) * 2;
					line = tokens[0] + "--->" + factor;
				}
				fw.write(line + "\n");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e) {
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
