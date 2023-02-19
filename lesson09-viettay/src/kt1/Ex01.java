package kt1;

import java.util.Arrays;

import bean.Student;
import functional.StudentPredicate;

/**
 Bài 1: Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc dữ liệu. Thông
		tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên, Họ tên, Xếp loại
		Xếp loại học lực được lưu trong Enum với các giá trị: A, B, C, D, E, F
		Với sinh viên có học lực loại F bắt buộc phải đăng ký học lại.
		Student[] students
		{
		new Student(102, "Nam", C),
		new Student(103, "Bảo", F),
		new Student(104, "Hoàng", D),
		new Student(105, "Nguyên", B),
		new Student(107, "Vũ", F),
		new Student(109, "Lan", A),
		new Student(202, "Đạt", C),
		new Student(103, "Bảo", F),
		new Student(107, "Vũ", C),
		new Student(104, "Hoàng", B)
		}
		 Tìm danh sách sinh viên từng đạt loại A trong năm 2021.
		 Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
 */
public class Ex01 {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", 'C'), new Student(103, "Bảo", 'F'),
				new Student(104, "Hoàng", 'D'), new Student(105, "Nguyên", 'B'), new Student(107, "Vũ", 'F'),
				new Student(109, "Lan", 'A'), new Student(202, "Đạt", 'C'), new Student(103, "Bảo", 'F'),
				new Student(107, "Vũ", 'C'), new Student(104, "Hoàng", 'B') };
		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021: \n"
				+ Arrays.toString(find(students, student -> student.getRank() == 'A')));
		System.out.println("====================================");
		System.out.println("Danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021: \n"
				+ Arrays.toString(find(students, student -> student.getRank() == 'F')));
	}

	private static Student[] find(Student[] students, StudentPredicate sp) {
		Student[] rs = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (sp.test(student)) {
				rs[count++] = student;
			}
		}
		return Arrays.copyOfRange(rs, 0, count);
	}
}

