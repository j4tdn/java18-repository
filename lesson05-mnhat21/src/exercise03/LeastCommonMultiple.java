package exercise03;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		System.out.println(getLeastCommonMultipleOfArray(arr));
	}
	
	private static int getGreatestCommonDivisor(int a, int b) {
		int result = 0;
		int c;
		if(a > b) {
			c = a;
		}
		else {
			c = b;
		}
		for(int i = c; i > 0; i--) {
			if(a % i == 0 && b % i == 0) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	private static int getLeastCommonMultiple(int a, int b) {
		return (a*b)/getGreatestCommonDivisor(a, b);
	}
	
	private static int getLeastCommonMultipleOfArray(int[] arr) {
		int result = getLeastCommonMultiple(arr[0], arr[1]);
		for(int i = 2; i < arr.length; i++) {
			result = getLeastCommonMultiple(result, arr[i]);
		}
		return result;
	}
	
	
}
