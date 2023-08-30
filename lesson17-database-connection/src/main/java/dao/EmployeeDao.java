package dao;

import bean.Employee;

public interface EmployeeDao {
	
	boolean register(String username, String password);
	
	Employee login(String email, String password);
}
