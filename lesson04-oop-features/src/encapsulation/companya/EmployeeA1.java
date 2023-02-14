package encapsulation.companya;

/** 
 attributes (method)	    --> name, skills, assignedProjects, salary
 attributes access modifier --> private, public, protected (relate to inheritance), __

 public  			   --> everywhere
 private 			   --> within current class 
 no access modifier    --> within current package
 
 class access modifier --> public, __
 public --> everywhere
 __     --> within current package
 
 */

public class EmployeeA1 {
	public static String name;
	public static String[] skills; // {"C", "C++", "JAVA"};
	private static double salary;
	static String[] assignedProjects;
	

}
