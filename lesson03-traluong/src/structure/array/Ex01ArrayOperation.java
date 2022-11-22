package structure.array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[3] = 25;
		
		//for index
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ": " + numbers[i]);
		}
		
		System.out.println("===================");
		
		//for each
		
		for (int number: numbers) {
			System.out.println("Number: " + number);
		}
		
		
		System.out.println("===================");
		String[] sequenses = {"Hello", "Bonjour", "Konichiwa"};
		System.out.println("length: " + sequenses.length);
		
		for (String sequense: sequenses) {
			System.out.println("Sequense: " + sequense);
		}
		
	}
}
