package ex02sortnumber;

public class SortNumber {
	public static void main(String[] args) {
		int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		for(int a : sortNumber(numbers)) {
			System.out.print(a + " ");
		}
	}
	
	public static int[] sortNumber(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(number % 5 == 0 && number % 7 !=0) {
				result[count] = number;
				count++;
			}
		}
		
		for(int number : numbers) {
			if((number % 5 == 0 && number % 7 == 0) || (number % 5 !=0 && number % 7 != 0)) {
				result[count] = number;
				count++;
			}
		}
		
		for(int number : numbers) {
			if(number % 7 == 0 && number % 5 != 0) {
				result[count] = number;
				count++;
			}
		}
		return result;
	}
}
