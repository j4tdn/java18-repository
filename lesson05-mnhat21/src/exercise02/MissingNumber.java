package exercise02;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] arr = {3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println(getMissingNumber(arr));
	}
	
	private static int getMissingNumber(int[] arr) {
		int result = 0;

		for(int i = 1; i <= arr.length + 1; i++) {
			boolean check = false;
			for(int j = 0; j < arr.length; j++) {
				if(i == arr[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				result = i;
				break;
			}
		}
		return result;
	}
}
