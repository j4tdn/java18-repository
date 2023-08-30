package service;

import java.util.List;

import bean.Student;

public interface StudentService {
	
	List<Student> getStudentsByClassId(int classId);
}
