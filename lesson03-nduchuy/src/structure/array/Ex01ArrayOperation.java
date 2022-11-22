package structure.array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("index " + i + ": " + numbers[i]);
		}
		System.out.println("=======================");
		// foreach
		for (int number : numbers) {
			System.out.println("number: " + number);
		}
		System.out.println("========================");
		String[] sequences = {"hello","hi","welcome"};
		for(String sequence: sequences) {
			System.out.println(sequence);
		}
	}
}
