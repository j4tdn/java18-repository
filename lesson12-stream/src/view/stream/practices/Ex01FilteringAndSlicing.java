package view.stream.practices;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static utils.PrintUtils.print;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;

/**
 * BTVN: Liệt kê những quả táo (có quốc giá chỉ chứa 1 quả táo duy nhất)
 *
 */

public class Ex01FilteringAndSlicing {
	public static void main(String[] args) {
		/*
		 * Cho danh sách số nguyên --> List<Integer>, int[]
		 * 1. Liệt kê những phần tử trong danh sách (yêu cầu kết quả không trùng nhau)
		 * 
		 */

		List<Integer> numbers = List.of(1, 2, 1, 7, 3, 3, 2, 4);
		// distinct --> toList 
		// = toSet
		print("1. Liệt kê những phần tử trong danh sách (yêu cầu kết quả không trùng nhau)", 
				numbers.stream()
				.distinct()
				.collect(toList()));
		
		// thuộc tính group by --> key
		// những phần tử cùng key --> đưa vào nhóm --> value --> List<Element>
		// groupBy xong trả về Map<K, V> => Map<Integer, List<Integer>>
		// 1 --> 1,1
		// 2 --> 2,2,2
		// 7 --> 7
		// 3 --> 3,3
		// 4 --> 4
		
		/*
		 * n -> n
		 --> C1: Ex01FilteringAndSlicing::transform
		 --> C2: Ex01FilteringAndSlicing.itself()
		 --> C3: Function.identity() --> available
		 */
		
		//Map<Integer, List<Integer>> map = numbers.stream()
		//		.collect(Collectors.groupingBy(n -> n));
		
		// Trả về Map <K, V> => Map<Integer, Long>
		// 1 --> 2
		// 2 --> 3
		// 7 --> 1
		// 3 --> 2
		// 4 --> 1
		Set<Integer> uniqueElements = numbers.stream() // Stream<Integer>
						.collect(groupingBy(identity(), counting())) // Map<Integer, Long>
						.entrySet() // Set<Entry<Integer, Long>>
						.stream() // Stream<Entry<Integer, Long>>
						.filter(e -> e.getKey() == 1) // Stream<Entry<Integer, Long>> 
						.map(Entry::getKey) // Stream<Integer>
						.collect(toSet()); // Set<Integer>
								
		print("2. Liệt kê những phần tử chỉ xuất hiện 1 lần duy nhất trong danh sách", uniqueElements);	
		
		print("3. Liệt kê các quả táo đại diện cho mỗi quốc gia", distinctBy(DataModel.getApples(), Apple::getCountry, ArrayList::new));
		
		// 5, 6 --> skip(a) limit (b-a)
		print("4. Thao tác với SKIP và LIMIT",
				List.of(3, 2, 7, 8, 5, 7, 2, 9, 8, 7).stream()
				.skip(5) // start_offset
				.limit(3) // row_count
				.collect(Collectors.toList())); // 7 2 9
	}
	
	public static <T, R, S extends Collection<T>> Collection<T> distinctBy(Collection<T> col, Function<T, R> fun, Supplier<S> sup) {
		Set<R> nonDupKeys = new HashSet<R>();
		 return col.stream()
		           .filter(e -> nonDupKeys.add(fun.apply(e)))
		           .collect(Collectors.toCollection(sup));
	}
	
	// C1: [non]static method reference
	public static <T> T transform(T t) {
		return t;
	}
	
	// C2: 
	public static <T> Function<T, T> itself() {
		return t -> t;
	}
}
