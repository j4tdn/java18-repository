package view;

import bean.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class Employee_View {
	private static EmployeeService employeeService;

	static {
		employeeService = new EmployeeServiceImpl();
	}
	public static void main(String[] args) {
		employeeService.register("sdlasdlasjd", "shdashdlj");
//		
		
		
		Employee employee = employeeService.login("sdlasdlasjd", "shdashdlj");
		System.out.println(employee.toString());
		System.out.println("Fisnished ....");
	}	
}
