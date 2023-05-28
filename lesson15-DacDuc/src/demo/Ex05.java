package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex05 {
	static String url = "E:\\Offline Course\\WebDevelop\\Java18\\JAVA\\lesson15-DacDuc\\src\\demo\\student.txt";

	public static void main(String[] args) {
		Path path = Paths.get(url);
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<student> students = new ArrayList<>();
		for (String item : lines) {
			String[] out = item.split(",");
			student s = new student(out[0], out[1], Double.parseDouble(out[2]), out[3]);
			students.add(s);
		}
		System.out.println("--------------------------------------");
		System.out.println("Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu ĐTB bằng nhau sắp xếp giảm\r\n"
				+ "dần theo họ tên.");
		List<student> sort = students.stream().sorted(
				Comparator.comparing(student::getPoint).thenComparing(student::getName, Comparator.reverseOrder()))
				.collect(Collectors.toList());
		sort.forEach(System.out::println);

		System.out.println("Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8:");
		students.stream().filter(e -> e.point > 8).toList().forEach(System.out::println);

		System.out.println("Viết hàm tìm kiếm toàn bộ các sinh viên NỮ:");
		students.stream().filter(e -> e.gender.contains("Nu")).toList().forEach(System.out::println);
		;
		System.out.println("Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được\r\n"
				+ "phân biệt với nhau thông qua MSSV:");
		Map<String, Integer> studentCountMap = new HashMap<>();

		for (student student : students) {
			String mssv = student.getMsv();
			studentCountMap.put(mssv, studentCountMap.getOrDefault(mssv, 0) + 1);
		}


		studentCountMap.forEach((e,v)->{
			if(v==1) {			
			}
		});
		List<String> msv = new ArrayList<>();
		Set<String> set = studentCountMap.keySet();
        for (String key : set) {
            if(studentCountMap.get(key)==1) {
            	msv.add(key);
            }
        }
		students.stream().filter(element->msv.contains(element.getMsv())).toList().forEach(System.out::println);
	}

}
