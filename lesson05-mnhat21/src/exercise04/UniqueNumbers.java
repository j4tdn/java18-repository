package exercise04;

public class UniqueNumbers {
	public static void main(String[] args) {
		int[] arr = {3, 15, 21, 0, 15, 17, 21};
		int[] results = sort(getUniqueNumbers(arr));
		// sort(arr);
		for(int a : results) {
			System.out.print(a + " ");
		}
	}
	
	private static int[] getUniqueNumbers(int[] arr) {
		int[] tempArr = new int[arr.length];
		int n = 0;
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == arr[i]) {
					count++;
				}
			}
			if(count == 1) {
				tempArr[n++] = arr[i];
			}
		}
		int[] result = new int[n];
		for(int i = 0; i < n; i++) {
			result[i] = tempArr[i];
		}
		return result;
	}
	
	private static int[] sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
