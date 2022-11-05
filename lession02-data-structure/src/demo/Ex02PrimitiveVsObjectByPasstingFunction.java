package demo;

import bean.Single;

public class Ex02PrimitiveVsObjectByPasstingFunction {
	public static void main(String[] args) {
		int a = 20;
		update(a);
		a = change(a);
		System.out.println("a => " + a);

		Single s1 = new Single(25);
		modify(s1);
		System.out.println("s1 => " + s1);
	}

	private static void modify(Single input) {
		input.value = 789;
	}

	// pass by value at stack
	// int input = a;
	private static void update(int input) {
		input = 99;
	}

	private static int change(int input) {
		input = 99;
		return input;
	}
}
