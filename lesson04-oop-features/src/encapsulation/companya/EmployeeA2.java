package encapsulation.companya;

public class EmployeeA2 {
	public static void main(String[] args) {
		System.out.println("A1 --> " + EmployeeA1.name);
		System.out.println("A1 --> " + EmployeeA1.skills);
		
		// no access modifier
		System.out.println("A1 --> " + EmployeeA1.assignedProjects);
		// private
		// System.out.println("A1 --> " + EmployeeA1.salary);
	}
}
