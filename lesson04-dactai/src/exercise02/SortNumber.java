package exercise02;

public class SortNumber {
	public static void main(String[] args) {
		int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int firstIndex = 0;
		int lastIndex = numbers.length-1;
		
		for(int i = 0; i < numbers.length; i++) {
			if((numbers[i] % 7 == 0) && !(numbers[i] % 5 == 0)) {
				if(i == 0) {
					firstIndex++;
					continue;
				}
				swap(numbers, i, firstIndex);
				firstIndex++;
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(i==lastIndex) {
				break;
			}
			
			if(!(numbers[i] % 7 == 0) && (numbers[i] % 5 == 0)) {

				swap(numbers, i, lastIndex);
				lastIndex--;
			}
		}
		
		System.out.println("\n");
		for(int num: numbers) {
			System.out.print(num + " ");
		}
		
	}
	
	public static void swap(int[] numbers, int index1, int index2) {
		int temp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = temp;
	}
}
