package sorting;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;
import utils.ArrayUtils;
import utils.ArrayUtils.*;
/**
 * Sắp xếp chèn
 * 
 * @author ADMIN
 *
 */
public class Ex03InsertionSortStrategy {
	public static void main(String[] args) {
		int[] elements = {1,9,5,8,4,12};
		System.out.println("elements --> "+Arrays.toString(elements));
		System.out.println("\n=================\n");
//		InsertionSortStrategy (elements);
		System.out.println("elements sorted asc--> "+Arrays.toString(elements));
	}
	//problem solving ---> logic,business --> mindset
	//algorithm --> learn theory
	private static void InsertionSort(int[] input,ComparableStrategy cs) {
	
		for(int round = 0 ; round<input.length;round++) {
			for(int i = 0;i<round;i++) {
				//input[i]>input[round]
				if(cs.compare(i, round)>0) {
					ArrayUtils.swap(input, i, round);
				}
			}
			
		}
		
	}
}
