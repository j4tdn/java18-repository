package file.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Ex01FileWriter {
	private static final String path = String.join(File.separator, "data", "storage", "content.txt");
	
	public static void main(String[] args) {
		// write data into txt file --> files.write
		// --> input List<String>
		File file =   new File(path);
		if (file.exists()) {
			List<String> lines = List.of(
					"1, Item 1, 100",
					"2, Item 2, 200",
					"3, Item 3, 300",
					"4, Item 4, 400",
					"5, Item 5, 500"
					);
			try {
				Files.write(file.toPath(), lines);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n*** ___ Stop Main ___ ***");	
	}

}
