package excercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length number: ");
		int n = sc.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("==========================================================================");
		sort(numbers);
	}

	static void sort(int[] arrays) {
		int s = 0;
		int m = 0;
		int e = 0;
		int[] start = new int[arrays.length];
		int[] mid = new int[arrays.length];
		int[] end = new int[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] % 7 == 0 && arrays[i] % 5 != 0) {
				start[s] = arrays[i];
				++s;
			} else if (arrays[i] % 7 != 0 && arrays[i] % 5 == 0) {
				end[e] = arrays[i];
				++e;
			} else {
				mid[m] = arrays[i];
				++m;
			}
		}
		int[] finalStart = Arrays.copyOfRange(start, 0, s);
		int[] finalMid = Arrays.copyOfRange(mid, 0, m);
		int[] finalEnd = Arrays.copyOfRange(end, 0, e);

		int[] result = new int[s + m + e];

		System.arraycopy(finalStart, 0, result, 0, s);
		System.arraycopy(finalMid, 0, result, s, m);
		System.arraycopy(finalEnd, 0, result, m + s, e);

		System.out.println(Arrays.toString(result));
	}
}
