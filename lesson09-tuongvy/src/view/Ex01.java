package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So phan tu: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		System.out.println("Arr1: ");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Arr2: ");
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		
		
		int[] arr = {};
		int N = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr1[i] == arr2[j]) {
					arr = Arrays.copyOf(arr, N + 1);
					arr[N] = arr1[i];
					N = N + 1;
				}
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i : arr) {
			if (!list.contains(i)) {
				list.add(i);
			}
		}
		
		
		System.out.print("Output: ");
		show(list);
	}
	
	private static void show(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
	}
}
	
	

