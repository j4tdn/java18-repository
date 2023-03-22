package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] data = {1, 2, 3, 4, 5, 6, 3, 3, 4, 7, 5, 1, 4, 9, 10, 11, 8};
		System.out.println("==========Data cleaned==============");
		Integer[] data_cleaned = cleanDuplicatedData(data);
		System.out.println(Arrays.toString(data_cleaned));
		
		System.out.println("==========Compare average data for first half and second half==============");
		System.out.print("Compare --> ");
		System.out.println(
					getFirstHalfAvg(data_cleaned) > getSecondHalfAvg(data_cleaned) ?
					"Greater": "Smaller"
				); 
		
		System.out.println("==========Third greatest element==============");
		System.out.println("--> " + getGreatestData(data_cleaned, 3));
		
		
	}

	public static Integer[] cleanDuplicatedData(Integer[] inArr) {
		Integer[] result = new Integer[inArr.length];
		int k = 0;
		for (int i = 0; i < inArr.length; i++) {
			if (!isDuplicated(inArr[i], inArr)) {
				result[k] = inArr[i];
				k++;	
			}
		}
		
		return Arrays.copyOf(result, k) ;
	}
	public static boolean isDuplicated(int data, Integer[] inArr) {
		int count = 0;
		for (int i = 0; i < inArr.length; i++) {
			if (data == inArr[i]) {
				count++;
			}
		}
		return count > 1 ? true: false;
	}
	public static double getFirstHalfAvg(Integer[] inArr) {
		Integer[] firstHalf = Arrays.copyOf(inArr, inArr.length/2);
		double result = 0;
		for (int e: firstHalf) {
			result += e;
		}
		result /= firstHalf.length;
		return result;
	}
	public static double getSecondHalfAvg(Integer[] inArr) {
		Integer[] secondHalf = Arrays.copyOfRange(inArr, inArr.length/2, inArr.length);
		double result = 0;
		for (int e: secondHalf) {
			result += e;
		}
		result /= secondHalf.length;
		return result;
	}
	public static int getGreatestData(Integer[] inArr, int index) {
		Arrays.sort(inArr, Comparator.reverseOrder());
		return inArr[index-1];
	}
}
