package service;

import java.util.List;

import bean.student;

public interface StudentService {
	List<student> getAll(int id);
	Integer AmoutOfStudent(int id);
}
