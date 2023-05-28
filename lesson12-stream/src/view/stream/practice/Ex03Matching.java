package view.stream.practice;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex03Matching {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6);
		//any match(predicate) --> boolean
		 
		//1st:is there any element that is devisible by 10
		boolean divisibleByTen = numbers.stream().anyMatch(nbr->nbr %10 ==0);
		System.out.println("1.devisibleByTen --> "+divisibleByTen);
		
		//2nd: find the first element that is divisible by 4
		Optional<Integer> opInt = numbers.stream().filter(nbr->nbr%4==0).findFirst();
		if(opInt!= null) {
			Integer v = opInt.get();
			System.out.println("find the first element that is divisible by 4 :"+v);
		}
		opInt.ifPresent(v->System.out.println("2.find the first element that is divisible by 4 :"+v));
		//3rd: find the elements that divisible by 5 in the list
		Set<Integer> divsByFive =numbers.stream().filter(nbr->nbr%5==0).collect(Collectors.toSet());
		PrintUtils.print("3. find the elements that divisible by 5 in the list", divsByFive);
		//4th: does all elements less than 100
		boolean allLessThan100 = numbers.stream().allMatch(nbr->nbr<100);
		System.out.println("4. does all elements less than 100 --> "+allLessThan100);
		
		//5th: does no elements greater than 0
		boolean noGreateThanZero = numbers.stream().noneMatch(nbr -> nbr >0);
		System.out.println("5. does no elements greater than 0 --> "+noGreateThanZero);
		
	
	
	
	}
}