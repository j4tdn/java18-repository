package exercises;

import java.util.*;


/**
 * 
 * Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức: 
 * 1. Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4} 
 * 2. So sánh giá trị trung bình của n/2 phần tử đầu tiên 
 * với n/2 phần tử cuối cùng 
 * 3. Tìm số lớn thứ 3 trong mảng. 
 * Lưu ý trường hợp các phần tử lớn nhất trùng nhau 
 * VD: {7 8 8 8 6 2 5 1} Kết quả: 6
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = ip.nextInt();
		int [] arr = array(n);
		
		System.out.println("Mảng ngẫu nhiên: " + Arrays.toString(arr));
		
		// loại bỏ phần tử trùng nhau từ mảng arr và
		// lưu kết quả vào mảng uniqueArr
		ArrayList<Integer> uniqueArr = removeDuplicates(arr);
		System.out.println("Mảng sau khi loại bỏ phần tử trùng nhau:\n" + uniqueArr);
		
		// So sánh
		compareMeans(arr);
		
		// Tìm
		System.out.println("Phần tử lớn thứ 3 trong mảng: " + findThirdLargest(arr));
		
	}

	// Tạo mảng ngẫu nhiên gồm n phần tử
	private static int[] array(int n) {
		int [] arr = new int[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(10);
		}
		for (int i = 0; i < n; i++) {
		}
		return arr;
	}
	
	// Loại bỏ những phần tử trùng nhau
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> uniqueArr = new ArrayList<Integer>();
        for (Integer num : arr) {
            if (!uniqueArr.contains(num)) {
                uniqueArr.add(num);
            }
        }
        return uniqueArr;
    }
    
    // So sánh giá trị TB của n/2 phần tử đầu và cuối
    public static void compareMeans(int[] arr) {
        int n = arr.length;
        
        // Tính TB n/2 phần tử đầu
        int firstHalfSum = 0;
        for (int i = 0; i < n/2; i++) {
            firstHalfSum += arr[i];
        }
        int firstHalfAvg = firstHalfSum /(n/2);
        
        // Tính TB n/2 phần tử cuối
        int secondHalfSum = 0;
        for (int i = n/2; i < n; i++) {
            secondHalfSum += arr[i];
        }
        int secondHalfAvg = secondHalfSum /(n/2);
        
        // So sánh hai giá trị trung bình
        if (firstHalfAvg > secondHalfAvg) {
            System.out.println("Trung bình của n/2 phần tử đầu là lớn hơn.");
        } else if (firstHalfAvg < secondHalfAvg) {
            System.out.println("Trung bình của n/2 phần tử cuối là lớn hơn.");
        } else {
            System.out.println("Trung bình của n/2 phần tử đầu và cuối là bằng nhau.");
        }
        
    }
    
    // Tìm phần tử lớn thứ ba trong mảng
    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Mảng có ít hơn 3 phần tử");
        }
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }
        if (third == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Không tìm thấy số lớn thứ 3 trong mảng");
        }
        return third;
    }

}
