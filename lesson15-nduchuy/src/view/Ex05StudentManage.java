package view;

import static java.util.stream.Collectors.groupingBy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Student;
import common.Sex;

public class Ex05StudentManage {
	public static void main(String[] args) {
		List<Student> students = readFile("student.txt");
		filterStudentAppearOnce(students);
	}

	public static List<Student> readFile(String pathname) {
		List<Student> students = new ArrayList<>();
		Path path = Paths.get(pathname);
		try {
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				String[] elements = line.split(", ");
				if (elements.length == 4) {
					String id = elements[0].trim();
					String name = elements[1].trim();
					Double score = Double.parseDouble(elements[2].trim());
					Sex sex = Sex.valueOf(elements[3].trim());
					students.add(new Student(id, name, score, sex));
				}
				;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;
	}

	public static List<Student> sortByScore(List<Student> students) {
		return students.stream().sorted(
				Comparator.comparing(Student::getScore).thenComparing(Student::getName, Comparator.reverseOrder()))
				.collect(Collectors.toList());
	}

	public static List<Student> filterByScore(List<Student> students) {
		return students.stream().filter(student -> student.getScore() > 8d).collect(Collectors.toList());
	}

	public static List<Student> filterBySex(List<Student> students) {
		return students.stream().filter(student -> student.getSex() == Sex.Nu).collect(Collectors.toList());
	}

	public static void filterStudentAppearOnce(List<Student> students) {
		List<String> idsOnce = students.stream().collect(groupingBy(Student::getId, Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() == 1L).map(Entry::getKey).collect(Collectors.toList());
		List<Student> studentsOnce = new ArrayList<>();
		idsOnce.forEach(id -> {
			students.stream().filter(student -> student.getId() == id).map(student->studentsOnce.add(student)).collect(Collectors.toList());
		});
		studentsOnce.forEach(System.out::println);
	}

}
