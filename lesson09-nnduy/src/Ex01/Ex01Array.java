package Ex01;

import java.util.ArrayList;

public class Ex01Array {
	public static void main(String[] args) {
		ArrayList objArray = new ArrayList();
		ArrayList objArray2 = new ArrayList();
		objArray2.add("2");
		objArray2.add("8");
		objArray2.add("9");
		objArray2.add("1");
		objArray2.add("6");
		objArray.add("2");
		objArray.add("1");
		objArray.add("1");
		objArray.add("8");
		objArray.add("9");
		System.out.println("Array elements of array1" + objArray);
		System.out.println("Array elements of array2" + objArray2);
		objArray.retainAll(objArray2);
		System.out.println("Array1 after retaining common elements of array2 & array1" + objArray);
	}
}
