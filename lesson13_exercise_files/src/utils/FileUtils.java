package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	private FileUtils() {

	}

	public static File createFile(String path) {
		System.out.println(">>>Dir " + path + " is creating...");
		File file = new File(path);
		// Tạo file
		if (!file.exists()) {
			try {
				// Lấy đường dẫn từ folder cha
				createDir(file.getParent());
				boolean isSuccess = file.createNewFile();
				System.out
						.println(isSuccess ? "Create file " + file.getName() + " successfully" : "Fail to create file");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("This file is available");
		}
		return file;
	}

	public static File createDir(String path) {
		File dir = new File(path);
		System.out.println(">>>Dir " + path + " is creating...");
		// Tạo folder cho file
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(isSuccess ? "Create file successfully" : "Fail to create file");
		} else {
			System.out.println("This dir is available");
		}
		return dir;
	}
}
