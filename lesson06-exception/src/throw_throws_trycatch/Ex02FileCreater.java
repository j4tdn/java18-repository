package throw_throws_trycatch;

import java.io.File;
import java.io.IOException;

public class Ex02FileCreater {
	public static void main(String[] args) {
		try {
			File file = createNewFile("data.txt");
			System.out.println("file --> " + file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static File createNewFile(String pathName) throws IOException {
		File file = new File(pathName);
		if (!file.exists()) {
			file.createNewFile();
		}
		return file;
	}
}