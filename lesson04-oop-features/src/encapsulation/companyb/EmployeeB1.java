
package encapsulation.companyb;

import encapsulation.companya.EmployeeA1;

public class EmployeeB1 {
	public static void main(String[] args) {
		System.out.println("A1 --> " + EmployeeA1.name);
		System.out.println("A1 --> " + EmployeeA1.skills);
		
		// no access modifier --> not in "company-a" package --> cannot access 
		// System.out.println("A1 --> " + EmployeeA1.assignedProjects);

		// private --> cannot access
		// System.out.println("A1 --> " + EmployeeA1.salary);

	}
}
