package exam;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int[] num = {8, 5, 9, 20};
		int[] numLevel = new int[num.length];
		
		for(int i = 0; i < numLevel.length ; i++) {
			numLevel[i] = level(num[i]);
		}
		
		for (int i = 0 ; i < num.length - 1; i++) {
	            for (int j = i + 1; j < num.length; j++) {
	                if (numLevel[i] > numLevel[j]) {
	                    int temp2 = numLevel[j];
	                    numLevel[j] = numLevel[i];
	                    numLevel[i] = temp2;
	                    
	                    int temp = num[j];
	                    num[j] = num[i];
	                    num[i] = temp;
	                }
	            }
	        }
        System.out.print("Kết quả sau khi đã sắp xếp: ");
        for(int i = 0; i < num.length ; i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	private static int level(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		return count;
	}
}
