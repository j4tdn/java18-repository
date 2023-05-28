package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

import bean.Apple;

public class Ex06ConstructorReference {
	public static void main(String[] args) {
		/*
		 * lamda: () -> new T() --> T::new
		 */
		Supplier<Apple> sup = Apple::new;

		Apple apple = sup.get();
		System.out.println("apple -->" + apple);

		// Ví dụ: mapping lưu trữ danh sách biến số xe ở VN
		// Sắp xếp theo tên tỉnh thành tăng dần

		// map --> set --> list -->sort --> linkdedhasmap
		Map<Integer, String> modelMap = new HashMap<>();
		modelMap.put(43, "Đà Nẵng");
		modelMap.put(92, "QUảng Nam");
		modelMap.put(76, "Quảng Ngãi");
		modelMap.put(44, "Quảng Trị");
		modelMap.put(75, "Thừa Thiên Huế");

		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		List<Entry<Integer, String>> sortedList = new ArrayList<>(modelMap.entrySet());
		sortedList.sort(Comparator.comparing(Entry::getValue));
		sortedList.forEach(entry -> {
			sortedMap.put(entry.getKey(), entry.getValue());
		});
		
		
		
		

		// Sử dụng sorted trong kiểm dữ liệu stream
		// Stream<T> --> Hỗ trợ thêm nhiều hàm
		Map<Integer, String> streamSortedMap = modelMap.entrySet() // Set<Entry<Integer, String>>
				.stream() // Stream<Entry<Integer, String>>
				.sorted(Comparator.comparing(Entry::getValue))
				// Đưa phần tử trong stream qua Map(sortdMap)
				// toMap -> hashmap(default) expected LinkedHashMap
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));

		modelMap.forEach((k, v) -> System.out.println(v + "<--->" + k));

		////////////////////////////

		System.out.println("==============>> convertd Apple <<===============");
		readFile("data-apple.txt",", ").forEach(System.out::println);

	}

	private static List<Apple> readFile(String path, String delimiter) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		List<Apple> convertedApples = new ArrayList<>();
		if (lines != null && !lines.isEmpty()) {
			// convert lines(List<String>) --> List<Apple>
			for (String line : lines) {
				String[] tokens = line.split(delimiter);
				Apple convertedApple = new Apple(
						Integer.parseInt(tokens[0]),
						tokens[1],
						Integer.parseInt(tokens[2]),
						tokens[3]);
				convertedApples.add(convertedApple);
			}
		}
		return convertedApples;
	}
}
