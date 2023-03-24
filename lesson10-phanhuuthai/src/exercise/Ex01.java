package exercise;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 1};
		int[] newArr = new int[arr.length];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(!checkAlike(newArr, arr[i])) {
				newArr[i] = arr[i];
				
			} else {
				count++;
				newArr = newArray(newArr, arr[i]);
			}
		}
		
		int k = 0;
		int[] result = new int[count];
		for(int i = 0; i < newArr.length; i++) {
			if(newArr[i] != 0) {
				result[k] = newArr[i];
				k++;
			}
		}
		for(int i = 0; i < result.length; i++) {
			System.out.print("loại bỏ phần tử trùng" + result[i]+ " ");
		} 
		System.out.println("\n========================");
		int[] arrResult2 = new int[arr.length];
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!checkAlike(arrResult2, arr[i])) {
				arrResult2[i] = arr[i];
				count2++;
			} 
		}
		
		int[] arrResult3 = Arrays.copyOfRange(arrResult2, 0, count2);
		
		for(int i = 0; i < arrResult3.length; i++) {
			System.out.print( arrResult3[i]+ " ");
		} 
		System.out.println("\nsố lớn thứ 3 trong mảng : "+thirdMax(arrResult3));
		
	}
	
	public static boolean checkAlike(int[] arr, int a) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == a) {
				return true;
			}
		}
		return false;
	}
	
	public static int[] newArray(int[] arr, int a) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == a) {
				arr[i] = 0;
			}
		}
		return arr;
	}
	
	public static int thirdMax(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-3];
	}
}
