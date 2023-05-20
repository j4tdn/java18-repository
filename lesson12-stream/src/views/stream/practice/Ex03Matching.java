package views.stream.practice;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex03Matching {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6, 40);
		
//		1st: is there any element that is divisible by 10
		boolean divisibleByTen = numbers.stream()
										.anyMatch(nbr -> nbr % 10 == 0);
		System.out.println("1. divisibleByTen: " + divisibleByTen);
		
//		2nd: find the first element that is divisible by 4
		Optional<Integer> opInt = numbers.stream().filter(nbr -> nbr % 4 == 0).findFirst();
		if(opInt.isPresent()) {
			Integer v = opInt.get();
			System.out.println("2. divisible by 4" + v);
		}
		// hoặc
		opInt.ifPresent(v -> System.out.println("2. divisible by 4" + v));
		
//		3nd: find the element that is divisible by 5 in the list
		Set<Integer> divisileByFive = numbers.stream().filter(nbr -> nbr % 5 == 0)
														.collect(Collectors.toSet());
		PrintUtils.print("3. divisible by 5", divisileByFive);
		
		//4th: does all elements less than 100
		boolean allLessThan100 = numbers.stream().allMatch(nbr -> nbr < 100);
		System.out.println("" + allLessThan100);
		
		//4th: does no elements greater than 0
		boolean noGreaterThan0 = numbers.stream().allMatch(nbr -> nbr < 0);
		System.out.println("" + noGreaterThan0);
		
		
	}
	

}
