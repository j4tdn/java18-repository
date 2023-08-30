package view;


import service.StudentService;
import service.StudentServiceImpl;
import utils.SqlUtils;

public class Student_View {
	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		SqlUtils.generate("Câu 1F: Liệt kê học sinh theo mã lớp",
				studentService.getStudents(1));
	}

}
