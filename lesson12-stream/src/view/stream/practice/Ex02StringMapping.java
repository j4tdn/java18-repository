package view.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex02StringMapping {
	public static void main(String[] args) {
		String fullname = "Le Van Teo";
		//yêu cầu : Lấy kí tự đầu tiền của một từ và nối lại --> LVT
		String [] word =fullname.split("\\s");
		//Collection(List,Set) --> Stream --> .stream
		//Array -->Stream --> Array.Stream
		String defAvt = Arrays.stream(word)//Stream<string>
		.map(w->String.valueOf(w.charAt(0))).
		collect(Collectors.joining());
		System.out.println(fullname+" --> "+defAvt);
		//thực hành bới flatMap
		List<List<String>> players = List.of(List.of("2 rô","3 chuồn"),
				List.of("7 cơ","8 bích"),List.of("2 cơ","9 bích"));
		//yêu cầu: tìm những quân bài là 2 còn lại trong người chơi
		PrintUtils.print("Yêu cầu: tìm những quân bài là 2 còn lại trong người chơi", players.stream().flatMap(list->list.stream()).filter(card -> card.startsWith("2"))
				.collect(Collectors.toList()));
		
		
	}

}
