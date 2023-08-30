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
				"EX01: ---> ",
				student.getStudentByClassId(1)
		);
	}
}
