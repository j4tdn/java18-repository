package Bai2;

import java.util.Scanner;

public class Bai2Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		input(arr);
		output(NChiaHet7(arr),Arr(arr),NChiaHet5(arr),n);
	}

	private static void input(int[] arr) {
		Scanner ip = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input arr[" + i + "]: ");
			int index = ip.nextInt();
			arr[i] = index;
		}
	}

	private static void output(int[] arr, int[] arr1, int[] arr2, int n) {
		System.out.println("n: "+n);
		int[] arrray = new int[n];
		int count =0;
		for (int j : arr) {
			arrray[count] = j;
			count++;
		}
		for (int j : arr1) {
			arrray[count] = j;
			count++;
		}
		for (int j : arr2) {
			arrray[count] = j;
			count++;
		}
		for (int i : arrray) {
			System.out.print(i+" ");
		}
	}

	private static int[] NChiaHet5(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				count++;
			}
		}
		int[] array = new int[count];
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				array[count1] = arr[i];
				count1++;
			}
		}
		return array;
	}

	private static int[] NChiaHet7(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				count++;
			}
		}
		int[] array = new int[count];
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				array[count1] = arr[i];
				count1++;
			}
		}
		return array;
	}

	private static int[] Arr(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 7 != 0 && arr[i] % 5 != 0) || (arr[i] % 7 == 0 && arr[i] % 5 == 0)) {
				count++;
			}
		}
		int[] array = new int[count];
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 7 != 0 && arr[i] % 5 != 0) || (arr[i] % 7 == 0 && arr[i] % 5 == 0)) {
				array[count1] = arr[i];
				count1++;
			}
		}
		return array;
	}
}
