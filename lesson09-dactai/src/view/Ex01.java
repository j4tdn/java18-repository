package view;

import java.util.Arrays;

import bean.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", "c"), new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"), new Student(105, "Nguyên", "B"), new Student(107, "Vũ", "F"),
				new Student(109, "Lan", "A"), new Student(202, "Đạt", "C"), new Student(103, "Bảo", "F"),
				new Student(107, "Vũ", "C"), new Student(104, "Hoàng", "B") };

		Student[] studentsWithRankA = getStudents(students, "A");
		Student[] studentsWithRankF = getStudents(students, "F");
		System.out.println("Student with rank A:");
		for (Student student : studentsWithRankA) {
			System.out.println(student);
		}
		System.out.println("Student with rank F:");
		for (Student student : studentsWithRankF) {
			System.out.println(student);
		}

	}

	private static Student[] getStudents(Student[] students, String rank) {
		Student[] result = new Student[students.length];
		int counter = 0;
		for (Student student : students) {
			if (student.getRank().equals(rank)) {
				result[counter++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}

}
