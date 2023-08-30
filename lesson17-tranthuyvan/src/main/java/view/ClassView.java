package view;

import service.ClassService;
import service.ClassServiceImpl;

public class ClassView {
	private static ClassService classService;
	
	static {
		classService = new ClassServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("List the class name and number of students, name of students who have Math point >= 8\r\n"
				+ "and Literature >= 8");
		System.out.println(classService.getClassInfoWithGoodScores());

	}

}
