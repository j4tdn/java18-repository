package view;

import java.util.Arrays;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String[] sequences = {"x", "a", "z", "b", "t"};
		
		// Thêm 1 phần tử String có giá trị bất kì vào vị trí thứ k trong mảng sequences
		String[] add = add(sequences, 2, "dume");
		System.out.println(Arrays.toString(add));
		
		String[] del = del(sequences, 2);
		System.out.println(Arrays.toString(del));
		
		String[] sort = sort(sequences);
		System.out.println(Arrays.toString(sort));
		
	}
	
	private static String[] add(String[] input, int index, String value) {
		String[] output = new String[input.length + 1];
		for(int i = 0; i < input.length; i++) {
			output[i] = input[i];
		}
		for(int i = output.length - 1; i > index; i--) {
			output[i] = output[i-1];
		}
		output[index] = value;
		return output;
	}
	
	private static String[] del(String[] input, int index) {
		String[] output = new String[input.length - 1];
		for(int i = 0; i < input.length - 1; i++) {
			if(i < index) {
				output[i] = input[i];
			}
			else {
				output[i] = input[i+1];
			}
		}
		return output;
	}
	
	private static String[] sort(String[] input) {
		String[] output = new String[input.length];
		for(int i = 0; i < input.length; i++) {
			output[i] = input[i];
		}
		for(int i = 0; i < output.length; i++) {
			for(int j = i + 1; j < output.length; j++) {
				if(output[i].compareTo(output[j]) > 0) {
					String temp = output[i];
					output[i] = output[j];
					output[j] = temp;
				}
			}
		}
		return output;
	}
}
