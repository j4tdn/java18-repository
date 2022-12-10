package encapsulation.companya;

/**
	attribute    --> public name,skills,assignedProjects,salary
	attribute access modifier    --> private.public,protected(inheritance),___

	public  --> everywhere
	private --> current class
	no___   --> current package
	
	class access modifier  -->public , ___
	public  --> everywhere
	no___      --> current package
*/

public class EmployeeA1 {
	 public static String name;
	 public static String[] skills; //{ "c","c++","java"};
	 private static double salary;
	 static String[] assignedProjects;
}
