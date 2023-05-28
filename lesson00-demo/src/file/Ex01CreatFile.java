package file;

import java.io.File;
import java.io.IOException;

public class Ex01CreatFile {

	private static final String path = "data\\qwer\\test.txt";
	
	public static void main(String[] args) {
		File file = new File(path);
		if(!file.exists()) {
			File root = file.getParentFile();
			root.mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
