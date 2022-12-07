package array;

import java.util.Arrays;

public class Ex03FilterString {

	public static void main(String[] args) {
		String[] students = { "Tay", "Kiet", "Huy", "Hanh", "Ha" };
		System.out.println(Arrays.toString(startWithH(students)));
	}

	private static String[] startWithH(String[] students) {
		String[] result = new String[students.length];
		int count = 0;
		for (String student : students) {
//				if (student.charAt(0) == 'H') {
			if (student.startsWith("H")) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
