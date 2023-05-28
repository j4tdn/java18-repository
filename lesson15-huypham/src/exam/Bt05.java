package exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Student;

public class Bt05 {
	public static void main(String[] args) {
		List<Student> students = readFile("student.txt", Student::new);;
		
	}
	
	private static <R> List<R> readFile(String path, Function<String, R> function) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<R> result = new ArrayList<>();
		if (lines != null && !lines.isEmpty()) {
			for (String line : lines) {
				R converted = function.apply(line);
				result.add(converted);
			}
		}
		return result;
	}
}
