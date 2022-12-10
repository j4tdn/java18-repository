package exercise01;

import java.util.Scanner;

public class ManagerStudent {
	public static void main(String[] args) {
		
		Student s1 = new Student(102200174, "Cong Huy",9f, 7f);
		Student s2 = new Student(102200156, "Dac Duc", 9f, 8f);
		
		Student s3 = new Student();
		Scanner std = new Scanner(System.in);
		System.out.println("Enter information for Student 3");
		System.out.print("Name SV : ");
		String name = std.nextLine();
		s3.setName(name);
		System.out.print("MSV : ");
		int msv = std.nextInt();
		s3.setMsv(msv);
		System.out.print("Point LT: ");
		float theoryMark = std.nextFloat();
		s3.setPointLT(theoryMark);
		System.out.print("Point TH: ");
		float practiceMark = std.nextFloat();
		s3.setPointTH(practiceMark);
		
		Student[] students = {s1, s2, s3};
		
		findSVmore85(students);
		findSVLTmoreTH(students);
	}
	
	private static void findSVmore85(Student[] students){
		System.out.print("Students that Medium Point is more than 8.5: ");
		for(Student s : students) {
			float mediumpoint = s.mediumPoint(s.getPointLT(), s.getPointLT());
			if(mediumpoint > 8.5) {
				System.out.print(s.getName() + " ");
			}
		}
	}
	
	private static void findSVLTmoreTH(Student[] students){
		System.out.println("Students that Point LT is more than Point TH: ");
		for(Student s : students) {
			if(s.getPointLT() > s.getPointTH()) {
				System.out.print(s.getName() + " ");
			}
		}
	}
//	private static void Input(Student std) {
//		Scanner ip = new Scanner(System.in);
//		System.out.print("MSV : ");
//		int msv = ip.nextInt();
//		System.out.print("Name : ");
//		String name = ip.nextLine();
//		System.out.print("Theory Mark : ");
//		float pointLT = ip.nextFloat();
//		System.out.print("Pratice Mark : ");
//		float pointTH = ip.nextFloat();
//		std = new Student(msv, name, pointLT, pointTH);
//		
//	}
}
