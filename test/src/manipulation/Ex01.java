package manipulation;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import youtiu.Fileyoutiu;

public class Ex01 {
	private static final String path = "data/readme.txt";
	
	public static void main(String[] args) {
		File file = new File(path);
		
		// write file
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			
			bw.write("Line1\n");
			bw.write("Line2");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			Fileyoutiu.close(bw,fw);
		}
		
		System.out.println("======= ---- ======");
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// read 
		
		
	}
}
