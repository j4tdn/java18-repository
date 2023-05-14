package view.stream.practice;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex03Matching {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

		// anyMatch(preticate)-->boolean

		boolean divByTen = numbers.stream().anyMatch(nbr -> nbr % 10 == 0);
		System.out.println("1.div -> " + divByTen);

		// findFirst() --> T
		Optional<Integer> optInt = numbers.stream().filter(nbr -> nbr % 4 == 0).findFirst();
		if (optInt.isPresent()) {
			System.out.println("2. div by 4 -> " + optInt);
		}
		optInt.ifPresent(v -> System.out.println("2. div by 4 -> " + optInt));

		// 3rd: find element div by 5
		Set<Integer> divByFive = numbers.stream().filter(nbr -> nbr % 5 == 0).collect(Collectors.toSet());
		PrintUtils.printf("3. ", divByFive);

		// 4th: does all less 100?
		boolean allLessThan100 = numbers.stream().allMatch(nbr -> nbr % 5 < 0);
		System.out.println("4. " + allLessThan100);

		// 5th: does no element
		boolean noGreaterThanZero = numbers.stream().noneMatch(nbr -> nbr > 0);
		System.out.println("5. " + noGreaterThanZero);
	}
}
