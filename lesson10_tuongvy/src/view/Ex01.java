package view;

import java.util.ArrayList;
import java.util.Arrays;


public class Ex01 {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,2,4,3,1};
		System.out.print("Loai bo phan tu trung nhau: " + duplicateElement(arr));
		compareMean(arr);
		search(arr);
	}
	
	public static ArrayList<Integer> duplicateElement(Integer[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> duplicateElement = new ArrayList<Integer>();
		for (Integer element : arrayList) {
			if (!duplicateElement.contains(element)) {
				duplicateElement.add(element);
			}
		}
		return duplicateElement;
	}
	
	public static void compareMean(Integer[] arr) {
		double total = 0;
		double total1 = 0;
		if ((arr.length)%2 == 0) {
			for (int i = 0; i < (arr.length)/2; i++) {
				total += arr[i];
			}
			total = total/((arr.length)/2);
			for (int i = arr.length/2; i < arr.length; i++) {
				total1 += arr[i];
			}
			total1 = total1/((arr.length)/2);
			if (total > total1) {
				System.out.println("\ntrung binh n/2 phan tu dau lon hon n/2 phan tu sau: " + total + " > " + total1);
			}
			else if (total < total1) {
				System.out.println("\ntrung binh n/2 phan tu dau nho hon n/2 phan tu sau: " + total + " < " + total1);
			}
			else {
				System.out.println("\ntrung binh n/2 phan tu dau bang n/2 phan tu sau: " + total + " = " + total1);
			}
		}
		else {
			for (int i = 0; i < (arr.length + 1)/2; i++) {
				total += arr[i];
			}
			total = total/((arr.length + 1)/2);
			for (int i = (arr.length + 1)/2; i < arr.length; i++) {
				total1 += arr[i];
			}
			total1 = total1/((arr.length)/2);
			if (total > total1) {
				System.out.println("\ntrung binh n/2 phan tu dau lon hon n/2 phan tu sau: " + total + " > " + total1);
			}
			else if (total < total1) {
				System.out.println("\ntrung binh n/2 phan tu dau nho hon n/2 phan tu sau: " + total + " < " + total1);
			}
			else {
				System.out.println("\ntrung binh n/2 phan tu dau bang n/2 phan tu sau: " + total + " = " + total1);
			}
		}
		
	}
	
	public static void search(Integer[] arr) {
		Arrays.sort(arr, (o1, o2) -> o2.compareTo(o1));
		
		ArrayList<Integer> arrayList = duplicateElement(arr);
		System.out.println(arrayList.indexOf(2));
	}
	
	
	
	

}
