package view;

import java.util.List;
import java.util.Map;

import bean.Student;
import service.StudentServiceImpl;

public class Demo {

	private static StudentServiceImpl studentService;

	static {
		studentService = new StudentServiceImpl();
	}

	public static void main(String[] args) {

//		Câu 1:

		List<Student> studentsHaveClassId = studentService.getStudentsByClassId(3);

		System.out.println("List of students have class_id = 3 >>> ");
		for (Student s : studentsHaveClassId) {
			System.out.println(s);
		}

//		Câu 3:

		Map<Integer, Integer> listAmountOfStudent = studentService.getAmountOfStudentPerClass();

		System.out.println("Amount of students:");

		for (Map.Entry<Integer, Integer> entry : listAmountOfStudent.entrySet()) {
			System.out.println("Class_id: " + entry.getKey() + " - " + "Amount: " + entry.getValue());
		}
	}

}
