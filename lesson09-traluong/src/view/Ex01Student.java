package view;

import bean.Student;

public class Ex01Student {
	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", 'C'),
				new Student(103, "Bảo", 'F'),
				new Student(104, "Hoàng", 'D'),
				new Student(105, "Nguyên", 'B'),
				new Student(106, "Vũ", 'F'),
				new Student(107, "Lan", 'A'),
				new Student(108, "Đạt", 'C'),
				new Student(109, "Bảo", 'F'),
				
		};
		Student[] studentsByA = getStudent(students, 'A');
		Student[] studentsByF = getStudent(students, 'F');
		
		System.out.println("Students with A score --> ");
		for (Student element: studentsByA) {
			if (element != null) {
				System.out.println(element.toString());
			}
			
		}
		
		System.out.println("Students with F score --> ");
		for (Student element: studentsByF) {
			if (element != null) {
				System.out.println(element.toString());
			}
		}
		
		
		
	}
	private static Student[] getStudent(Student[] students, char status) {
		Student[] std = new Student[students.length];
		int count = 0;
		for (Student element:students) {
			if (element.getStatus() == status) {
				std[count++] = element;
			}
		}
		return std;

}
}
