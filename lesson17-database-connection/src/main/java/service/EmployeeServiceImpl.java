package service;

import dao.EmployeeDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcEmployeeDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		employeeDao = new JdbcEmployeeDao();
	}
	
	@Override
	public boolean register(String username, String password) {
		return employeeDao.register(username, password);
	}
}
