package sorting;

import java.util.Arrays;

import utils.ArrayUtils;
import utils.ArrayUtils.*;
/**
 * Sắp xếp chèn
 * 
 * @author ADMIN
 *
 */
public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] elements = {1,9,5,8,4,12};
		System.out.println("elements --> "+Arrays.toString(elements));
		System.out.println("\n=================\n");
		InsertionSort(elements);
		System.out.println("elements sorted asc--> "+Arrays.toString(elements));
	}
	private static void InsertionSort(int[] input) {
	
		for(int round = 0 ; round<input.length;round++) {
			for(int i = 0;i<round;i++) {
				if(input[i]>input[round]) {
					ArrayUtils.swap(input, i, round);
				}
			}
			
		}
		
	}
}
