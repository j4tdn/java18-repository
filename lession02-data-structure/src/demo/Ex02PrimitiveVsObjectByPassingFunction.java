package demo;

import bean.Single;

public class Ex02PrimitiveVsObjectByPassingFunction {
	public static void main(String[] args) {
		int a = 20;
		update(a);
		a = change(a);
		System.out.println(a);
		
		Single s1 = new Single(25);
		modify(s1);
		System.out.println(s1);
	}
	
	private static void modify(Single input) {
		//input = new Single(50);
		input.value = 789;
	}
	
	public static void update(int input) {
		input = 99;
	}
	
	private static int change(int input) {
		input = 99;
		return input;
	}
}
