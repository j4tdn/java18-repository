import service.StudentService;
import service.StudentServiceImpl;
import utils.SqlUtils;

public class view {
	private static StudentService student;

	static {
		student = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		SqlUtils.generate(
				"1. List all student by class id",
				student.getAll(1)
		);
		System.out.println("Câu 3 :");
		student.AmoutOfStudent(2);
		
		System.out.println("Câu 4 :");
		student.getStudentByScore(8.2);
	}
}