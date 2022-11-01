package demo;
import bean.Single;
public class Ex02PrimitiveVsObjectByPassingFunction {
	public static void main(String[] args) {
		int a = 20;
		update(a);
		System.out.println("a => " + a);
		change(a);
		Single s1 = new Single(25);
		modify(s1);
		System.out.println(s1.toString());
	}
	private static void update(int input) {
		input = 100;
	}	
	private static int change(int input ) {
		input = 99;
		return input;
	}
	private static void modify(Single input) {
		input.value = 999;
	}
}
