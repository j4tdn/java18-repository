package content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex02FileReader {
	private static final String pathName = String.join(File.separator, "data", "storage", "content.txt");
	public static void main(String[] args) {
		Path path = Paths.get(pathName);
		
		try {
			List<String> lines = Files.readAllLines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
