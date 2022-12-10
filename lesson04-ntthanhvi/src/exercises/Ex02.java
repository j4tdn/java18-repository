package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		// Nhập từ bàn phím n chữ số
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();

		// Nhập từ bàn phím dãy số nguyên gồm n chữ số
		int[] ranges = new int[n];
		for (int i = 0; i < ranges.length; i++) {
			System.out.print("n" + i + ": ");
			ranges[i] = ip.nextInt();
		}
		arrange(ranges);
	}

	private static void arrange(int[] ranges) {

		int[] begin = new int[ranges.length];
		int[] mid = new int[ranges.length];
		int[] end = new int[ranges.length];
		int b = 0;
		int m = 0;
		int e = 0;

		for (int i = 0; i < ranges.length; i++) {
			if (ranges[i] % 7 == 0 && ranges [i] % 5 != 0) {
				begin[b] = ranges[i];
				++b;
			} else if (ranges[i] % 7 != 0 && ranges[i] % 5 == 0) {
				end[e] = ranges[i];
				++e;
			} else {
				mid[m] = ranges[i];
				++m;
			}
		}
		int[] result = new int[b + m + e];
		int[] finalbegin = Arrays.copyOfRange(begin, 0, b);
		int[] finalmid = Arrays.copyOfRange(mid, 0, m);
		int[] finalend = Arrays.copyOfRange(end, 0, e);

		// arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		/*
		 * / src là mảng muốn sao chép srcPos là vị trí bắt đầu (chỉ số) trong mảng src
		 * dest là mảng đích: các phần tử của mảng src sẽ được sao chép vào mảng này
		 * destPos là vị trí bắt đầu (chỉ số) trong mảng dest length là số phần tử cần
		 * sao chép
		 */

		System.arraycopy(finalbegin, 0, result, 0, b);
		System.arraycopy(finalmid, 0, result, b, m);
		System.arraycopy(finalend, 0, result, b + m, e);

		System.out.println(Arrays.toString(result));
	}

}
