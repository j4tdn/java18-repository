package encapsulation.companyb;

import encapsulation.companya.EmployeeA1;

public class EmployeeB1 {
	public static void main(String[] args) {
		System.out.println(EmployeeA1.name);
		System.out.println(EmployeeA1.skills);
		
		// default
		// System.out.println(EmployeeA1.assignedProject);
		
		// private
		//System.out.println(EmployeeA1.salary);
	}
}
