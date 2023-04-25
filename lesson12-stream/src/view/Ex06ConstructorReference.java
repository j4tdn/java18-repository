package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;
import functional.PentaFunction;

public class Ex06ConstructorReference {
	public static void main(String[] args) {
		/*
		 * lambda: ()    -> new T()     --> T::new
		 *       : (arg) -> new T(arg)  --> T::new
		 * 
		 */
		Supplier<Apple> sup = Apple::new;
		Apple apple = sup.get();
		System.out.println("apple --> " + apple);
		
		// Ví dụ: mapping lưu trữ danh sách biển số xe ở vn
		// sắp xếp chúng theo tên tỉnh thành tăng dần
		
		// map --> set --> list --> sort --> linkedhashmap
		Map<Integer, String> modelMap = new HashMap<>();
		modelMap.put(76, "Quảng Ngãi");
		modelMap.put(92, "Quảng Nam");
		modelMap.put(43, "Đà Nẵng");
		modelMap.put(75, "Thừa Thiên Huế");
		modelMap.put(74, "Quảng Trị");
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		List<Entry<Integer, String>> sortedList = new ArrayList<>(modelMap.entrySet());
		sortedList.sort(Comparator.comparing(Entry::getValue));
		sortedList.forEach(entry -> {
			sortedMap.put(entry.getKey(), entry.getValue());
		});
		
		// sử dụng sorted trong kiểu dữ liệu stream(chưa học)
		// Stream<T> --> hỗ trợ thêm nhiều hàm
		
		Map<Integer, String> streamSortedMap = modelMap.entrySet() // Set<Entry<Integr, String>>
				.stream()  //  Stream<Entry<Integr, String>>
				.sorted(Comparator.comparing(Entry::getValue)) // Stream<Entry<Integr, String>>
				.collect(Collectors.toMap(
						Entry::getKey, 
						Entry::getValue,
						(v1, v2) -> v2,
						LinkedHashMap::new));
		// đưa từng phần tử trong stream qua map(sortedmap)
		// toMap --> hashmap(default) --> expected LinkedHashMap
		
		System.out.println("streamSortedMap instance -> " + streamSortedMap.getClass());
		streamSortedMap.forEach((k, v) -> System.out.println(v + " <--> " + k));
	
		//////////////////////////////////////
		System.out.println("==__ >> converted apples << __==");
		readFile("data-apple.txt", Apple::new).forEach(System.out::println);
		
		// type inference
		Supplier<Apple> s1 = Apple::new;
		Function<String, Apple> f1 = Apple::new;
		PentaFunction<Integer, String, Double, String, Apple> p1 = Apple::new;
	}
	
	// FunctionalInterface: T strategy(String s)
	
	private static <R> List<R> readFile(String path, Function<String, R> function) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<R> result = new ArrayList<>();
		if (lines != null && !lines.isEmpty()) {
			for (String line: lines) {
				R converted = function.apply(line);
				result.add(converted);
			}
		}
		return result;
	}
}
