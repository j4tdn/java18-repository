package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05SortByCondition {
	public static void main(String[] args) {
		String[] sequences = {"4", "2", "a", "z", "c", "10", "t"};
		
		Arrays.sort(sequences);
		
		Arrays.sort(sequences, (s1, s2) -> s2.compareTo(s1));
		
		Arrays.sort(sequences, Comparator.comparing(s->s));
		// Arrays.sort(sequences, Comparator.comparing(Function.identity()))
		
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		
		Arrays.sort(strings, (String s1, String s2) -> {
			if(s1 == null) {
				return -1;
			}
			
			if(s2 == null) {
				return 1;
			}
			
			if(s1.equals("Special")) {
				return -1;
			}
			
			if(s2.equals("Special")) {
				return 1;
			}
			
			// B3 : Xu li chuoi truoc moi den phan cn lai
			// s1 chuoi, s2 chuoi
//			if(isString(s1)) {
//				return isString(s2) ? s1.compareTo(s2) : -1;
//			}
			
			if(isString(s1) && !isString(s2)) {
				return -1;
			}
			
			// s1 != chuoi, s2 chua biet
			// s1 chuoi, s2 chuoi
			if(isString(s2)) {
				return 1;
			}
			return s1.compareTo(s2);
		});
		System.out.println(Arrays.toString(strings));
	}
	
	public static boolean isString(String s) {
		return s.matches("[a-zA-Z]+");
	}
}
