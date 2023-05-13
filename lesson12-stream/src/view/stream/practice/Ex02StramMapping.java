package view.stream.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex02StramMapping {
	public static void main(String[] args) {
		String fullname = "Le Van Teo";
		
		// Yêu cầu: Lấy kí tự đầu tiên của mỗi từ và nối lại --> LVT
		// Collection(List, Set) --> Stream ---> .stream()
		// Array --> Stream --> Arrays.stream(...)
		
		String[] words = fullname.split("\\s");
		String defAvt = Arrays.stream(words) // Stream<String>
				.map(w -> String.valueOf(w.charAt(0))) // Stream<String>
				.collect(Collectors.joining());
		System.out.println(fullname + " --> " + defAvt);
		
		String defLinkedAvt = Pattern.compile("\\s")
			.splitAsStream(fullname)
			.map(w -> String.valueOf(w.charAt(0)))
			.collect(Collectors.joining("----"));
		System.out.println(fullname + " --> " + defLinkedAvt);
		
		// IntStream, DoubleStream, LongStream
		
		// Thực hành với flatMap
		List<List<String>> players = List.of(
					List.of("2 rô", "3 chuồn"),
					List.of("7 cơ", "8 bích"),
					List.of("5 cơ", "2 bích")
				);
		
		PrintUtils.printf(
				"Yêu cầu: Tìm những quân bài là 2 còn lại trong người chơi",
				players.stream() // Stream<List<String>>
					.flatMap(Collection::stream) // Stream<String> list -> list.stream()
					.filter(card -> card.startsWith("2")) // Stream<String>
					.collect(Collectors.toList()));
	}	
}