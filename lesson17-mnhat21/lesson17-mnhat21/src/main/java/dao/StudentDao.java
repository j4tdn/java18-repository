package dao;

import java.util.List;
import java.util.Set;

import bean.Student;

public interface StudentDao {
	
	List<Student> getStudentsByClassId(int classId);
}
