package ex01;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Student s1 = new Student(259, "Dao", 8f, 9f);
		System.out.println(s1);
		Student s2 = new Student(189, "Nong", 6f, 7f);
		System.out.println(s2);
		
		Student s3 = new Student();
		System.out.println("Nhap thong tin s3");
		
		System.out.print("Enter StudentID: ");
		s3.setId(Integer.parseInt(ip.nextLine()));
		
		System.out.print("Enter Name Student: ");
		s3.setName(ip.nextLine());
		
		System.out.print("Enter LT: ");
		s3.setTheoryMark(ip.nextFloat());
		
		System.out.print("Enter TH: ");
		s3.setPracticeMark(ip.nextFloat());

	}
}
