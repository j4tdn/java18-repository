package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileUtils {
	private FileUtils() {
		// TODO Auto-generated constructor stub
	}

	public static File createFile(String path) {
		System.out.println();
		File file = new File(path);
		if(!file.exists()) {
			String root = file.getParent();
			createDir(root);
			try {
				boolean isSucces = file.createNewFile();
				System.out.println("File " + file.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return file;
	}

	public static File createDir(String path) {
		System.out.println("------>");
		File dir = new File(path);
		if(!dir.exists()) {
			boolean isSucces = dir.mkdirs();
			if(isSucces) {
				System.out.println("Dir " + path + " is created successful." );
			}
		}
		System.out.println("Dir " + path + "is readly");
		return dir;
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
