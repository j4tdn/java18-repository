package view.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex02StreamMapping {
	public static void main(String[] args) {
		String fullname = "Vo Thi Tuong Vy";
		// Yeu cau: lay ki tu dau tien cua moi tu va noi lai --> VTTV
		
		String[] words = fullname.split("\\s");
		
		//Collection(List, Set) --> Stream --> .stream()
		//Array --> stream -->Arrays.sream(...)
		String defAvt = Arrays.stream(words)
				.map(w -> String.valueOf(w.charAt(0))) //
				.collect(Collectors.joining());
		System.out.println(fullname + " ---> " + defAvt);
		
		// IntStream, DoubleStream Long Stream 
		
		// thuc hanh voi flatMap
		
		List<List<String>> players = List.of(
				List.of("2 rô", "3 chuồn"),
				List.of("2 cơ", "8 bích"),
				List.of("5 cơ", "9 bích"));
		
		
		PrintUtils.print("Yeu cau: tim nhung quan bai la 2 con lai trong nguoi choi", 
				players.stream()
				.flatMap(List -> List.stream())
				.filter(card -> card.startsWith("2"))
				.collect(Collectors.toList()));

	}

}
