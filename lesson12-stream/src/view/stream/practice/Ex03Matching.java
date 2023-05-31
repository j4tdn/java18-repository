package view.stream.practice;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex03Matching {
	public static void main(String[] args) {
		// Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
		List<Integer> numbers = List.of(1, 2, 8, 3, 4, 5, 6, 50);
		
		// Optional<T> --> JAVA 08
		
		// anyMatch(predicate) --> boolean
		// findFirst() --> T
		
		// 1st: is there any element that is divisible by 10
		boolean divisibleByTen = numbers.stream().anyMatch(nbr -> nbr % 10 == 0);
		System.out.println("1. divisible by ten --> " + divisibleByTen);
		
		// 2nd: find the first element that is divisible by 4
		Optional<Integer> optInt = numbers.stream().filter(nbr -> nbr % 4 == 0).findFirst();
		if (optInt.isPresent()) {
			Integer v = optInt.get();
			System.out.println("\n2. divisible by four --> " + v);
		}
		optInt.ifPresent(v -> System.out.println("2. divisible by four --> " + v));
		
		// 3rd: find the elements that is divisible by 5 in the list
		Set<Integer> divsByFive = numbers.stream().filter(nbr -> nbr % 5 == 0).collect(Collectors.toSet());
		PrintUtils.print("3. divisible(s) by five", divsByFive);
		
		// 4th: does all elements less than 100
		boolean allLessThan100 = numbers.stream().allMatch(nbr -> nbr < 100);
		System.out.println("\n4. all less than 100 --> " + allLessThan100);
		
		// 5th: does no elements greater than 0
		boolean noGreaterThanZero = numbers.stream().noneMatch(nbr -> nbr > 0);
		System.out.println("\n5. n greater than 0 --> " + noGreaterThanZero);
	}
}
