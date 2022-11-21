package demo;

public class Ex06ArrayOperation {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[3] = 25;
		for (int i = 0; i < 6; i++) {
			System.out.println("index mang : " + i + " " + numbers[i]);
		}
		System.out.println("=================");
		for (int number : numbers) {
			System.out.println("number : " + number);

		}
		String[] sepuences = {"hello","hi","welcome"};
		System.out.println("length: " + sepuences.length);
		for(int i=0;i<sepuences.length;i++) {
			System.out.println(sepuences[i]);
		}
		System.out.println("=================");
		for ( String a : sepuences) {
			System.out.println(a);
		}
	}
}
