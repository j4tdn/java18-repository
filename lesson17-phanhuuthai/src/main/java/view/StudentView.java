package view;

import service.StudentService;
import service.StudentServiceImpl;
import utils.SqlUtils;

public class StudentView {
	private static StudentService student;

	static {
		student = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		SqlUtils.generate(
				"1. List all student by class id",
				student.getStudentByClassId(1)
		);
		SqlUtils.generate(
				"3. Count/Statistic amount of students per class",
				student.amountOfStudent(2)
		);
	}
}
