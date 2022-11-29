package encapsulation.companya;

/**
 * attribute(method) -> name, skills, assignedProjects, salary access modifier
 * -> private , public, protected,..
 * 
 * public: everywhere 
 * private: current class 
 * no (default) : curent package
 * 
 *class acccess modifier --> public, default
 * public --> everywhere
 * no  --> current package
 */

//ABC

public class EmployeeA1 {
	public static String name;
	public static String[] skills; // {"C", "C++", "java"}
	private static double salary;
	static String[] assignedPrjects;
}
