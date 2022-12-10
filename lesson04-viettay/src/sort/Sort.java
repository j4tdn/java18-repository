package sort;

import java.util.Scanner;
import java.util.Vector;

/**
 * 
 Bài 2: 	Cho một dãy số nguyên ngẫu nhiên gồm n chữ số, viết chương trình:
			Gom tất cả các số chia hết cho 7 về đầu dãy và tất cả các số chia hết cho 5 về cuối dãy. Các số
			vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại đưa ra giữa.
			Input: 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18
			Output: 21, 49, 14 , 12, 19, 32, 35, 33, 18, 25, 10
 *
 */
public class Sort {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = ip.nextInt();
		}
		result(numbers);
	}

	private static void result(int[] numbers) {
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();
		for (int number : numbers) {
			if (number % 7 == 0 && number % 5 != 0) {
				v1.add(number);
			} else if (number % 5 == 0 && number % 7 != 0) {
				v3.add(number);
			} else {
				v2.add(number);
			}
		}
		for (int i = 0; i < v1.size(); i++) {
			System.out.print(v1.get(i) + " ");
		}
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + " ");
		}
		for (int i = 0; i < v3.size(); i++) {
			System.out.print(v3.get(i) + " ");
		}
	}

}


