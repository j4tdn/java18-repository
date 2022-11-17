package structure.array;

import java.util.Arrays;
public class Ex03FileterString {
	public static void main(String[] args) {
		String[] students = {"tri", "trong", "trinh", "hai", "diem"};
		System.out.println(Arrays.toString(getStudents(students)));
	}

	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for(String element : elements) {
			if(element.startsWith("t")) {
				result[count++] = element;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
