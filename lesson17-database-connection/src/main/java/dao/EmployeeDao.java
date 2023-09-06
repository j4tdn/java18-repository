package dao;

import bean.Employee;

public interface EmployeeDao {
	
	boolean register(String email, String password);
	
	Employee login(String email, String password);

}
