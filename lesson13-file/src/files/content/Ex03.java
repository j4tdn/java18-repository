package files.content;

import java.io.File;
import java.util.List;


import bean.Employee;

public class Ex03 {
	
	private static final String pathname = String.join(File.separator, "data","storage","encrypt.txt");
	
	
	public static void main(String[] args) {
		
	}
	
	private static List<Employee> mockData(){
		List<Employee> employees = List.of(
				new Employee(1, "E1", 100),
				new Employee(2, "E2", 200),
				new Employee(3, "E3", 300),
				new Employee(4, "E4", 400)
				);
		return employees;
	}
}
