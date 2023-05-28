package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Fileutils {
	private Fileutils() {

	}
	public static List<String> readfile(String path){
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Path.of(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
}
