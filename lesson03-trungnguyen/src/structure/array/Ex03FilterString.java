package structure.array;

import java.util.Arrays;

/**
 * Tìm tên bắt đầu bằng chữ "P"
 */

public class Ex03FilterString {
	public static void main(String[] args) {
		String[] students = { "Peter Croud", "Kaka", "Valdes", "Patric Veira" };
		System.out.println(Arrays.toString(getStudents(students)));

	}

	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for (String element : elements) {
			if (element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		// Copy sang mảng mới từ result [0,count) với count = 2
		// Lấy từ 0 đến < count => [0] và [1]
		return Arrays.copyOfRange(result, 0, count);
	}

}
