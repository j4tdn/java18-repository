package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int N = ip.nextInt();
		
		System.out.print("Nhập M: ");
		int M = ip.nextInt();
		
		List<Integer> l1 = listFactors(N).stream().distinct().collect(Collectors.toList());
		List<Integer> l2 = listFactors(M).stream().distinct().collect(Collectors.toList());
		System.out.println(l1.equals(l2) ? "YES" : "NO");
	}

	public static List<Integer> listFactors(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				list.add(i);
				n /= i;
			} else
				i++;
		}
		return list;
	}
}
