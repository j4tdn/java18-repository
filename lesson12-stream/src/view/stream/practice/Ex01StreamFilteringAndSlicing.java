package view.stream.practice;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
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

public class Ex01StreamFilteringAndSlicing {

	public static void main(String[] args) {
		/*
		 * Cho danh sách số nguyên --> List<Integer>, int[]
		 * 
		 * 1. Liệt kê những phần tử trong danh sách (yêu cầu ko trùng nhau) 2. Liệt kê
		 * những phần tử chỉ xuất hiện 1 lần duy nhất trong danh sách
		 */
		// 1 1 2 1 1 2 2 1
		// k, v
		List<Integer> numbers = List.of(1, 2, 1, 7, 3, 3, 2, 2, 4);

		// distinct --> toList = toSet
		print("1. Liệt kê những phần tử trong danh sách (yêu cầu kết quả ko trùng nhau)",
				numbers.stream().distinct().collect(toList()));

		// thuộc tính group by --> key
		// những phần tử cùng key --> đưa vào nhóm --> value --> List<Element>
		// Trả về Map<K, V>
		// 1 --> 1,1
		// 2 --> 2,2,2
		// 7 --> 7
		// 3 --> 3,3
		// 4 --> 4

		// Map<Integer, List<Integer>> map =
		// numbers.stream().collect(Collectors.groupingBy(n -> n));

		// n -> n --> Ex01StreamFilteringAndSlicing::transform
		// --> Ex01StreamFilteringAndSlicing.itself()
		// --> Function.identity() --> available

		// distinct(trùng nhau lấy 1), unique(di nhất là lấy ra)

		// Trả về Map<K, V>
		// 1 --> 2
		// 2 --> 3
		// 7 --> 1
		// 3 --> 2
		// 4 --> 1
		Set<Integer> uniqueElements = numbers.stream() // Stream<Integer>
				.collect(groupingBy(identity(), Collectors.counting())) // Map<Integer, Long>
				// map không chuyển qua stream được
				.entrySet() // Set<Entry<Integer, Long>>
				.stream() // Stream<Entry<Integer, Long>>
				.filter(e -> e.getValue() == 1L) // Stream<Entry<Integer, Long>>
				.map(Entry::getKey) // Stream<Integer>
				.collect(Collectors.toSet()); // Set<Integer>

		print("2. Liệt kê những phần tử chỉ xuất hiện 1 lần duy nhất trong danh sách", uniqueElements);
		Collection<Apple> inventory = distinctBy(DataModel.getApples(), e->e.getCountry(), ArrayList::new);
		print("3.Liệt kê quả táo xuất hiện đầu tiên cho mỗi quốc gia trong nhà kho ",inventory);
		//Liệt kê những quả táo (có quốc gia  chỉ chứa 1 quả táo duy nhất)
		print("4.Thao tác với skip và limit :",List.of(3,2,7,8,5,7,2,9,8,7).stream()
				.skip(5).limit(3).collect(Collectors.toList()));
	}

	// [non]static method reference
	public static <T> T transform(T t) {
		return t;
	}

	public static <T> Function<T, T> itself() {
		return t -> t;
	}
	public static <T,R, S extends Collection<T>>Collection<T> distinctBy(Collection<T>  col,Function<T, R> func,Supplier<S> sup){
		Set<R> nonDupProps = new HashSet<>();
		return col.stream().filter(e->nonDupProps.add(func.apply(e))).
				collect(Collectors.toCollection(sup));
	}
}
