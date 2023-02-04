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
					"1, Le Teo, 26",
					"2, Les Teo, 36",
					"3, L Teo, 46",
					"5, Le Tseo, 56",
					"6, Les Tedo, 66",
					"7, Le Teot, 7á6",
					"8, Lse Teo, 86"
			};
			// 1 -->(age-initAge)*2(he so)
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
				String[] tokens = employee.split(", ");
				String line = null;
				if (!tokens[2].matches("\\d+")) {
					line = ">> Employee " +tokens[0] + " has wrong date...";
					
				}else {
					int factor = (Integer.parseInt(tokens[2]) - 20)*2 ;
					line = tokens[0] + "---->" + factor;
				}
				fw.write(line + "\n");
			}
		} catch(NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			// exception(handle/unhandle)
			// no 
			// save and close file
			try {
				fw.close();
				
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// exist unhandle exception --> stop program
		// fw.close();
		
		//try --> catch
		//try -->catch -->finally
		//try -->finally	
		
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
