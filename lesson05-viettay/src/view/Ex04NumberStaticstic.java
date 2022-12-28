package view;

import java.util.Arrays;

import bean.NrsStas;

/**
 *  Bài 4: Cho mảng A gồm n phần tử (2 < n < 20). Ak = [0, 100]
	Viết hàm liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong mảng. Kết quả
	trả về được sắp xếp tăng dần.
	 Input: 3, 15, 21, 0, 15, 17, 21
	 Output: 0, 3, 17 
	
	Staticstic: thống kê
 *
 */
public class Ex04NumberStaticstic {

	public static void main(String[] args) {
		int[] numbers = { 99, 16, 3, 15, 21, 0, 15, 17, 21 };
		int[] validNumbers = statistic(numbers);
		Arrays.sort(validNumbers); // sắp xếp tăng dần
		System.out.println(Arrays.toString(validNumbers));

	}
	
	private static int[] statistic(int[] numbers) {
		int[] validNumbers = new int[numbers.length];
		int k = 0;
		NrsStas[] nrsStases = groupBy(numbers);
		for (NrsStas nrsStas : nrsStases) {
			if (nrsStas.getCount() == 1) {
				validNumbers[k++] = nrsStas.getNumber();
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, k);
	}

	private static NrsStas[] groupBy(int[] numbers) {
		// (3,1) (15,1) (21,1) (0,1) null null null

		NrsStas[] nrsStases = new NrsStas[numbers.length];
		int k = 0;
		for (int number : numbers) {
			int indexOf = indexOf(nrsStases, number, k);
			if (indexOf == -1) {
				// add new number with count = 1
				nrsStases[k++] = new NrsStas(number, 1);
			} else {
				nrsStases[indexOf].plusCount();
			}
		}
		return Arrays.copyOfRange(nrsStases, 0, k);
	}
	
	// check number đã tồn tại trong mảng chưa
	// i >= 0 --> number existed in
	// i = -1 --> non exist
	
	private static int indexOf(NrsStas[] nrsStases, int number, int nonNullElements) {
		for (int i = 0; i < nonNullElements; i++) {
			if (nrsStases[i].getNumber() == number) {
				return i;
			}
		}
		return -1;
	}
}