package exercise02;

public class ArrayOfNumberDemo {
	public static void main(String[] args) {
		int[] arr = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		Integer[] arr5 = new Integer[numberOfDivisor(arr, 5)];
		Integer[] arr7 = new Integer[numberOfDivisor(arr, 7)];
		Integer[] arrOthers = new Integer[arr.length];
		Integer[] arrFinal = new Integer[arr.length];
		
		//Chia hết cho 5
		int ct = 0;
		for (Integer item: arr) {
			if (isDivisorOf(item, 5) && !isDivisorOf(item, 7)){
				arr5[ct] = item;
				ct++;
			}
		}
		
		ct = 0;
		for (Integer item: arr) {
			if (isDivisorOf(item, 7) && !isDivisorOf(item, 5)){
				arr7[ct] = item;
				ct++;
			}
		}		
		ct = 0;
		for (Integer item: arr) {
			if (item != null && !isInArr(item, arr7) && !isInArr(item, arr5)) {
				arrOthers[ct] = item;
				ct++;
			}
		}
		ct = 0;
		//add to final array
		for (Integer item: arr7) {
			if (item != null) {
				arrFinal[ct] = item;
				ct++;
			}
		}
		for (Integer item: arrOthers) {
			if (item != null) {
				arrFinal[ct] = item;
				ct++;
			}
		}
		

		for (Integer item: arr5) {
			if (item != null) {
				arrFinal[ct] = item;
				ct++;
			}
		}
		
		
		for (Integer item: arrFinal) {
			System.out.print(item + " ");
		}	
	}
	
	public static boolean isInArr(Integer item, Integer[] arr) {
		
		for (Integer index: arr) {
			if (item == index) {
				return true;
			}
		}
		
		return false;
	}
	
	public static int numberOfDivisor(int[] arr, int d) {
		int count = 0;
		for (int item: arr) {
			if (isDivisorOf(item, d)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isDivisorOf(int in, int d) {
		if (in%d == 0) {
			return true;
		}
		return false;
	}
}
