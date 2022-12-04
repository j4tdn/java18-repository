package encapsulasion.companya;

public class EmployeeA2 {
	public static void main(String[] args) {
		System.out.println("A1 --> " + EmployeeA1.name);
		System.out.println("A1 --> " + EmployeeA1.skills);
		//private
		//System.out.println("A1 --> " + EmployeeA1.salary);
		
		
		//no access modifier
		System.out.println("A1 --> " + EmployeeA1.assignedProjects);
	}
}
