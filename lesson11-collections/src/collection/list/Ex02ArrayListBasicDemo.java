package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListBasicDemo {
	public static void main(String[] args) {
		// add last		
		List<String> sequences = new ArrayList<>();
		sequences.add("Hello");
		sequences.add("Welcome");
		sequences.add(null);
		
		
		
		// size: số lượng phần tử của List
		System.out.println("sequences size: " + sequences.size());
		System.out.println("elements" + sequences);
		
		for (int i = 0; i < sequences.size(); i++) {
			System.out.println("e --> i: " + sequences.get(i));
		}
		System.out.println("================");
	}

}
