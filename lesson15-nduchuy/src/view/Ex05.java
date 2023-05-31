package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import common.Gender;
import model.Student;

public class Ex05 {
	private static final String pathName = String.join(File.separator, "data", "student.txt");

	public static void main(String[] args) {
		
	}

	public static List<Student> readStudentsFromFile(String filename) {
		List<Student> students = new ArrayList<>();
		Path path = Paths.get(pathName);

		if (!Files.exists(path)) {
			System.out.println("File not found: " + pathName);
		}

		List<String> lines;
		try {
			lines = Files.readAllLines(path);
			for (String line : lines) {
				String[] elements = line.split(", ");
				if (elements.length == 4) {
					String mssv = elements[0].trim();
					String fullname = elements[1].trim();
					double gpa = Double.parseDouble(elements[2].trim());
					Gender gender = Gender.valueOf(elements[3].trim().toUpperCase());
					students.add(new Student(mssv, fullname, gpa, gender));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;
	}
}
