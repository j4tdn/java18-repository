package encapsulation.companya;
/**
 attribute --> name, skills, assignedProjects, salary
 access modifier --> private, public, protected(inheritance),_____


 public --> everywhere
 private --> current class
 no --> current package
 
 class access modifier --> public, _____
 public --> everywhere
 no___ --> current package
 */
public class EmployeeA1 {
	public static String name;
	public static String[] skills; // { "C", "C++", "java" }
	private static double salary;
	static String[] assingedProjects;
}