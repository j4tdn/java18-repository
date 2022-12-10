package exercises01_student;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Tuong Vy", 9.9f, 9.9f);
		Student sv2 = new Student(2, "Thu Hien", 7.8f, 5.9f);
		Student sv3 = new Student();
		input(sv3);
		
		Student[] students = {sv1, sv2, sv3};
		pointMoreThan85(students);
		theoretialPointMoreThanPracticePoint(students);
	}
	
	public static void input(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student : ");
		System.out.print("Id: ");
		student.setId(sc.nextInt());
		System.out.print("Name: ");
		student.setName(sc.next());
		System.out.print("Theoretical Point: ");
		student.setTheoreticalPoint(sc.nextFloat());
		System.out.print("Practice Point: ");
		student.setPracticePoint(sc.nextFloat());
		
	}
	
	public static void pointMoreThan85(Student[] students) {
		System.out.println("----------------------------------");
		System.out.println("Point more than 8.5: ");
		for (Student sv: students) {
			if (sv.Point() > 8.5) {
				System.out.println(sv.getName());
			}
		}
	}
	
	public static void theoretialPointMoreThanPracticePoint(Student[] students) {
		System.out.println("------------------------------------------");
		System.out.println("Theoretial Point More Than Practice Point: ");
		for (Student sv : students) {
			if (sv.getTheoreticalPoint() > sv.getPracticePoint()) {
				System.out.println(sv.getName());
			}
		}
	}

}
