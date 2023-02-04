package throw_throws_trycatch;

import java.io.File;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args){
		try {
			File file = createNewFile("data.txt");
			System.out.println("file --> " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// data.txt --> ../current_project_path/data.txt
	// .../..data.txt
	private static File createNewFile(String pathname) throws IOException {
		File file = new File(pathname);
		if (!file.exists()) {
			file.createNewFile(); // throws compile-exception
		}
		return file;
	}
}
