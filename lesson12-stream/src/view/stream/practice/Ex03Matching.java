package view.stream.practice;

import utils.PrintUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex03Matching {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        // 1st : is there any element that is divisible by 10
        boolean divisibleByTen = numbers.stream().anyMatch(n -> n % 10 == 0);
        System.out.println();

        // 2nd : find the first element that is divisible by 4
        Optional<Integer> optInt = numbers.stream().filter(n -> n % 4 == 0).findFirst();
        if(optInt.isPresent()){
            Integer v = optInt.get();
            System.out.println("2. divisible by four --> " + v);
        }
        optInt.ifPresent(v -> System.out.println("2. divisible by four --> " + v));

        // 3rd : find the elements that divisible by 5 in the list
        List<Integer> divisibleByFive = numbers.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
        PrintUtils.Print("3rd --> ", divisibleByFive);

        // 4th : does all elements less than 100
        boolean isAllLessThanHundred = numbers.stream().allMatch(n -> n < 100);

        // 5th : does no element greater than 0
        boolean isAllGreaterThanZero = numbers.stream().allMatch(n -> n < 0);
    }
}
