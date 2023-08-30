package service;

import java.util.List;
import java.util.Map;

import bean.Student;
import dao.JdbcStudentDao;
import dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	public StudentServiceImpl() {
		studentDao = new JdbcStudentDao();
	}

	@Override
	public List<Student> getStudentsByClassId(int id) {

		return studentDao.getAllStudentByClassId(id);
	}

	@Override
	public Map<Integer, Integer> getAmountOfStudentPerClass() {
		return studentDao.getAmountOfStudentPerClass();
	}

}
