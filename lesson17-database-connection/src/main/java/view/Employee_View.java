package view;

import bean.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Employee_View {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		
		/*
		 * Quy trình: đăng ký/đăng nhập 
		 * 
		 * ĐĂNG KÝ:
		   + Nhập tài khoản 
		   + Nhập mật khẩu 
		   + Thực hiện click đăng ký
		   --> lưu tài khoản và mật khẩu được mã hóa vào database
		   
		 * ĐĂNG NHẬP:
		   + Nhập tài khoản 
		   + Nhập mật khẩu 
		   + Thực hiện click đăng ký
		   --> Kiểm tra tài khoản vừa đăng nhập có tồn tại trong database hay không 
		       mã hóa mật khẩu và kiểm tra mật khẩu vừa mã hóa có giống mật khẩu trong database không 
		       --> nếu cỏa 2 thỏa mãn thì đăng ký  
		 */
		
		//employeeService.register("abc@gmail.com", "123456789");
		
		System.out.println("Finished ...");
		
		Employee returnedEmployee = employeeService.login("abc@gmail.com", "123456789");
		
		System.out.println("returnedEmployee --> " + returnedEmployee);
		
		
	}

}
