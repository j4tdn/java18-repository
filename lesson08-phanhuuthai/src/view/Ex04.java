package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int n = ip.nextInt();
		System.out.print("Nhập M: ");
		int m = ip.nextInt();
		List<Integer> l1 = listFactors(n).stream().distinct().collect(Collectors.toList());
		List<Integer> l2 = listFactors(m).stream().distinct().collect(Collectors.toList());
		System.out.println(l1.equals(l2) ? "YES" : "NO");
	}

	public static List<Integer> listFactors(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int c = 2;
		while (n > 1) {
			if (n % c == 0) {
				list.add(c);
				n /= c;
			} else
				c++;
		}
		return list;
	}
}
