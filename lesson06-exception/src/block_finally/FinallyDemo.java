package block_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");
		if (file.exists()) {
			String[] employees = { "1, Mnn, 21", "2, Mf, 21", "3, KDB, 32a", "4, LM, 35", "5, RZ, 24b", "6, LF, 19" };
			write(employees, file);
			open(file);
		}
	}

	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
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
					line = tokens[0] + " ---> " + factor;
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
}
