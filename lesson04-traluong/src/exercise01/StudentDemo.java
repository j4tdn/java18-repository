package exercise01;

import java.util.Scanner;

public class StudentDemo {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Lương Thanh Trà", 7, 9);
		Student sv2 = new Student(2, "Komi Shouko", 10, 10);
		Student sv3 = new Student();
		setStudentInfor(sv3);
		Student[] Students = {sv1, sv2, sv3};
		System.out.println("================");
		System.out.println("Students has overall score more than 8.5 --> ");
		for (Student std: Students) {
			if (hasOverallMoreThanEpF(std)) {
				System.out.println(std.toString());
			}
		}
		
		System.out.println("================");
		System.out.println("Students has theory score more than practice score --> ");
		
		for (Student std: Students) {
			if (hasThScMoreThanPtSc(std)) {
				System.out.println(std.toString());
			}
		}
		
		
	}
	public static boolean hasThScMoreThanPtSc(Student sv) {
		return (sv.getTheoryScore() > sv.getPracticeScore() ? true : false);
	}
	public static boolean hasOverallMoreThanEpF(Student sv) {
		float overallScore = sv.getOverallScore();
		if (overallScore > 8.5f) {
			return true;
		} 
		return false;
		
	}
	public static void setStudentInfor(Student sv) {
		
		System.out.print("Enter student id: ");
		sv.setStudentID(sc.nextInt());
		
		System.out.print("Enter student name: ");
		sc.nextLine();
		sv.setStudentName(sc.nextLine());
		
		System.out.print("Enter student theory score: ");
		sv.setTheoryScore(sc.nextFloat());
		
		System.out.print("Enter student practice score: ");
		sv.setPracticeScore(sc.nextFloat());
	}
}
