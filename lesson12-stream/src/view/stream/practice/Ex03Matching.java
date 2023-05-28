package view.stream.practice;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import util.PrintUtils;

public class Ex03Matching {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 10, 15);
		
		// anyMatch(predicate) --> boolean
		
		boolean divisibleByTen = numbers.stream().anyMatch(nber -> nber %10 == 0);
		System.out.println("1. divisibleByTen --> " + divisibleByTen);
		
		// 2nd: find the first element that is divisible by 4
		Optional<Integer> optInt = numbers.stream().filter(nbr -> nbr % 4 == 0).findAny();
		optInt.ifPresent(v -> System.out.println("2. divisible by four --> " + v));
		
		Set<Integer> divByFive = numbers.stream().filter(nbe -> nbe %5 == 0).collect(Collectors.toSet()); 
		PrintUtils.print("3. divisible(s) by five ", divByFive);
		
		boolean allLessThan100 = numbers.stream().allMatch(nb -> nb < 100);
		System.out.println("\n4. all less than 100 --> " + allLessThan100);
		
		boolean noGreaterThanZero = numbers.stream().noneMatch(nb -> nb > 0);
		System.out.println("\n5. no greater than 0 --> " + noGreaterThanZero);
		
	}
}
