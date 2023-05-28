package view.stream.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex02StreamMapping {
	public static void main(String[] args) {
		String fullname = "Le Van Teo";
		
		// Yêu cầu lấy ký tự đầu tiên của mỗi từ và nối lại --> LVT
		String[] words = fullname.split("\\s");
		
		// Collection(List, Set) --> Stream --> .stream()
		// Array --> Stream --> Arrays.stream(..)
		
		String defAvt = Arrays.stream(words) // Stream<String>
			.map(w -> String.valueOf(w.charAt(0))) // Stream<String>
		    .collect(Collectors.joining());
		System.out.println(fullname + " --> " + defAvt);
		
		String defLinkedAvt = Pattern.compile("\\s")
				.splitAsStream(fullname)
				.map(w -> String.valueOf(w.charAt(0)))
			    .collect(Collectors.joining("-"));
		System.out.println(fullname + " --> " + defLinkedAvt);
			
		// Thực hành với flatMap
		List<List<String>> players = List.of(
				List.of("2 rô", "3 chuồn"),
				List.of("7 rô", "8 bích"),
				List.of("5 cơ", "9 bích")
				);
		// Yêu cầu: Tìm những quân bài là 2 còn lại trong người chơi
		PrintUtils.print(
				"Yêu cầu: Tìm những quân bài là 2 còn lại trong người chơi", 
				players.stream() // Stream<List<String>>
				 	.flatMap(Collection::stream) // Stream<String>
				 	.filter(card -> card.startsWith("2")) // Stream<String>
				 	.collect(Collectors.toList()));
	}
}
