package sorting;

import java.util.Arrays;

/**
 * Sắp xếp nổi bọt
 * 
 * @author ADMIN
 *
 */
public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] elements = {1,9,5,8,4,12};
		System.out.println("elements --> "+Arrays.toString(elements));
		System.out.println("\n=================\n");
		BubbleSort(elements);
		System.out.println("elements sorted asc--> "+Arrays.toString(elements));
	}
	private static void BubbleSort(int[] input) {
		int len = input.length-1;
		for(int round = 0; round<input.length;round++) {
			for(int i  = 0 ; i <len-i;i++)  {
				if(input[i]>input[i+1]) {
					int tmp = input[i];
					input[i] = input[i+1];
					input[i+1] = tmp;
				}
			}
		}
	}
}
