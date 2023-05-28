package HomeWorkDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
		int[] a = {1,2,1,3,3,2,4};
		List<Integer> li = Arrays.stream(a).boxed().collect(Collectors.toList()); 
		
	}
}
