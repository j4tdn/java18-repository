package dao;

import java.util.List;

import bean.GoodStudent;

public interface GoodStudentWork {
	List<GoodStudent> getAll();
	
	List<GoodStudent> getAllOut82();
	
	GoodStudent GetTheBestStudent();
}
