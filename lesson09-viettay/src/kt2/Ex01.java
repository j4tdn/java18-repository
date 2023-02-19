package kt2;
/**
 Bài 1: Đếm số phần tử chung
		Cho 2 mảng số nguyên đơn điệu có cùng số phần tử là n (4 < n < 40). Viết phương thức tìm số phần
		tử chung của 2 mảng đó
		Example
		Mảng 1: 2 8 9 1 6
		Mảng 2: 2 1 1 8 9
		Output
		1 2 8 9
 */
import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 8, 9, 1, 6 };
		int[] arr2 = { 2, 1, 1, 8, 9 };
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set1.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			if (set1.contains(arr2[i])) {
				set2.add(arr2[i]);
			}
		}

		for (int num : set2) {
			System.out.print(num + " ");
		}
	}
}
	
	


