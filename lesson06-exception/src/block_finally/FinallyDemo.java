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
					"1, Le Teo, 26", 
					"2, Viet Tay, 20",
					"3, Viet Tay, 20",
					"4, Viet Tay, 20b",
					"5, Viet Tay, 20",
					"6, Viet Tay, 20c",
					"7, Viet Tay, 20",
					"8, Viet Tay, 20d"
			};
			// 1 --> (age - initAge) * 2 (hệ số)
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
			for(String employee: employees) {
				String[] tokens = employee.split(", ");
				String line = null;;
				if (!tokens[2].matches("\\d+")) {
					line = ">>> Employee " + tokens[0] + " has wrong data...";
				} else {
					int factor = (Integer.parseInt(tokens[2]) - 20) * 2;
					line = tokens[0] + "---> " + factor;
				}
				fw.write(line + "\n");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			// exception(handle/unhandled)
			// no exception
			// save and close file
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//exist unhandled exception --> stop program
			//wf.close();
			
			// try --> catch
			// try --> catch --> finally
			// try ---> finally
		}
	}

	private static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
