package structure;

import java.util.Arrays;

public class Ex03FilterString {

	public static void main(String[] args) {
		String[] students = {"Peter", "Varane", "Patrick"};
		String[] result = getStudents(students);
		System.out.println(Arrays.toString(result));

	}
	
	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for(String element:elements) {
			if(element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}
