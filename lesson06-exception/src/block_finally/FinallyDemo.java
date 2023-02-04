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
					"1, Le Thai,26",
					"2, Le Ti,27"
			};
			write(employees, file);
			System.out.println("hello 1");
			open(file);
			System.out.println("hello 2");
		}
	}
	
	public static void write(String[] employees, File file) {
		FileWriter fw = null;
		try {
			// open and connect file
			fw = new FileWriter(file);
			//write file
			for(String employee: employees) {
				String[] tokens = employee.split(",");
				String line = null;
				if (!tokens[2].matches("\\d+")) {
					line = ">> Employee " + tokens[0] + " has wrong data ...";
				} else {
					int factor = (Integer.parseInt(tokens[2]) - 20) * 2;
					line = tokens[0] + " ---> " + factor;
				}
				fw.write(line + "\n");
			}
		} catch (IOException e) {
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
