package sorting.primative;

import java.util.Arrays;
import Utils.ArrayUtils;
import common.SortOrder;

public class Ex04QuickShort {
	public static void main(String[] args) {
		int[] elements = { 1, 7, 4, 3, 9, 5, 2 };
		System.out.println(Arrays.toString(elements));
		System.out.println("==============");
		ArrayUtils.sort(elements, SortOrder.ASC);
		System.out.println(Arrays.toString(elements));
	}
}
