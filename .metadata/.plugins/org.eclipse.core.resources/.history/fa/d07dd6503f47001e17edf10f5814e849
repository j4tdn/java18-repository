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
		 Quy trình: Đăng ký / Đăng nhập
		 
		 + Đăng ký
		   . Nhập tài khoản
		   . Nhập mật khẩu
		   . Thực hiện click đăng ký
		     --> lưu tài khoản và mật khẩu được mã hóa vào database
		     
		 + Đăng nhập
		   . Nhập tài khoản
		   . Nhập mật khẩu
		   . Thực hiện click đăng ký
		     --> kiểm tra tài khoản vừa nhập có tồn tại trong database hay ko
		         mã hóa mật khẩu và kiểm tra xem mật khẩu vừa mã hóa có giống mật khẩu trong database ko
		         --> nếu cả 2 thỏa mãn đăng ký
		 */
		
		// employeeService.register("newcj102jd92", "teo192#i0");
		
		Employee returnedEmployee = employeeService.login("newcj102jd92", "teo192#i0");
		
		System.out.println("returnedEmployee --> " + returnedEmployee);
		
	}
}