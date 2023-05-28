package files.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWriter {
	private static final String path = String.join(File.separator, 
			"data","storage", "text.txt");
	public static void main(String[] args) {
		File file = new File(path);
		if (file.exists()) {
			List<String> lines = List.of(
					"1, iteam 1, 100",
					"2, iteam 2, 100",
					"3, iteam 3, 100",
					"4, iteam 4, 100",
					"5, iteam 5, 100"
					);
			try {
				Files.write(file.toPath(), lines);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
		}
		
		FileUtils.open(file);
	}
}
