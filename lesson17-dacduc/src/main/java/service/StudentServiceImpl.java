package service;

import java.util.List;

import bean.student;
import dao.JbdcStudentDao;
import dao.StudentDao;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;

	public  StudentServiceImpl() {
		// TODO Auto-generated constructor() {
		studentDao = new JbdcStudentDao();
	}

	public List<student> getAll(int id) {
		// TODO Auto-generated method stub
		return studentDao.getAll(id);
	}

	public Integer AmoutOfStudent(int id) {
		// TODO Auto-generated method stub
		return studentDao.AmoutOfStudent(id);
	}
	
}
