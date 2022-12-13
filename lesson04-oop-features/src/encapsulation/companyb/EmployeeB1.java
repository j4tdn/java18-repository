package encapsulation.companyb;

import encapsulation.companya.EmployeeA1;

public class EmployeeB1 {
	public static void main(String[] args) {
		// public
		System.out.println("A1 --> " + EmployeeA1.name);
		System.out.println("A1 --> " + EmployeeA1.skills);
		
		// no access modifier
		// System.out.println("A1 --> " + EmployeeA1.assignedProjects);
		
		// vì là private nên lỗi
		// System.out.println("A1 --> " + EmployeeA1.salary);

	}
}
