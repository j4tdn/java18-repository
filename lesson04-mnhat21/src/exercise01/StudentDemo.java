package exercise01;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Student s1 = new Student(102190280, "Kevin", 9f, 10f);
		Student s2 = new Student(102190281, "Haaland", 10f, 10f);
		Student s3 = new Student();
		System.out.println("Input information for Student 3");
		System.out.print("Name : ");
		String name = ip.nextLine();
		s3.setName(name);
		System.out.print("ID : ");
		int id = ip.nextInt();
		s3.setId(id);
		System.out.print("Theory Mark : ");
		float theoryMark = ip.nextFloat();
		s3.setTheoryMark(theoryMark);
		System.out.print("Pratice Mark : ");
		float practiceMark = ip.nextFloat();
		s3.setPracticeMark(practiceMark);
		Student[] students = {s1, s2, s3};
		
		findAverageMarkMoreThan85(students);
		find(students);
	}
	
	private static void findAverageMarkMoreThan85(Student[] students){
		System.out.println("Students that average mark is more than 8.5");
		for(Student s : students) {
			float averageMark = s.calAverageMark(s.getTheoryMark(), s.getPracticeMark());
			if(averageMark > 8.5) {
				System.out.println(s);
			}
		}
	}
	
	private static void find(Student[] students){
		System.out.println("Students that Theory mark is more than Practice Mark");
		for(Student s : students) {
			if(s.getTheoryMark() > s.getPracticeMark()) {
				System.out.println(s);
			}
		}
	}
}
