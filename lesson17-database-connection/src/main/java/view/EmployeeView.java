package view;

import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeView {
	
	private static EmployeeService employee;

	static {
		employee = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		//employee.register(null, null);
		
		
	}
}
