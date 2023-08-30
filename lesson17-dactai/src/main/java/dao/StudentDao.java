package dao;

import java.util.List;
import java.util.Map;

import bean.Student;

public interface StudentDao {

	List<Student> getAllStudentByClassId(int id);

	Map<Integer, Integer> getAmountOfStudentPerClass();

}
