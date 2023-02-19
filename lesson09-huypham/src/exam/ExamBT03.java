package exam;

import java.util.Scanner;

public class ExamBT03 {
	public static int countDivisors(int n) {
		int count = 0;
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap: ");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		
		int[] levels = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            levels[i] = countDivisors(Integer.parseInt(arr[i]));
        }
		
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (levels[i] > levels[j]) {
                    int temp = levels[i];
                    levels[i] = levels[j];
                    levels[j] = temp;

                    temp = Integer.parseInt(arr[i]);
                    arr[i] = arr[j];
                    arr[j] = Integer.toString(temp);
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
