package service;

import java.util.List;

import bean.Student;
import dao.JdbcStudentDao;
import dao.StudentDao;

public class StudentServiceImpl implements StudentService{
	

	private StudentDao studentDao;

	public StudentServiceImpl() {
		studentDao = new JdbcStudentDao();
	}

	@Override
	public List<Student> getStudents(int classId) {
		return studentDao.getStudents(classId);
	}

}
