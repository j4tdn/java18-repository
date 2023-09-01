package dao;

import java.util.List;

import bean.Student;

public interface StudentDao {
	List<Student> getStudentsByClassId(int classId);
}

