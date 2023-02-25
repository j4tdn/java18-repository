package view;

import java.util.Arrays;

/**
 * ADD >> METHOD 1
 * B1: Copy elements qua mảng mới --> dùng for 
 * (Nếu dùng hàm copyOfRange --> sẽ đổi size của origin array)
 * B2: Duyệt từ length-1 -> insertedIndex+1
 *     output[i] = output[i-1]
 * B3: assign new value for insertedIndex
 *     output[insertedIndex] = insertedValue
 * ------------------------
 * REMOVE >> METHOD 1
 * B1: Clone "input" -> "output"
 * B2: Loop [k, output.length-1)
 *     result[i] = result[i+1]
 * B3: Copy to new array [0, length-1)
 */

public class Ex02ManipulationMethod1 {
	public static void main(String[] args) {
		String[] sequences = {"x", "a", "z", "b", "t"};
		
		String[] newAddedArray = add(sequences, 0, "v");
		System.out.println("After inserting (M1) --> " + Arrays.toString(newAddedArray));
		
		String[] newRemovedArray = remove(sequences, 1);
		System.out.println("After removing (M1) --> " + Arrays.toString(newRemovedArray));
		
	}
	
	// Thêm một phần tử String có giá trị bất kỳ vào vị trí k[0, length) trong mảng sequences
	// Sau khi add --> ko làm thay đổi origin array 
	// --> cần tạo new array --> viết hàm add() trả về String[]
	// insertedIndex = 2 
	private static String[] add(String[] input, int insertedIndex, String insertedValue) {
		String[] output = new String[input.length + 1];

		for (int i = 0; i < input.length; i++) {
			output[i] = input[i];
		}

		for (int i = output.length - 1; i > insertedIndex; i--) {
			output[i] = output[i - 1];
		}

		output[insertedIndex] = insertedValue;
		
		return output;
	}
	
	private static String[] remove(String[] input, int removedIndex) {
		String[] output = Arrays.copyOfRange(input, 0, input.length);

		for (int i = removedIndex; i < output.length - 1; i++) {
			output[i] = output[i + 1];
		}

		return Arrays.copyOfRange(output, 0, output.length - 1);
	}
}