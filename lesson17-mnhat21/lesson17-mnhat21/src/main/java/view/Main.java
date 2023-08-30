package view;

import connection.DbConnection;
import service.StudentService;
import service.StudentServiceImpl;

public class Main {
	
	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}

	public static void main(String[] args) {
		// System.out.println("test connection ---> " + DbConnection.getConnection());
		System.out.println(studentService.getStudentsByClassId(1));
	}
}
