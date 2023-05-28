package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		String input = "aaaccdcee";
		String regex = "^[a-zA-Z]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			String[] test = input.split("");
			Set<String> preResult = Arrays.stream(test).distinct().collect(Collectors.toSet());
			List<String> Result = Arrays.stream(test).collect(Collectors.toList());
			Map<String, Integer> output = new HashMap<>();
			for (String item : Result) {
				output.put(item, output.getOrDefault(item, 0) + 1);
			}
			Optional<Integer> max = output.values().stream().reduce(Integer::max);
			output.forEach((e,v)->{
				if(v==max.get()) {
					System.out.println(e);
				}
			});
		} else {
			System.out.println("Nhap sai!");
		}
	}
}