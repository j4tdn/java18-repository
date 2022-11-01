package demo;

import bean.Single;

public class Ex02PrimitiveVsObjectByPassingFunction {
	public static void main(String[] args) {
		int a = 20;
		update(a);
		System.out.println("a => "+a);
		
		Single s1 = new Single(25); // H1(25)
		modify(s1);
		System.out.println("s1 => " +s1);
	}
	
	// input(H1) = s1(H1)
	public static void modify(Single input) {
		//input = new Single(50);
		input.value =  789;
	}
	
	//pass by value at stack
	//int input = a;
	//1 
	private static void update(int input) {
		input = 100;
	}
	
	//pass by value at stack
	//int input = a;
	private static int change(int input) {
		input =   99;
		return input;
	}

}
