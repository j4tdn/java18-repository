package control;

import java.util.Scanner;

/**
 * Loop +for(index/each) +while +do while +interate(collection)
 */
public class Ex03BasicLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hãy nhập số nguyên n: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i += 5) {
			if (i % 12 == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
