package throw_throws_trycatch;

import java.io.File;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		try {
			File f = createNewFile("data.txt");
			System.out.println("file >>> " + f.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//data.txt --> ../current_project_path/data.txt
	private static File createNewFile(String pathName) throws IOException {
		File file = new File(pathName);
		if(!file.exists()) {
			file.createNewFile(); // throws compile-exception
		}
		return file;
	}
}
