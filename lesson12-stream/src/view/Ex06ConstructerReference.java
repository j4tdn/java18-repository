package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;

public class Ex06ConstructerReference {
	/*
	 * lambda: () - > new T() --> T::new
	 */
	public static void main(String[] args) {
		Supplier<Apple> sup = Apple::new;
		Apple apple = sup.get();
		System.out.println("apple--> "+apple);
		
		//ví dụ:mapppin lưu trữ danh scash biển số xe ở VN
		//Sắp xếp chúng theo tên tính thành tăng dần
		
		//map --> set --> list --> sort --> linkedhashmap
		Map<Integer, String> modelMap = new HashMap<>();
		modelMap.put(76,"Quảng Ngãi");
		modelMap.put(92,"Quảng nam");
		modelMap.put(43,"Đà Nẵng");
	
		modelMap.put(75,"Thừa Thiên Huế");
		modelMap.put(74,"Quảng Trị");
		modelMap.forEach((k,v)->System.out.println(k+"<-->"+v));  
		Map<Integer,String> streamSortedMap = modelMap.entrySet()
				.stream()
				.collect(Collectors.toMap(Entry::getKey,
						Entry::getValue,
						(v1,v2)->v2,
						LinkedHashMap::new));
		System.out.println("sortedMap :");
		streamSortedMap.forEach((k,v)-> System.out.println(k+":"+v));
		
		///////////////////////////
		List<Apple> convertedApples = readFile("data-apple.txt",", ");
		System.out.println("==__>> converted apple <<__==");
		convertedApples.forEach(System.out::println);
	}
	//type inference    
	private static List<Apple> readFile(String path,String delemeter){
		List<String> lines  = null;
		List<Apple> convertedApples = new ArrayList<>();
		try {
			 lines =Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(lines != null && !lines.isEmpty()) {
			//convert lines(List<String>)--List<Apple>
		}
		for(String line : lines) {
			String[] tokens = line.split(delemeter);
			Apple convertedApple  = new Apple(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]), tokens[3]);
			convertedApples.add(convertedApple);
		}
		return convertedApples;
	}
}
