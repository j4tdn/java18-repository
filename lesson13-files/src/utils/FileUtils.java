package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileUtils {
	private FileUtils() {
		
	}
	
	public static File createFile(String path) {
		System.out.println("\n>> file " + path + "is creating ...");
		
		File file = new File(path);
		if(!file.exists()) {
			// Lấy đường dẫn root folder --> data\\storage
			// String rootPath = pathname.substring(0, lastSeparatorIndex);
			createDir(file.getParent());
			
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File + " + file.getName() + "is created successful --> " + isSuccess);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
	
	public static File createDir(String path) {
		System.out.println("\n>> Dir " + path + "is creating ...");
		
		File dir = new File(path);
		
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			if(isSuccess) {
				System.out.println("Dir" + path + "is created successful.");
			} else {
				System.out.println("Dir " + path + "is existed already");
			}
		}
		
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
