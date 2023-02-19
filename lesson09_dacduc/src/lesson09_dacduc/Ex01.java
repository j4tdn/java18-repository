package lesson09_dacduc;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] input1 = {2, 8, 9, 1, 6};
		int[] input2 = {2, 1, 1, 8, 9};
		int[] num = new int[input1.length];
		int count = 0;
		
		for(int i = 0; i < input1.length; i++) {
			for(int j = 0; j < input2.length; j++) {
				if(input1[i] == input2[j]) {
					num[count] = input1[i];
					count++;
				}
			}
		}
		int[] result = Arrays.copyOfRange(num, 0, count);
		int temp = result[0];
        for (int i = 0 ; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    temp = result[j];
                    result[j] = result[i];
                    result[i] = temp;
                }
            }
        }
        StringBuffer s = new StringBuffer();
        for(int i = 0; i< result.length; i++) {
			if(String.valueOf(s).contains(String.valueOf(result[i]))) {
				continue;
			}
			else {
				s.append(result[i]+" ");
			}
		}
        String[] resultDuplicate = String.valueOf(s).split(" ");
		System.out.print("các phần tử trùng nhau là: ");
		for(int i = 0; i< resultDuplicate.length; i++) {
			System.out.print(resultDuplicate[i] + " ");
		}
	}
	
	
}
