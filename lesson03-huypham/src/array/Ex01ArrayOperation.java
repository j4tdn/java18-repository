package array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		// index: 0 -> 5
	    // value: 0 0 0 0 0 0 
		int[] numbers = new int[6];
		numbers[3] = 25;
		// System.out.println("Index 3: " + numbers[3]);
		// for index
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ": " + numbers[i]);
		}
		System.out.println("==================");
		// foreach: không quan tâm đến chỉ số
		// number: đặt tùy ý
		for(int number:numbers) {
			System.out.println("number: " + number);
		}
		System.out.println("==================");
		String[] sequences = {"hello", "hi", "welcome"};
		System.out.println("length: " + sequences.length);
		for (String sequence : sequences) {
			System.out.println(sequence);
		}
	}
}
