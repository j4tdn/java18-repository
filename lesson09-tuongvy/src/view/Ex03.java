package view;

import java.util.Arrays;


public class Ex03 {
	public static void main(String[] args) {
		int[] arr = {8, 5, 9, 20};
		int[] temp = {};
		int N = temp.length;
		int count = 0;
		int dem = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}
			temp = Arrays.copyOf(temp, N + 1);
			temp[N] = arr[i];
			if (count > dem && i >= 1) {
				swapArray(temp, N-1, N-2);
			}
			N = N + 1;
			dem = count;
			count = 0;
			
			
		}
		show(temp);
	}
	
	private static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	private static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}

