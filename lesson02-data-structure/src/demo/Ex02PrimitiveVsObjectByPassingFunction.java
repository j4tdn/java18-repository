package demo;

import bean.Single;

public class Ex02PrimitiveVsObjectByPassingFunction {
	public static void main(String[] args) {
		int a = 20;
		a = change(a);
		System.out.println("a => " + a);
		
		Single s1 = new Single(25);
		modify(s1);
		System.out.println("s1 => " + s1);
	}
	
	//Single input = s1
	// pass by value at stack
	public static void modify(Single input) {
		input = new Single(50);
		input.value = 789;
	}
	private static void update(int input) {
		input = 99;
	}
	
	// pass by value at stack
	// int input = a;
private static int change(int input) {
	input = 99;
	return input;
}
}
