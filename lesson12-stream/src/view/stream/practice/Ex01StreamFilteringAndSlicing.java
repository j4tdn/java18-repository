package view.stream.practice;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;

import static util.PrintUtils.*;

public class Ex01StreamFilteringAndSlicing {
	public static void main(String[] args) {
		/*
		  Cho danh sách số nguyên --> List<Integer>, int[]
		  1. Liệt kê những phần tử trong danh sách (yêu cầu ko trùng nhau)
		  2. Liệt kê những phần tử chỉ xuất hiện 1 lần trong list
		 */
		
		List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4);
	
		// distinct --> toList = toSet
		print("1. Liệt kê những phần tử trong danh sách (yêu cầu ko trùng nhau)", 
				numbers.stream()
						.distinct()
						.collect(Collectors.toList()));
		
		// 4, 7
		
		Set<Integer> uniqueElements = numbers.stream() // Stream<Integer>
				.collect(groupingBy(identity(), Collectors.counting())) // Map<Integer, Long>
				.entrySet() // Set<Entry<Integer, Long>>
				.stream()   // Stream<Entry<Integer, Long>>
				.filter(e -> e.getValue() == 1L) // Stream<Entry<Integer, Long>>
				.map(java.util.Map.Entry<Integer, Long>::getKey) // Stream<Integer>
				.collect(Collectors.toSet()); // Set<Integer>
										
				
		
		print("2. Liệt kê những phần tử chỉ xuất hiện 1 lần trong list", uniqueElements);
		
		// 3. 
		print("3. Liệt kê quả táo xuất hiện đầu tiên cho mỗi màu sắc trong nhà kho",
				distinctBy(DataModel.getApples(), Apple::getCountry, ArrayList::new));

		
		print("4. Thao tác với SKIP và LIMIT", 
				List.of(3,2,5,7,2,3,6,4).stream()
				.skip(5)
				.limit(3)
				.collect(Collectors.toList()));
		
				
	}
	public static <T, R, S extends Collection<T>> Collection<T> distinctBy(Collection<T> col, Function<T, R> func, Supplier<S> sup){
		Set<R>  nonDupProps = new HashSet<>();
		return col.stream()
				.filter(e -> nonDupProps.add(func.apply(e)))
				.collect(Collectors.toCollection(sup));
	}
	
	
	public static <T> T transform(T t) {
		return t;
	}
	
	public static <T> Function<T, T> itself() {
		return t -> t;
	}
	
}
