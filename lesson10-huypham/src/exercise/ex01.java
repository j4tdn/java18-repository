package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Bài 1: Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng
nhau VD: {7 8 8 8 6 2 5 1} Kết quả: 6
 * @author ASUS
 *
 */
public class ex01 {
	//Tạo mảng ngẫu nhiên
	public static int[] generateRandomArray(int n) {
        return new Random().ints(n, 1, 100).toArray();
    }
	
	//Loại bỏ phần tử lặp
	public static void removeDuplicates(int[] arr) {
		HashSet<Integer> uniqueElements = new HashSet<>();
		HashSet<Integer> nonUniqueElements = new HashSet<>();
		for (int number : arr) {
			if (uniqueElements.contains(number)) {
				uniqueElements.remove(number);
				nonUniqueElements.add(number);
			} 
			else if (!nonUniqueElements.contains(number)) {
				uniqueElements.add(number);
			}
		}
		System.out.println("Array non-repeating: " + uniqueElements);
	}
	
	// so sánh giá trị trung bình của n/2 phần tử đầu tiên và n/2 phần tử cuối cùng
    public static void compareMean(int[] arr) {
        int n = arr.length;
        double firstHalfMean = Arrays.stream(Arrays.copyOfRange(arr, 0, n/2)).average().orElse(Double.NaN);
        double secondHalfMean = Arrays.stream(Arrays.copyOfRange(arr, n/2, n)).average().orElse(Double.NaN);
        if ((firstHalfMean - secondHalfMean) > 0) {
			System.out.println("n/2 number first" + " > " + "n/2 number last");
		} else if ((firstHalfMean - secondHalfMean) < 0) {
			System.out.println("n/2 number first" + " < " + "n/2 number last");
		} else {
			System.out.println("n/2 number first" + " = " + "n/2 number last");
		}
    }
    //Tìm số lớn thứ 3
    public static int findThirdLargest(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        return list.size() >= 3 ? list.get(2) : null;
    }
    
	public static void main(String[] args) {
//		int[] arr = generateRandomArray(10);
		int[] arr = {1, 3, 5, 4, 3, 6, 7, 1, 8};
        System.out.println("Random array: " + Arrays.toString(arr));
        
        removeDuplicates(arr);
        
        System.out.println("=================");
        compareMean(arr);
        System.out.println("=================");
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Big number 3 of arr: " + thirdLargest);
	}
}
