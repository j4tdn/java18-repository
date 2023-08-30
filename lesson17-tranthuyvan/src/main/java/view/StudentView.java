package view;

import service.StudentService;
import service.StudentServiceImpl;

public class StudentView {

	private static StudentService studentService;

	static {
		studentService = new StudentServiceImpl();
	}

	public static void main(String[] args) {
		System.out.println("List all student by class id");
		System.out.println(studentService.getStudentsByClassId(2));

	}

}
