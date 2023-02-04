package throw_throws_trycatch;

import java.io.File;
import java.io.IOException;

public class Ex02FileCreater {
	public static void main(String[] args) {
		try {
		File file = createNewFie("data.txt");
		System.out.println("file" + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// data.txt --> ../current_project_path/data.txt
	// .../..data.txt
	private static File createNewFie(String pathname) throws IOException{
		File file = new File(pathname);
		if (!file.exists()) {
			file.createNewFile(); // 
		}
		return file;
	}
}
