package view.stream.practice;


import static java.util.function.Function.identity;
import static utils.PrintUtils.printf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

<<<<<<< HEAD
=======
import bean.Apple;
import model.Datamodel;

public class Ex01StreamFilteringAndSlicing {
>>>>>>> 8288720 (update)

public class Ex01StreamFilteringAndSlicing {
	public static void main(String[] args) {
		/*
		 * Cho danh sách số nguyên --> List<Integer>, int[]
		 * 
<<<<<<< HEAD
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
=======
		 * 1. Liệt kê những phần tử trong danh sách (yêu cầu ko trùng nhau) 2. Liệt kê
		 * những phần tử chỉ xuất hiện 1 lần duy nhất trong danh sách
		 */
		// 1 1 2 1 1 2 2 1
		// k, v
		List<Integer> numbers = List.of(1, 2, 1, 7, 3, 3, 2, 2, 4);

		// distinct --> toList = toSet
		printf("1. Liệt kê những phần tử trong danh sách (yêu cầu kết quả ko trùng nhau)",
				numbers.stream().distinct().collect(toList()));

		// thuộc tính group by --> key
		// những phần tử cùng key --> đưa vào nhóm --> value --> List<Element>
		// Trả về Map<K, V>
		// 1 --> 1,1
		// 2 --> 2,2,2
		// 7 --> 7
		// 3 --> 3,3
		// 4 --> 4
>>>>>>> 8288720 (update)

		// Map<Integer, List<Integer>> map =
		// numbers.stream().collect(Collectors.groupingBy(n -> n));

<<<<<<< HEAD
		// Có 2 cách để chuyển lamda n -> n thành references function --> Ex01StreamFilteringAndSlicing::transform
		// 															  --> Ex01StreamFilteringAndSlicing.itself()
		//															  --> Function.identity() --> hàm có sẵn để thực hiện trả về chính nó
		
		
			
		// distinct: Những phần tử trùng nhau và lấy ra 1 cái, unique: Lấy ra phần tử duy nhất
=======
		// n -> n --> Ex01StreamFilteringAndSlicing::transform
		// --> Ex01StreamFilteringAndSlicing.itself()
		// --> Function.identity() --> available

		// distinct, unique
>>>>>>> 8288720 (update)

		// Trả về Map<K, V>
		// 1 --> 2
		// 2 --> 3
		// 7 --> 1
		// 3 --> 2
		// 4 --> 1
		Set<Integer> uniqueElements = numbers.stream() // Stream<Integer>
<<<<<<< HEAD
				.collect(Collectors.groupingBy(identity(), Collectors.counting())) // Map<Integer, Long>
=======
				.collect(groupingBy(identity(), Collectors.counting())) // Map<Integer, Long>
>>>>>>> 8288720 (update)
				.entrySet() // Set<Entry<Integer, Long>>
				.stream() // Stream<Entry<Integer, Long>>
				.filter(e -> e.getValue() == 1L) // Stream<Entry<Integer, Long>>
				.map(Entry::getKey) // Stream<Integer>
				.collect(Collectors.toSet()); // Set<Integer>

		printf("2. Liệt kê những phần tử chỉ xuất hiện 1 lần duy nhất trong danh sách", uniqueElements);

	// Câu 3: Liệt kê quả táo xuất hiện đầu tiên trong nhà kho

		/*
		// Với cách này thì phải overide lại hàm hash và hàm equal
		 * List<Apple> distinctListByCountry = Datamodel.getApples().stream()
		 * 										.distinct() 
		 * 										.collect(Collectors.toList());
		 * printf("3. Liệt kê những phần tử đầu tiên với mỗi country trong danh sách",distinctListByCountry);
		 */
		
		//Cách Khác
		List<Apple> inventory = Datamodel.getApples();
		
		//Hàm dưới đã tạo 1 hàm xử lý với các giá trị truyền vào
//		Set<String> countries = new HashSet<>();
//		List<Apple> distinctByCountry =  inventory.stream()
//									.filter(apple -> countries.add(apple.getCountry()))
//									.collect(Collectors.toList());
		
		//Đoạn xử lý trên đã được tạo thành 1 hàm distncBy()
//		HashSet<Apple> distinctByCountry =  distincBy(inventory, (Apple apple) -> apple.getCountry(), HashSet::new);
		printf("3. Liệt kê những phần tử đầu tiên với mỗi country trong danh sách",distincBy(inventory, (Apple apple) -> apple.getCountry(), ArrayList::new));
	}
	
	public static <T,R,S extends Collection<T>>  Collection<T> distincBy(Collection<T> inventory,Function<T, R> func,Supplier<S> sup){
		Set<R> nonDupProps = new HashSet<>();
		Collection<T> distinctByProps =  inventory.stream()
									.filter(e -> nonDupProps.add(func.apply(e)))
									.collect(Collectors.toCollection(sup));
		return distinctByProps;
	}

	// [non]static method reference
	public static <T> T transform(T t) {
		return t;
	}

	public static <T> Function<T, T> itself() {
		return t -> t;
	}
}
