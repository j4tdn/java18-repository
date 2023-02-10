package view;
/**
 Bài 4: Số nguyên tố tương đương
		Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
		số nguyên tố.
		Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là
		3 và 5.
		Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
		số này có là nguyên tố tương đương với nhau hay không?
		Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
		Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.
 */
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
