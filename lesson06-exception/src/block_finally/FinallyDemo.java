package block_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyDemo {
	private static final String PATH = "data.txt";
	public static void main(String[] args) {
		
		File file = new File(PATH);
		if(file.exists()) {
			String[] employees = {
					"1, Le Teo, 22",
					"2, Le Teo2, 23",
					"3, Le Teo3, 26s",
					"4, Le Teo4, 40",
					"5, Le Teo5, 2ws",
					"6, Le Teo6, 20",
					"7, Le Teo, 23"
			};
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
			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				String line = null;
				if (!tokens[2].matches("\\d+")) {
					line = ">> Employee " + tokens[0] + " has wrong data ...";
				} else {
					int factor = (Integer.parseInt(tokens[2]) - 20) * 2;
					line = tokens[0] + " ---> " + factor;
				}
				fw.write(line + "\n");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			// exception(handle/unhandle)
			// no
			// save and close file
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// exit unhandled exception -- stop ỏigran
		// fw.close
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
