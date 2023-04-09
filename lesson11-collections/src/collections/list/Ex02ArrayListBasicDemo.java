package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListBasicDemo {
	public static void main(String[] args) {
		
		List<String> sequences = new ArrayList<>(Integer.MAX_VALUE - 100);
		
		sequences.add("hello");
		sequences.add("welcome");
		sequences.add(null);
		
		
		System.out.println("sequences size: " + sequences.size());
		System.out.println("elements " + sequences);
		
		for (int i = 0 ; i < sequences.size(); i++) {
			System.out.println("e --> i " + sequences.get(i));
		}
	}
}
