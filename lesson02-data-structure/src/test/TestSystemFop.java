package test;

public class TestSystemFop {
	
	// global data
	static String DO_SOMTHING = "do something ";
	
	public static void main(String[] args) {
		System.out.println(DO_SOMTHING + "system");
		function1();
		// ... cannot run
		function2();
	}
	
	static void function1() {
		// dữ liệu giảng viên
		System.out.println(DO_SOMTHING + "1");
		function1_1();
		function1_2();
		// ... cannot run
	}
	
	static void function2() {
		System.out.println(DO_SOMTHING + "2");
		function2_1();
		function2_2();
	}
	
	static void function1_1() {
		System.out.println(DO_SOMTHING + "1.1");
	}
	
	
	// Test Error in 1.2
	static void function1_2() {
		System.out.println(DO_SOMTHING + "1.2");
		System.out.println("--> " + (5/0));
	}
	
	static void function2_1() {
		System.out.println(DO_SOMTHING + "2.1");
	}
	
	static void function2_2() {
		System.out.println(DO_SOMTHING + "2.1");
	}
}
