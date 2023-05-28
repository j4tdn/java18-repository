package Ex01;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex03Matching {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6);
		boolean divisibleByTen = numbers.stream().anyMatch(a -> a%10==0) ;
		System.out.println("1. divisible by ten --> " + divisibleByTen);
		Optional<Integer> optInt = numbers.stream().filter(nbr -> nbr % 4 ==0).findFirst();
		if(optInt.isPresent()) {
			System.out.println("2. divisible by four --> " + optInt.get());
		}
		List<Integer> divsByFive = numbers.stream().filter(n -> n%5 ==0).collect(Collectors.toList());
		PrintUtils.Print("3. divisible by five", divsByFive);
		boolean allLessThan100 = numbers.stream().allMatch(a -> a<100);
		System.out.println("4. " + allLessThan100);
		
	}
}
