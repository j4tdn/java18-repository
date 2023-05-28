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
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;
import funtional.PentaFunction;

public class Ex06ConstructorReference {
	public static void main(String[] args) {
		/*
		 * lambda: ()     -> new T()     --> T::new
		 * 		 : (arg)  -> new T(arg)  --> T::new
		 */
		Supplier<Apple> sup = Apple::new;
		Apple apple = sup.get();
		System.out.println("apple --> " + apple);
		
		// Ví dụ: mapping lưu trữ danh số biển số xe việt nam
		// sắp xếp chúng theo tên tỉnh thành tăng dần
		
		
		// map --> set --> list --> sort --> linkedhashmap
		Map<Integer, String> modelMap = new HashMap<>();
		modelMap.put(92, "Quảng Nam");
		modelMap.put(43, "Đà Nẵng");
		modelMap.put(75, "Thừa Thiên Huế");
		modelMap.put(74, "Quảng Trị");
		
		//modelMap.forEach((k,v) -> System.out.println(k + " <--> " + v));
		
		// sử dụng sorted trong kiểu dử liệu stream(chưa học)
		// Strim(T) --> hổ trợ thêm nhiều hàm
		
		Map<Integer, String> streamSortedMap = modelMap.entrySet() // Set<Entry<Integer, String>>
				.stream() // // Stream<Entry<Integer, String>>
				.sorted(Comparator.comparing(Entry::getValue)) // Stream<Entry<Integer, String>>
				.collect(Collectors.toMap(
								Entry::getKey, 
								Entry::getValue, 
								(v1, v2) -> v2, 
								LinkedHashMap::new));
		
		// đưa từng phần tử trong stream qua map(sortedmap)
		// toMap --> hashmap(default) --> expected LinkedHashMap
		
		System.out.println("streamSortedMap instance -> " + streamSortedMap.getClass());
		streamSortedMap.forEach((k,v) -> System.out.println(k + " <--> " + v));

		///////////////////////////////////////////////////
		System.out.println("==__>> converted <<__==");
		readFile("data-apple.txt", Apple::new).forEach(System.out::println);
		
		// type inference
		Supplier<Apple> s1 = Apple::new;
		Function<String, Apple> f1 = Apple::new;
		PentaFunction<Integer, String, Double, String, Apple> p1 = Apple::new;
		
		
	}
	/// lambda --> constructor --> object
	//  --> static method conference
	//  --> constructor reference
	
	// FunctionalInterface: T strategy(String s) -> Function

	private static <R> List<R> readFile(String path, Function<String, R> function) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("data-apple"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<R> result = new ArrayList<>();
		if (lines != null && !lines.isEmpty()) {
			// convert lines(List<String> --> List<Apple>
			for (String line : lines) {
				R converted = function.apply(line);
				result.add(converted);
			}
		}
		return result;
	}
}

