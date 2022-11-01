package demo;

import bean.Single;

public class Ex02PrimitiveVsObjectByPassingFunction {
	public static void main(String[] args) {
		int a = 20;
		a = change (a);
		System.out.println("a => " +a);
		
		Single s1 = new Single (25);
		modify (s1);
		System.out.println("s1 => " + s1);
		
	}
	
	//Single input = s1
	private static void modify (Single input) {
		input = new Single (50);
		input.value = 789;
	}
	// pass by value at STACK
	// int input = a;
	// 1 biến (ô nhớ) kiểu nguyên thủy --> khi mình truyền tham số đó qua hàm
	// và trả về void --> giá trị của ô nhớ đó không bao giờ thay đổi
	private static void update (int input) {
		input = 100; 
	}
	
	// pass by value at STACK
	// int input = a;
	private static int change (int input) {
		input = 100;
		return input; 
	}
}
