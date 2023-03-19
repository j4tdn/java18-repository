package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex05ListAddRemoveRetainAll {
	public static void main(String[] args) {
		List<Integer> number1s = new ArrayList<>(List.of(1,2,3,4,5));
		List<Integer> number2s = new ArrayList<>(List.of(5,6,7,8,9));
		
		List<Integer> addAllNumbers = new ArrayList<>(number1s);
		addAllNumbers.addAll(number2s);
		System.out.println("after add all ===================");
		addAllNumbers.forEach(number->System.out.print(number + " "));
		System.out.println("\n");
		
		addAllNumbers.removeAll(number2s);
		System.out.println("after remove all ===================");
		addAllNumbers.forEach(number->System.out.print(number + " "));
		System.out.println("\n");
		
		addAllNumbers.retainAll(List.of(2,3));
		System.out.println("after retain all ===================");
		addAllNumbers.forEach(number->System.out.print(number + " "));
		System.out.println("\n");
		
	}
}
