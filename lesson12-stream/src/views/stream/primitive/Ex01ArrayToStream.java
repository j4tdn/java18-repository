package views.stream.primitive;

import java.util.Arrays;

public class Ex01ArrayToStream {
	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		
		int sum = Arrays.stream(numbers).sum();
		
	}

}
