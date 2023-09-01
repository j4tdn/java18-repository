package view;

import services.ClassService;
import services.ClassServiceImpl;
import services.StudentService;
import services.StudentServiceImpl;

public class ViewApp {
	private static StudentService studentService;
	private static ClassService classService;
	
	static {
		studentService = new StudentServiceImpl();
		classService = new ClassServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("List all student by class id:");
		studentService.getStudentsByClassId(2);
		System.out.println("List the class name and number of students, name of students who have Math point >= 8 and Literature >= 8:");
		classService.getClassInfoWithScoresOver8();
	}

}