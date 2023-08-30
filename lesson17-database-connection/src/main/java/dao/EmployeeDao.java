package dao;

import bean.Employee;

public interface EmployeeDao {
	
	Employee login(String email, String passWord);
	
	boolean register(String email, String passWord);
}
