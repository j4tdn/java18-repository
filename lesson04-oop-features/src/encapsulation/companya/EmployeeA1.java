package encapsulation.companya;

/**
 attribute(method)				--> name, skills, assignedProjects, salary
 attribute access modifier		--> public, private, protected(inheritance), no access modifier 

 public 	--> everywhere
 private 	--> current class
 no 		--> current package
 
 class access modifier --> public, ___
 public --> everywhere
 no__	--> current package
 */



public class EmployeeA1 {
	public static String name;
	public static String[] skills;// {"C", "C++", "java"};
	private static double salary;
	static String assingedProjects;
}
