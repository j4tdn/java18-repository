package dao;

import java.util.List;

import bean.Student;

public interface StudentDao {
	
	List<Student> getStudentByClassId(int id);
	
	Integer amountOfStudent(int id);
}
