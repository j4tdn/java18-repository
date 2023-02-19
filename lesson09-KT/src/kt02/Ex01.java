package kt02;

public class Ex01 {
	public static void main(String[] args) {
		int [] array1 = {2, 9, 8, 1 ,6};
		int [] array2 = {2, 1, 7, 8, 9};
		for (int i=0 ; i<array1.length; i++) {
			for(int j=0 ; j< array2.length; j++) {
				if(array1[i] == array2[j] ) {
					System.out.print(array1[i]+ " ");
				}
			}
		}
	}

}
