package view.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import util.PrintUtils;

public class Ex02StreamMapping {
	public static void main(String[] args) {
		String fullName = "Le Van Teo";
		
		// Yêu cầu: Lấy kí tự đầu tiên của mỗi từ và nối lại --> LVT
		
		String[] words = fullName.split("\\s");
		
		// Collection(List, Set) --> Stream --> .stream
		// Array --> Stream --> Arrays.stream(...)
		
		String defAvt = Arrays.stream(words).map(w -> String.valueOf(w.charAt(0)))
						.collect(Collectors.joining());
		System.out.println(fullName + " --> " + defAvt);
		
		// Thực hành với flatMap
		List<List<String>> player = List.of(
				List.of("2 rô", "3 chuồn"),
				List.of("7 cơ", "8 bích"),
				List.of("5 cơ", "2 bích")
				);
		
		// Yêu cầu: Tìm những quân bài là 2 còn lại trong người chơi
		PrintUtils.print("Yêu cầu: Tìm những quân bài là 2 còn lại trong người chơi", player.stream()
			.flatMap(list -> list.stream()) // Stream<String>
			.filter(card -> card.startsWith("2")) // Stream<String>
			.collect(Collectors.toList()));
		
	}
}
