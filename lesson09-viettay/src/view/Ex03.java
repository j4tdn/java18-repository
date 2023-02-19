package view;

import java.util.Scanner;

import bean.Number;

/**
 * Bài 3: Level của số tự nhiên Level của một số tự nhiên là số ước của nó. Ví
 * dụ . 8 có level là 4 vì có 4 ước số: 1, 2, 4 ,8 . 5 có level là 2 vì có 2 ước
 * số: 1, 5 . 9 có level là 3 vì có 3 ước số: 1, 3, 9 . 20 có level là 6 vì có 6
 * ước số: 1, 2, 4, 5, 10, 20 Cho một mảng số nguyên gồm n (3 < n < 20) phần tử.
 * Viết chương trình sắp xếp mảng số nguyên theo level tăng dần Ví dụ: n = 4.
 * Mảng số nguyên: 8 5 9 20 Kết quả sau khi đã sắp xếp: 5 9 8 20
 * 
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = ip.nextInt();
		int[] number = new int[n];
		for (int i = 0; i < number.length; i++) {
			number[i] = ip.nextInt();
		}
		Number[] num = check(number);
		for (Number x : num) {
			System.out.print(x.getY() + " ");
		}
	}

	private static Number[] check(int[] number) {
		Number[] rs = new Number[number.length];
		int x = 0;
		int count = 2;
		for (int n : number) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			rs[x++] = new Number(count, n);
			count = 2;
		}
		return rs;
//		int temp = rs[0].getX();
//		for (int i = 0; i < rs.length - 1; i++) {
//			for (int j = i + 1; j < rs.length; j++) {
//				if (rs[i].getX() > rs[j].getX()) {
//					temp = rs[j].getX();
//					rs[j].setX(rs[i].getX());
//					rs[i].setX(temp);
//				}
//			}
//		}	
	}
}
