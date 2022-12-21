package Ex02MissingNumberInArray;

public class FindingMissingNumber {
	public static void main(String[] args) {
		int[] numbers = {2, 3, 4, 7, 1, 5};
		System.out.println("Missing numner --> " + getMissingNumber(numbers));
		int[] numbers1 = {3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println("Missing numner --> " + getMissingNumber(numbers1));
	}
	
	private static int getMissingNumber(int[] numbers) {
		int n = numbers.length;
		for(int i = 1; i <= n; i++) {
			boolean k = true;
			for(int number:numbers) {
				if(number == i) {
					k = false;
					break;
				}
			}
			if(k == true) {
				return i;
			}
		}
		return 0;
	}
}
