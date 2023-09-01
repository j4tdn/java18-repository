package services;

import dao.JdbcStudentDao;
import dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	public StudentServiceImpl() {
		studentDao = new JdbcStudentDao();
	}

	@Override
	public void getStudentsByClassId(int classId) {
		studentDao.getStudentsByClassId(classId).forEach((e)->{
			System.out.println("--> "+e);
		});
	}

}