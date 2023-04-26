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
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Apple;

public class Ex06ConstructorReference {
	public static void main(String[] args) {
		// B1:
//		Supplier<Apple> sup = new Supplier<Apple>() {
//
//			@Override
//			public Apple get() {
//				return new Apple();
//			}
//		};

		// B2:
//		Supplier<Apple> sup = ()-> new Apple();

		// B3:
		Supplier<Apple> sup = Apple::new;

		Apple apple = sup.get();
		System.out.println("apple -> " + apple);

		
		
		
		// VÍ dụ:

		// map->set->list->sort->linkedhashmap

		Map<Integer, String> modelMap = new HashMap<>();
		modelMap.put(43, "Đà Nẵng");
		modelMap.put(92, "Quảng Nam");
		modelMap.put(75, "Huế");
		modelMap.put(74, "Quảng trị");
		modelMap.put(36, "Thanh Hoá");

		// Sử dụng sorted trong stream();
		Map<Integer, String> streamSortedMap = modelMap.entrySet() // SetEntry
				.stream().sorted(Comparator.comparing(Entry::getValue)) //StreamEntry<Integer, String>
				//đưa từng phần tử trong stream qua map(sortedMap)
				//toMap --> HashMap(default) -->expected LinkHashMap
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));
		
		System.out.println("stream sorte map" + streamSortedMap.getClass());
		modelMap.forEach((k, v) -> System.out.println(v + " <--> " + k));
		
		///////read file
		System.out.println("Data after read");
		readFile("src/data-apple.txt").forEach(System.out::println);
	}
	
	
	private static List<Apple> readFile(String path){
		List<String> lines = null;
		try {
			 lines = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Apple> convertedApples = new ArrayList<>();
		if(lines != null &!lines.isEmpty()) {
			for(String line: lines) {
				String[] tokens = line.split(", ");
				Apple convertedApple = new Apple(
						Integer.parseInt(tokens[0]),
						tokens[1],
						Double.parseDouble(tokens[2]),
						tokens[3]
						);
				convertedApples.add(convertedApple);
			}
		}
		return convertedApples;
	}
}
