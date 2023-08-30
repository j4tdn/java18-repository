package service;

import java.util.List;
import java.util.Map;

import bean.Student;

public interface StudentService {

	List<Student> getStudentsByClassId(int id);

	Map<Integer, Integer> getAmountOfStudentPerClass();

}
