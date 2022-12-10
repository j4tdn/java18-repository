package ex01;

import java.util.Scanner;

/**
 * 3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ
 * bàn phím sau đó dùng setter để gán các thuộc tính tương ứng. 4. Viết hàm tìm
 * thông tin sinh viên có điểm trung bình lớn hơn 8.5 5. Viết hàm tìm thông tin
 * sinh viên có điểm LT lớn hơn điểm TH
 */

public class StudentUtils {
	public StudentUtils() {
	}

	public static Student inputInfor() {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();

		System.out.println("Enter your information: ");

		System.out.print("Your id: ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.print("Your name: ");
		String name = sc.nextLine();

		System.out.print("Your theoretical point: ");
		float theo = sc.nextFloat();

		System.out.print("Your practice point: ");
		float prac = sc.nextFloat();

		st.setId(id);
		st.setFullname(name);
		st.setTheoreticalPoint(theo);
		st.setPracticePoint(prac);
		sc.close();

		return st;

	}

	// function - show all students
	public static void showAllStudents(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	// function to find information about students with a GPA greater than 8.5
	public static void findStudentWithGPA(Student[] students) {
		for (Student student : students) {
			if (student.getAveragePoint() > 8.5f) {
				System.out.println(student);
			}
		}
	}

	// function to find information about students whose theoretical point is
	// greater than practice point
	public static void theoPointIsGreaterThanPracPoint(Student[] students) {
		for (Student student : students) {
			if (student.getTheoreticalPoint() > student.getPracticePoint()) {
				System.out.println(student);
			}
		}
	}

}
