package Ex05.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import Ex05.bean.Student;

public class FileUtils {
	private FileUtils() {
		
	}
	
	public static List<Student> readFile(Path path, Function<String, Student> func) {
	    List<String> lines = readFile(path); 

	    return lines.stream()
	            .map(line -> func.apply(line))
	            .collect(Collectors.toList());
	}

	public static List<String> readFile(Path path) {
	    List<String> lines = new ArrayList<>();
	    try {
	        lines = Files.readAllLines(path);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return lines;
	}

}
