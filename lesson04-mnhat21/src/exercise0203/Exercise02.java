package exercise0203;

import java.util.Scanner;

/**
 * Cho một dãy số nguyên ngẫu nhiên gồm n chữ số, viết chương trình:
	Gom tất cả các số chia hết cho 7 về đầu dãy và tất cả các số chia hết cho 5 về cuối dãy. Các số
	vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại đưa ra giữa.
	Input: 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18
	Output: 21, 49, 14 , 12, 19, 32, 35, 33, 18, 25, 10
 */

public class Exercise02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input n : ");
		int n = ip.nextInt();
		int[] arr = new int[n];
		input(arr);

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 7 == 0 && arr[i] % 5 == 0) {
				int temp = arr[i];
				arr = del(arr, i);
				arr = add(arr, arr.length/2 - 1, temp);
			}
			else if(arr[i] % 7 == 0) {
				int temp = arr[i];
				arr = del(arr, i);
				arr = add(arr, 0, temp);
			}
			else if(arr[i] % 5 == 0) {
				int temp = arr[i];
				arr = del(arr, i);
				arr = add(arr, arr.length, temp);
			}
			
		}
		output(arr);
	}
	
	private static void input(int[] arr) {
		Scanner ip = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Input arr[" + i + "]: ");
			int index = ip.nextInt();
			arr[i] = index;
		}
	}
	
	private static void output(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	private static int[] del(int[] arr, int m) {
		int tempArr[] = new int[arr.length - 1];
		for(int i = m; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		for(int i = 0; i < tempArr.length; i++) {
			tempArr[i] = arr[i];
		}
		return tempArr;
	}
	
	private static int[] add(int arr[], int n, int x) {
		int tempArr[] = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			tempArr[i] = arr[i];
		}
		for(int i = tempArr.length - 1; i > n; i--) {
			tempArr[i] = tempArr[i-1];
		}
		tempArr[n] = x;
		return tempArr;
	}
}
