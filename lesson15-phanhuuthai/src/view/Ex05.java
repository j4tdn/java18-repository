package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Student;

public class Ex05 {
	private static final String pathname = "student.txt";
	public static void main(String[] args) {
		
		// Read data from txt file --> return List<String>
		
		Path path = Paths.get(pathname);
		
		try {
			List<Student> students = new ArrayList<>();
			List<String> lines = Files.readAllLines(path);
			for(String line : lines) {
				String[] s = line.split(", ");
				students.add(new Student(Integer.parseInt(s[0]), s[1], Double.parseDouble(s[2]), s[3]));
			}
			
			//students.forEach(System.out::println);
			
			System.out.println("Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu ĐTB bằng nhau sắp xếp giảm "
					+ "dần theo họ tên.\n");
		
			List<Student> studentSort = students.stream()
					.sorted(Comparator.comparing(Student::getMediumMark).thenComparing(Student::getName, Comparator.reverseOrder()))
					.collect(Collectors.toList());
			
			
			studentSort.forEach(System.out::println);
			System.out.println("\n ==================== \n");
			System.out.println("Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8\n");
			
			List<Student> markBiggerThanAge = students.stream()
					.filter(s -> s.getMediumMark() > 8)
					.collect(Collectors.toList());
			
			markBiggerThanAge.forEach(System.out::println);
			System.out.println("\n ==================== \n");
			
			System.out.println("Viết hàm tìm kiếm toàn bộ các sinh viên NỮ\n");
			
			List<Student> studentNu = students.stream()
					.filter(s -> "Nu".equals(s.getGender()))
					.collect(Collectors.toList());
			
			studentNu.forEach(System.out::println);
			System.out.println("\n ==================== \n");
			
			System.out.println("Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được"
					+ "phân biệt với nhau thông qua MSSV\n");
			List<Student> studentDistinc = students.stream()
			.distinct().collect(Collectors.toList());
			
			studentDistinc.forEach(System.out::println);
			System.out.println("\n ==================== \n");	
			
			
			//lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
