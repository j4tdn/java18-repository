package exam;

import java.util.ArrayList;

public class Ex01 {
	int id;
	String name;
	String level;

	public Ex01(int id, String name, String level) {
		this.id = id;
		this.name = name;
		this.level = level;
	}

	public static void main(String[] args) {
		Ex01[] students = { new Ex01(102, "Nam", "C"),
				new Ex01(103, "Bảo", "F"),
				new Ex01(104, "Hoàng", "D"),
				new Ex01(105, "Nguyên", "B"),
				new Ex01(107, "Vũ", "F"),
				new Ex01(109, "Lan", "A"),
				new Ex01(202, "Đạt", "C"),
				new Ex01(103, "Bảo", "F"),
				new Ex01(107, "Vũ", "C"),
				new Ex01(104, "Hoàng", "B")
				};

		// Tìm danh sách sinh viên đạt loại A trong năm 2021
		ArrayList<Ex01> aStudents = new ArrayList<>();
		for (Ex01 student : students) {
			if (student.level == "A") {
				aStudents.add(student);
			}
		}
		System.out.println("Danh sách sinh viên đạt loại A trong năm 2021: ");
		for (Ex01 student : aStudents) {
			System.out.println(student.name);
		}

		// Tìm danh sách sinh viên tham gia học lại môn cấu trúc dữ liệu trong năm 2021
		ArrayList<Ex01> retakeStudents = new ArrayList<>();
		for (Ex01 student : students) {
			if (student.level == "F") {
				retakeStudents.add(student);
			}
		}
		System.out.println("Danh sách sinh viên tham gia học lại môn cấu trúc dữ liệu trong năm 2021: ");
		for (Ex01 student : retakeStudents) {
			System.out.println(student.name);
		}
	}
}
