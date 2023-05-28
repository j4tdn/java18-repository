package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Student;
import utils.PrintUtils;

public class Ex05 {
	private static final String pathname = String.join(File.separator, "data", "student.txt");

	public static void main(String[] args) {
		Path path = Paths.get(pathname);
		List<Student> students = new ArrayList<Student>();
		try {
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				String data[] = line.split(",");
				String id = data[0];
				String name = data[1];
				Double gpa = Double.parseDouble(data[2]);
				String gender = data[3];
				students.add(new Student(id, name, gpa, gender));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintUtils.print(
				"Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu ĐTB bằng nhau sắp xếp giảm dần theo họ tên \n"
						, students.stream()
								.sorted(Comparator.comparing(Student::getGPA).thenComparing(Student::getName))
								.collect(Collectors.toList()));

		PrintUtils.print("Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8 \n"
				, students.stream().filter(s -> s.getGPA() > 8d).collect(Collectors.toList()));

		PrintUtils.print("Viết hàm tìm kiếm toàn bộ các sinh viên NỮ \n"
				, students.stream().filter(s -> s.getGender().contains("Nu")).collect(Collectors.toList()));

		PrintUtils.print("Tìm kiếm sinh viên chỉ xuất hiện một lần \n"
				, students.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream()
						.filter(e -> e.getValue() == 1).collect(Collectors.toList()));

	}

}
