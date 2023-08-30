package service;

import bean.Employee;

public interface EmployeeService {
	boolean register(String email,String password);
	Employee login(String email,String password);
}
