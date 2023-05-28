package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileUtils {
	private FileUtils() {
		
	}
	public static File createFile(String path) {
		File file = new File(path);
		
		if (!file.exists()) 
			createDir(file.getParent());
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File " + file.getName()
										+ " is created successful --> " + isSuccess);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		return file;
	}
	
	public static File createDir(String path) {
		System.out.println("\n>>Dir "+ path + "is creating ....");
		File dir = new File(path);
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println("Dir " + dir.getAbsolutePath() 
			+ "is created successful");
		}else {
			System.out.println("Đã tồn tại");
			}
		return dir;
	}
	
	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

