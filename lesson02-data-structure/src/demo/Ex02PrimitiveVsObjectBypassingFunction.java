package demo;

import bean.Single;

public class Ex02PrimitiveVsObjectBypassingFunction {
	public static void main(String[] args) {
		int a = 20;
		a= change(a);
		System.out.println(a);
		Single s1 = new Single(25);
		modify(s1);
		System.out.println(s1);
	}
	
	private static void modify(Single input)
	{
		input = new Single(50);
		input.value = 789;
	}

private static void update(int input) {
	input = 99;
}

private static int change(int input)
{
	input = 99;
	return input;
}
}
