package dao;

import java.util.List;

import bean.student;

public interface StudentDao {
	List<student> getAll(int id);
	Integer AmoutOfStudent(int id);
}
