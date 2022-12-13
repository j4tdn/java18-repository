package exercise01;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Dac Tai", 9, 10);
		
		Student sv2 = new Student(2, "Xiao", 10, 9);
		
		Student sv3 = new Student();
		input(sv3);
		
		Student[] students = {sv1, sv2, sv3};
		
		
		Student[] studentAvgGt = findStudentAvgGt(students, 8.5f);
		System.out.println("Students have the avarage point greater than 8.5: ");
		for(Student student:studentAvgGt) {
			System.out.println(student);
		}
		
		Student[] studentTheoryGtPractice = findStudentTheoryGtPractice(students);
		System.out.println("Students have the theory point greater than practice point: ");
		for(Student student:studentTheoryGtPractice) {
			System.out.println(student);
		}
		
		
		
	}
	
	public static void input(Student sv) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap Id: ");
		sv.setId(input.nextInt());
		System.out.print("Nhap ten: ");
		sv.setName(input.next());
		System.out.print("Nhap diem LT: ");
		sv.setTheoryPoint(input.nextFloat());
		System.out.print("Nhap Id: ");
		sv.setPracticePoint(input.nextFloat());

	}
	
	public static Student[] findStudentAvgGt(Student[] students, float point) {
		Student[] result = new Student[students.length];
		int index = 0;
		for(Student student:students) {
			float avgPoint = student.calAvgPoint(student.getTheoryPoint(), student.getPracticePoint());
			if(avgPoint > point) {
				result[index] = student;
				index++;
			}
		}
		return result;
	}
	
	public static Student[] findStudentTheoryGtPractice(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for(Student student:students) {
			if(student.getTheoryPoint() > student.getPracticePoint()) {
				result[index] = student;
				index++;
			}
		}
		return result;
	}
	
	public static void output(Student student) {
		System.out.println(student);
	}
}
