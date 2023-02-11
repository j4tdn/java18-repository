package view;

public class Ex07 {
	public static void main(String[] args) {
		String sample = "aaabaaabbaaaaa";
		String[] arr = sample.split("");
		int count = 1, min = 1, max = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i].equals(arr[i-1])) {
				count++;
			} else {
				max = (count >= max) ? count : max;
				min = (count <= min) ? count : min;
				count = 1;
			}
			
		}
		max = (count >= max) ? count : max;
		min = (count <= min) ? count : min;
		
		System.out.println("Max length: " + max);
		System.out.println("min length: " + min);
	}

}
