package excercises;

import java.util.Scanner;

import bean.Student;

public class Ex01StudentOOP {
	public static void main(String[] args) {
		Student sv1 = new Student(105190391,"Ngô Đức Huy",10f,9.5f);
		Student sv2 = new Student(105190423,"Conor McGregor",7.6f,8.5f);
		
		Student sv3 = new Student();
		input(sv3);;

		Student[] students = {sv1,sv2,sv3};
		averageMoreThanEight(students);
		
		System.out.println("=====================================================================================================================================");
		
		LTmorethanTH(students);
		
	}
	private static void input(Student sv) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Code: ");
		sv.setStudentCode(Integer.parseInt(sc.nextLine()));
		System.out.print("Enter FullName: ");
		sv.setFullName(sc.nextLine());
		System.out.print("Enter Theoretical Point : ");
		sv.setTheoreticalPoint(sc.nextFloat());
		System.out.print("Enter Practice Point : ");
		sv.setPracticePoints(sc.nextFloat());
	}
	private static void averageMoreThanEight(Student[] students) {
		System.out.printf("%-20s%-20s%s\n","Student Code", "Full Name", "Average");
		System.out.println("=====================================================");
		for(Student student:students) {
			if(student.average()>8.5) {
				System.out.printf("%-20s%-20s%s\n",student.getStudentCode(), student.getFullName(), student.average());
			}
		}
	}
	private static void LTmorethanTH(Student[] students) {
		System.out.printf("%-20s%-20s%-20s%s\n","Student Code", "Full Name", "Theoretical Point", "Practice Point");
		System.out.println("=============================================================================");
		for(Student student:students) {
			if(student.getPracticePoints()>student.getTheoreticalPoint()) {
				System.out.printf("%-20s%-20s%-20s%s\n",student.getStudentCode(), student.getFullName(), student.getTheoreticalPoint(),student.getPracticePoints());
			}
		}
	}
	
}
