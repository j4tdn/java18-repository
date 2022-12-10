package ex01studentmanagement;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Cristiano Ronaldo", 8.5f, 9f);
		Student sv2 = new Student(2, "Leonel Messi", 7.5f, 9f);
		Student sv3 = new Student();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap id sv3: ");
		int id = Integer.parseInt(scanner.nextLine());
		sv3.setId(id);
		
		System.out.print("nhap ten sv3: ");
		String name = scanner.nextLine();
		sv3.setName(name);;
		
		System.out.print("nhap diem lt sv3: ");
		float lt = Float.parseFloat(scanner.nextLine());
		sv3.setLtMark(lt); 
		
		System.out.print("nhap diem th sv3: ");
		float th = Float.parseFloat(scanner.nextLine());
		sv3.setThMark(th);

		Student[] students = {sv1, sv2, sv3};
		System.out.println("sinh viên có điểm trung bình lớn hơn 8.5");
		for(Student st : findGoodStudent(students)) {
			System.out.println(st);
		}
		System.out.println("==============================");
		
		System.out.println("sinh viên có điểm LT lớn hơn TH");
		for(Student st2 : ltHigherTh(students)) {
			System.out.println(st2);
		}
	}
	
	public static Student[] findGoodStudent(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student : students) {
			if(student.mediumMark()>8.5f) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	public static Student[] ltHigherTh(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student : students) {
			if(student.getLtMark() > student.getThMark()) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
}
