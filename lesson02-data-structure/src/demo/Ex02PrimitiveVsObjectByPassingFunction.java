package demo;

import bean.Single;

public class Ex02PrimitiveVsObjectByPassingFunction {
	public static void main(String[] args) {
		int a = 20;
		update(a);
		Single s1 = new Single(99);
		modify(s1);
		System.out.println(s1);
	}
	
	private static void update(int in) {
		in = 100;
	}
	
	private static int change(int input) {
		input = 99;	
		return input;
	}
	
	private static void modify(Single input) {
		input.value = 789;
	}
}
