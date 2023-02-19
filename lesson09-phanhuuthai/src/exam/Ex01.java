package exam;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] n1 = {2, 8, 9, 1, 6};
		int[] n2 = {2, 1, 1, 8, 9};
		int[] num = new int[n1.length];
		int count = 0;
		
		for(int i = 0; i < n1.length; i++) {
			for(int j = 0; j < n2.length; j++) {
				if(n1[i] == n2[j]) {
					num[count] = n1[i];
					count++;
				}
			}
		}
		int[] result = Arrays.copyOfRange(num, 0, count);
		
		int a = result.length;
		for(int i = 1; i < result.length; i++) {
			if(result[i-1] == result[i]) {
				result[i] = result[a-1];
				result[a-1] = 0;
				a--;
			}
		}
		
		int[] result2 = Arrays.copyOfRange(result, 0, a);
		
		int temp = result2[0];
        for (int i = 0 ; i < result2.length - 1; i++) {
            for (int j = i + 1; j < result2.length; j++) {
                if (result2[i] > result2[j]) {
                    temp = result2[j];
                    result2[j] = result2[i];
                    result2[i] = temp;
                }
            }
        }
        
        
        
		System.out.print("các phần tử trùng nhau là: ");
		for(int i = 0; i< result2.length; i++) {
			System.out.print(result2[i] + " ");
		}
	}
	
	
}
