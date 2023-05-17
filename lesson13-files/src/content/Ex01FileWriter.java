package content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Ex01FileWriter {
	private static final String path = String.join(File.separator, "data", "storage", "content.txt");

	public static void main(String[] args) {
		File file = new File(path);

		if (file.exists()) {
			List<String> lines = List.of("1, Item1, 100", "2, Item2, 200", "3, Item3, 300","4, Item4, 400");
			
			//GHI FILE
			try {
				Files.write(file.toPath(), lines);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
