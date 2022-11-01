package demo;

import bean.Single;

public class Ex02PrimitiveVsObjectByPassingFuncton {
	static int a = 20;
	public static void main(String[] args) {
		Single s1 = new Single(25);
		update(a);
		a=s1.change(25);
		System.out.println(a);
		System.out.println(s1.toString());
		s1 = modify(s1);
		System.out.println(s1);
	}
	
	private static void update(int input) {
		input = 100;
	}
	
	private static int change(int input) {
		input = 99;
		return input;
	}
	
	private static Single modify(Single input) {
		input = new Single(50);
		input.value = 789;
		return input;
	}
}

