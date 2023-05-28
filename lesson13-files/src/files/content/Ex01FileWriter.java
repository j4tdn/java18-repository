package files.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWriter {
	private static final String path = String.join(File.separator, 
			"data", "storage", "content.txt");
	
	public static void main(String[] args) {
		// write data into txt file --> Files.write
		// --> input List<String>
		
		File file = new File(path);
		if(file.exists()) {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileUtils.open(file);
		System.out.println("==== FINISH ====");
	}
}
