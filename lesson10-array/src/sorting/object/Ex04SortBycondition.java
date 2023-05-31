package sorting.object;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.function.Function;

public class Ex04SortBycondition {
	public static void main(String[] args) {
		String[] sequences = {"4", "-2", "a", "z", "c", "10", "t"};
		
		//String#value
		
		Arrays.sort(sequences);
		System.out.println("Sequences asc: " + Arrays.toString(sequences));
		
		
		Arrays.sort(sequences, comparing(Function.identity()));
		System.out.println("Sequences asc: " + Arrays.toString(sequences));
	}

}
