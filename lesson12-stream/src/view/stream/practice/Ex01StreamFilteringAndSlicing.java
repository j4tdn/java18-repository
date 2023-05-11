package view.stream.practice;


import static java.util.function.Function.identity;
import static utils.PrintUtils.printf;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Ex01StreamFilteringAndSlicing {
	public static void main(String[] args) {
		/*
		 * Cho danh sách số nguyên --> List<Integer>, int[]
		 * 
		 */
		List<Integer> numbers = List.of(1, 2, 1, 7, 3, 3, 2, 2, 4);

		// 1. Liệt kê những phần tử trong danh sách (yêu cầu ko trùng nhau)
		// distinct --> toList = toSet
		printf("1. Liệt kê những phần tử trong danh sách (yêu cầu kết quả ko trùng nhau)",
				numbers.stream().distinct().collect(Collectors.toList()));

		// 2. Liệt kê những phần tử chỉ xuất hiện 1 lần duy nhất trong danh sách
		/*
		 * thuộc tính group by --> key những phần tử cùng key --> đưa vào nhóm --> value
		 * --> List<Element> Trả về Map<K, V> 1 --> 1,1 2 --> 2,2,2 7 --> 7 3 --> 3,3 4
		 * --> 4
		 */

		// Map<Integer, List<Integer>> map =
		// numbers.stream().collect(Collectors.groupingBy(n -> n));

		// Có 2 cách để chuyển lamda n -> n thành references function --> Ex01StreamFilteringAndSlicing::transform
		// 															  --> Ex01StreamFilteringAndSlicing.itself()
		//															  --> Function.identity() --> hàm có sẵn để thực hiện trả về chính nó
		
		
			
		// distinct: Những phần tử trùng nhau và lấy ra 1 cái, unique: Lấy ra phần tử duy nhất

		// Trả về Map<K, V>
		// 1 --> 2
		// 2 --> 3
		// 7 --> 1
		// 3 --> 2
		// 4 --> 1
		Set<Integer> uniqueElements = numbers.stream() // Stream<Integer>
				.collect(Collectors.groupingBy(identity(), Collectors.counting())) // Map<Integer, Long>
				.entrySet() // Set<Entry<Integer, Long>>
				.stream() // Stream<Entry<Integer, Long>>
				.filter(e -> e.getValue() == 1L) // Stream<Entry<Integer, Long>>
				.map(Entry::getKey) // Stream<Integer>
				.collect(Collectors.toSet()); // Set<Integer>

		printf("2. Liệt kê những phần tử chỉ xuất hiện 1 lần duy nhất trong danh sách", uniqueElements);
	}

	// [non]static method reference
	public static <T> T transform(T t) {
		return t;
	}

	public static <T> Function<T, T> itself() {
		return t -> t;
	}
}
