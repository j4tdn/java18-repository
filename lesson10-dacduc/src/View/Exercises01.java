package View;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises01 {
	public static void main(String[] args) {

		int[] arrN = { 1, 2, 3, 4, 3, 1 };
		int count = 0;
		// loại bỏ các phần tử trùng nhau trong mảng
		int[] arrNew = new int[arrN.length];
		for (int i = 0; i < arrN.length; i++) {
			if (!isAlive(arrNew, arrN[i])) {
				arrNew[i] = arrN[i];
			} else {
				arrNew = Replace(arrNew, arrN[i]);
				count++;
			}
		}
		int[] arrResult = new int[count];
		int j = 0;
		for (int i = 0; i < arrNew.length; i++) {
			if (arrNew[i] != 0) {
				arrResult[j] = arrNew[i];
				j++;
			}
		}
		for (int i = 0; i < arrResult.length; i++) {
			System.out.print(" " + arrResult[i]);
		}
		
		// So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
		System.out.println("\n========================");
		int index = arrN.length % 2 == 0 ? arrN.length / 2 : arrN.length / 2 + 1;
		int[] arrNumFirst = Arrays.copyOfRange(arrN, 0, index);
		int[] arrNumSecond = Arrays.copyOfRange(arrN, index, arrN.length);
		if (median(arrNumFirst) < median(arrNumSecond)) {
			System.out.println("giá trị trung bình của n/2 phần tử đầu tiên bé hơn n/2 phần tử cuối cùng");
		} else {
			System.out.println("giá trị trung bình của n/2 phần tử đầu tiên lớn hơn n/2 phần tử cuối cùng");
		}
		//số lớn thứ 3 trong mảng
		System.out.println("\n========================");
		int[] arrNew2 = new int[arrN.length];
		for (int i = 0; i < arrN.length; i++) {
			if (!isAlive(arrNew2, arrN[i])) {
				arrNew2[i] = arrN[i];
			} 
		}
		System.out.println("\nsố lớn thứ 3 trong mảng : "+MaxThird(arrNew2));
		
	}

	private static boolean isAlive(int[] arrNumber, int numBer) {
		for (int i = 0; i < arrNumber.length; i++) {
			if (arrNumber[i] == numBer) {
				return true;
			}
		}
		return false;
	}

	private static int[] Replace(int[] arrNumber, int numBer) {
		for (int i = 0; i < arrNumber.length; i++) {
			if (arrNumber[i] == numBer) {
				arrNumber[i] = 0;
			}
		}
		return arrNumber;
	}

	private static double median(int[] arrNumber) {
		double result, sum = 0;
		for (int i = 0; i < arrNumber.length; i++) {
			sum += arrNumber[i];
		}
		return sum / arrNumber.length;
	}
	private static int MaxThird(int[] arrNumber) {
		Arrays.sort(arrNumber);
		return arrNumber[arrNumber.length-3];
	}
}
