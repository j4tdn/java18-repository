package view.kt;

import java.util.Arrays;

import bean.NbrStas;

/**
 * Phương pháp tổng quát: thống kê số lần xuất hiện của một số
 * Class: NbrStas: number, count
 * Trả về mảng kiểu đối tượng (để lưu số đó và số lần xuất hiện)
 * NbrStas[numbers.length]: (3, 1), (15, 2), (21, 2), (0, 1), (17, 1)
 * Loop element in numbers
 * 
 * ======
 * (k)                   1        2       3        4       5
 *                 --> (3, 1), (15, 2), (21, 2), (0, 1), (17, 1)  
 *                       ↑ 
 * (default value) -->  null,   null,    null,    null,   null,   null,   null
 * 				   -->   3,      15,      21,      0,      15,     17,     21 
 * ========
 * i >= 0 --> number existed in nbrStases
 * i = -1 --> not exist
 * 
 * ====
 * Arrays.sort(); => sort ascending by default
 */

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };

		int[] result = statistic(numbers);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));

	}

	private static int[] statistic(int[] numbers) {
		int[] validNumbers = new int[numbers.length];
		int k = 0;
		NbrStas[] nbrStases = groupBy(numbers);

		for (NbrStas nbrStas : nbrStases) {
			if (nbrStas.getCount() == 1) {
				validNumbers[k++] = nbrStas.getNumber();
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, k);
	}

	private static NbrStas[] groupBy(int[] numbers) {
		NbrStas[] nbrStases = new NbrStas[numbers.length];
		int k = 0;
		for (int number : numbers) {
			int indexOf = indexOf(nbrStases, number, k);
			if (indexOf == -1) {
				nbrStases[k++] = new NbrStas(number, 1);
			} else {
				nbrStases[indexOf].plusCount();
				// nbrStases[indexOf].setCount(nbrStases[indexOf].getCount() + 1);
			}
		}
		return Arrays.copyOfRange(nbrStases, 0, k); // Copy [0, k)
	}

	private static int indexOf(NbrStas[] nbrStases, int number, int nonNullElements) {
		for (int i = 0; i < nonNullElements; i++) {
			if (nbrStases[i].getNumber() == number) {
				return i;
			}
		}
		return -1;
	}

}
