package structure.array;

import java.util.Arrays;

public class Ex03FilterString {
	public static void main(String[] args) {
		String[] students = {"Kevin De Bruyne", "Lionel Messi", "Peter Cech", "Neymar Jr", "Pep Guardiola"};
		System.out.println(Arrays.toString(getStudents(students)));
	}
	
	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for(String element : elements) {
			if(element.startsWith("P")) {
				result[count++] = element;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
