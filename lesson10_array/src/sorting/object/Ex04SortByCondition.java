package sorting.object;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex04SortByCondition {
	public static void main(String[] args) {
		String[] sequences = {"4", "2", "-6", "-5", null, "xx", "a"};
		
		// sort sequences asc
		Arrays.sort(sequences);
		System.out.println("sequences asc: " + Arrays.toString(sequences));
		
		
		Arrays.sort(sequences, comparing(Function.identity(), reverseOrder()));
		System.out.println("sequences asc: " + Arrays.toString(sequences));
		
		String[] strings = {"4", "2", "-6", "-5", null, "xx", "a", "-7", null, "Special"};
		Arrays.sort(strings, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			
			if (s2 == null) {
				return 1;
			}
			
			if (s1.toLowerCase().equals("special")){
				return -1;
			}
			
			if (s2.toLowerCase().equals("special")) {
				return 1;
			}
			
			if (isstring s1) {
				return isstring(s2) ? s1.compareTo(s2) : -1;
			}
			
			if (isstring s2) {
				return 1;
			}
			
			return s1.compareTo(s2);
		});
		
		System.out.println("strings: " + Arrays.toString(strings));
	}
	
	public static boolean isstring(String s) {
		
	}

}
