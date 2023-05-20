package views.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex02StreamMapping {
	public static void main(String[] args) {
		String fullName = "Le Van Teo";
		
		// Yêu cầu lấy kí tự đầu tiên của mỗi từ và nối lại
		
		String[] words = fullName.split("\\s");
		
		String defAvt = Arrays.stream(words)
								.map(w -> String.valueOf(w.charAt(0)))
								.collect(Collectors.joining());
		System.out.println(fullName + "-->" + defAvt);
		
		String defLinkedAvt = Pattern.compile("\\s").splitAsStream(fullName)
				.map(w -> String.valueOf(w.charAt(0)))
				.collect(Collectors.joining());
		System.out.println(fullName + "==>" + defLinkedAvt);
		
		List<List<String>> players = List.of(
				List.of("2 rô", "3 chuồn"),
				List.of("5 bích", "4 cơ"),
				List.of("2 cơ", "10 rô"),
				List.of("9 cơ", "3 rô")
				);
		
		PrintUtils.print("Tìm những quân bài là 2 còn lại trong người chơi", players.stream()
				.flatMap(list -> list.stream())
				.filter(card -> card.startsWith("2"))
				.collect(Collectors.toList()));
		
	}

}
