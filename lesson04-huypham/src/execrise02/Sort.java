package execrise02;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = ip.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			int a = ip.nextInt();
			arr[i] = a;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				addTop(arr, i);
			}
			if(arr[i] % 5 == 0) {
				addBot(arr, i);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
	
	private static int[] addTop(int arr[], int x) {
		int tempArr[] = new int[arr.length + 1];
		tempArr[0] = arr[x];
		for(int i = 0; i < arr.length; i++) {
			tempArr[i+1] = arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			if(i<=x) {
				arr[i] = tempArr[i];
			}else {
				arr[i] = tempArr[i+1];
			}
		}
		return arr;
	}
	
	private static int[] addBot(int arr[], int x) {
		int tempArr[] = new int[arr.length + 1];
		tempArr[arr.length] = arr[x];
		for(int i = 0; i < arr.length; i++) {
			tempArr[i] = arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			if(i<x) {
				arr[i] = tempArr[i];
			}else {
				arr[i] = tempArr[i+1];
			}
		}
		return arr;
	}
}
