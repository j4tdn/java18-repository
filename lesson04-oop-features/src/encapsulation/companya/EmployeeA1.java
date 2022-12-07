package encapsulation.companya;

/**	
 attribute(method)         --> name, skills, assignedProjects, salary
 attribute access modifier --> private, public, protected(inheritance), __
 public  --> everywhere
 private --> current class
 no      --> current package
 
 class access modifier  --> public, ___
 public  --> everywhere
 no__    --> current package
 */



public class EmployeeA1 {
	public static String name;
	public static String[] skills; // {"C", "C++", "JAVA"};
	private static double salary;
	static String[] assignedProjects;
}