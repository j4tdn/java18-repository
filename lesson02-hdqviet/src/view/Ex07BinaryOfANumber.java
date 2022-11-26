package view;

public class Ex07BinaryOfANumber {
	public static void main(String[] args) {
		int n = 4;
		
		System.out.print("Binary of number " + n + " is: ");
		convertToBinary(n);
	}
	
	private static void convertToBinary(int n) {
		int i = 0;
		int[] result = new int[100];
		
		while (n > 0) {
			result[i] = n % 2;
			n /= 2;
			i++;
		}
		
		for (int k = i - 1; k >= 0; k--) {
			System.out.print(result[k]);
		}
	}
}
