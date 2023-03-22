package sorting;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;
import utils.ArrayUtils;
import utils.ArrayUtils.*;
/**
 * Sắp xếp nổi bọt
 * 
 * @author ADMIN
 *
 */
public class Ex02SelectionSortStrategy {
	public static void main(String[] args) {
		int[] elements = {1,9,5,8,4,12};
		System.out.println("elements --> "+Arrays.toString(elements));
		System.out.println("\n=================\n");
		SelectionSort(elements,(e1,e2) -> { return e1-e2;});
		System.out.println("elements sorted asc--> "+Arrays.toString(elements));
	}
	//default:ascending
	//Quan trọng
	// Hiểu thuật toán( đoan if) như thế nào
	//Hiểu e1,e2 là phần tử nào trong mảng
	
	private static void SelectionSort(int[] input,ComparableStrategy cs) {
	
		for(int pivot = 0 ; pivot<input.length-1;pivot++) {
			for(int i = pivot+1;i<input.length;i++) {
				if(cs.compare(input[i],input[pivot])<0) {
					ArrayUtils.swap(input, i, pivot);
				}
			}
			
		}
		
	}
}
