package file.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex02FileReader {
	private static final String pathname = String.join(File.separator, "data", "storage", "content.txt");
	
	public static void main(String[] args) {
		Path path = Paths.get(pathname);
		
		List<String> lines;
		try {
			lines = Files.readAllLines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
