package exercise04;

import exercise04.bean.Chief;
import exercise04.bean.Director;
import exercise04.bean.Employee;
import exercise04.bean.Staff;

public class HumanResourcesManagerDemo {
	public static void main(String[] args) {
		
		Staff director = new Director("Ronaldo","19/12/1987", 8.5f, 3.5f);
		Staff cheif = new Chief("Rooney","11/2/1978", 8.5f, 350);
		Staff employee1 = new Employee("Beckham","1/5/1985", 8.5f, "Financial");
		Staff employee2 = new Employee("Nani","15/4/1988", 8.5f, "Audit");
		
		Staff[] staffs = {director, cheif, employee1, employee2};

		
		for(Staff staff:staffs) {
			System.out.println(staff);
			System.out.println("--> Salary: " + staff.calSalary());
			
		}

	}
	
	public static void print(Staff staff) {
		System.out.println(staff);
	}

}
