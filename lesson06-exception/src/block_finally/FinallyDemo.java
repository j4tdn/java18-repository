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
					"1, abc, 26",
					"2, bcd, 36",
					"3, def, 46",
					"4, efg, 56",
					"5, fgh, 66",
					"6, ghi, 16"
			};
			write(employees, file);
			open(file);
		}

	}

	public static void write(String[] employees, File file) {
		FileWriter fw = null; // write employees into file by "fw"
		try {
			// open and connect file
			fw = new FileWriter(file);
			// write file
			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				String line = null;
				if (!tokens[2].matches("\\d+")) {
					line = ">>> Employee " + tokens[0] + "has wrong data ...";
				} else {
					int factor = (Integer.parseInt(tokens[2]) - 20) * 2; // factor: hệ số
					line = tokens[0] + " ---> " + factor;
				}
				fw.write(line + "\n");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally { // exception (handle/unhandled) or not => always run
			try {
				fw.close(); // save and close file
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// fw.close(); => shouldn't put it here because when exit unhandled exception
		// --> stop program

		// try - catch
		// try - catch - finally
		// try - finally
	}

	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
