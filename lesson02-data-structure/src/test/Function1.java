package test;

public class Function1 {
	
	// store data separately for each sub-system
	private static String DO_SOMTHING = "do something ";
	
	// provide access modifier
	static void function1_1() {
		System.out.println(DO_SOMTHING + "1.1");
	}
	
	static void function1_2() {
		System.out.println(DO_SOMTHING + "1.2");
		System.out.println("--> " + (5/0));
	}
	
	// make code clearable
}
