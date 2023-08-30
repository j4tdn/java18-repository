package service;

import java.util.Objects;

import bean.Employee;
import dao.EmployeeDao;
import dao.JdbcEmployeeDao;

public class EmployeeServiceImpl  implements EmployeeService{
	EmployeeDao e = new JdbcEmployeeDao();

	@Override
	public boolean register(String email, String password) {
		// TODO Auto-generated method stub
		Objects.requireNonNull(email,"email cannot be null ");
		Objects.requireNonNull(password,"password cannot be null ");
		
		return e.register(email, password);
	}

	@Override
	public Employee login(String email, String password) {
		// TODO Auto-generated method stub
		Objects.requireNonNull(email,"email cannot be null ");
		Objects.requireNonNull(password,"password cannot be null ");
		
		return e.login(email, password);
	}
	
}
