package demo;

public class Ex01ProgramStructure {
	public static void main(String[] args) {
		System.out.println("Welcome to class");
		int value = sum(5, 10);
		System.out.println("Result " + value);
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
