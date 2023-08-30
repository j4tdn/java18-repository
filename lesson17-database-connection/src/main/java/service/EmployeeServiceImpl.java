package service;

import java.util.Objects;

import bean.Employee;
import dao.EmployeeDao;
import dao.JdbcEmployeeDao;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new JdbcEmployeeDao();
	}

	@Override
	public boolean register(String email, String password) {
		Objects.requireNonNull(email, "email cannot be null");
		Objects.requireNonNull(password, "password cannot be null");
		return employeeDao.register(email, password);
	}
	
	@Override
	public Employee login(String email, String password) {
		Objects.requireNonNull(email, "email cannot be null");
		Objects.requireNonNull(password, "password cannot be null");
		return employeeDao.login(email, password);
	}
	
}