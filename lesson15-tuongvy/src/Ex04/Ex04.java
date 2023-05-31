package Ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		String s = "aaabscgjdhscnsj";
		List<String> strings = Arrays.asList(s.split(""));
		
		System.out.println(findStrings(strings).stream().filter(item -> item.length() == 1)
		        .collect(Collectors.joining(",")));
	}
	
	private static List<String> findStrings(List<String> input){
		List<String> result = new ArrayList<>();
		
		Map<String, Long> count = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Long maxCount = count.entrySet().stream().map(Map.Entry::getValue).max(Comparator.naturalOrder()).orElse(null);
		
		result = count.entrySet().stream().filter(entry -> entry.getValue() == maxCount).map(Map.Entry::getKey).collect(Collectors.toList());
		
		return result;
	}

}
