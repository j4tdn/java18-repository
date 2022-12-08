package exercises;

import java.util.Scanner;

import bean.Student;

public class Ex01 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		Student sv1 = new Student(105190423, "Nguyễn Thị Thanh Vi", 7.8f, 9.5f);
		System.out.println(sv1);

		Student sv2 = new Student(105190391, "Ngô Đức Huy", 9f, 10f);
		System.out.println(sv2);

		Student sv3 = new Student();
		input(sv3);

		Student[] students = { sv1, sv2, sv3 };
		System.out.println("Sv có điểm TB > 8.5");
		information(students);
		
		System.out.println("Sv có điểm LT > TH");
		hightPoint(students);
	}

	private static void input(Student sv3) {

		Scanner ip = new Scanner(System.in);

		System.out.print("Enter student code: ");
		sv3.setStudentCode(Integer.parseInt(ip.nextLine()));

		System.out.print("Enter name: ");
		sv3.setName(ip.nextLine());

		System.out.print("Enter theoretical point: ");
		sv3.setTheoreticalpoint(ip.nextFloat());

		System.out.print("Enter practice points: ");
		sv3.setPracticepoints(ip.nextFloat());

	}

	private static void information(Student[] students) {
		for (Student student: students) {
			if (student.average() > 8.5) {
				System.out.println(student.getStudentCode()+ ", " + student.getName() +
						", " + student.getTheoreticalpoint() + ", " + student.getPracticepoints() +
						", " + student.average());
			}
		}
	}
	
	private static void hightPoint(Student[] students) {
		for (Student student: students) {
			if (student.getTheoreticalpoint() > student.getPracticepoints()) {
				System.out.println(student.getStudentCode() + ", " + student.getName() + 
						", " + student.getTheoreticalpoint() + ", " + student.getPracticepoints());
			}
		}
			
	}

}
