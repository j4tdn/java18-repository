package exam;

import java.util.Arrays;
import java.util.Scanner;

public class ExamBT04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
		
		int n = arr.length();
		findPermutations(arr, 0, n-1);
    }
    
    public static void findPermutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                findPermutations(str, left+1, right);
            }
        }
    }
    
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
