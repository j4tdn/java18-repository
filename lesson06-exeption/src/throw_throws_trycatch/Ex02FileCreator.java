package throw_throws_trycatch;

import java.io.File;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		try {
			File file = createNewFile("data.txt");
			System.out.println("file -->" + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static File createNewFile(String patthname)throws IOException {
		File file = new File(patthname);
		if(!file.exists()) {
			file.createNewFile();
		}
		return file;
	}
}