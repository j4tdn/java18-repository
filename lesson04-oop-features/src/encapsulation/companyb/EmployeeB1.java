package encapsulation.companyb;

import encapsulation.companya.EmployeeA1;

public class EmployeeB1 {
	public static void main(String[] args) {
		System.out.println("A1 --> " + EmployeeA1.name);
		System.out.println("A1 --> " + EmployeeA1.skills);
		
		
		// no access modifier  : để không khai báo
	    // System.out.println("A1 --> " + EmployeeA1.asignedProjects);
		
		//private
		//System.out.println("A1 --> " + EmployeeA1.salary);
	}
}
