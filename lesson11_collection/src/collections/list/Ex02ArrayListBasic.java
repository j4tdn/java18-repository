package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListBasic {
	public static void main(String[] args) {
		ArrayList<String> sequences = new ArrayList<>();
		sequences.add("hello");
		sequences.add("wellcome");
		
		System.out.println(sequences.size());
		System.out.println(sequences);
		for(int i =0 ;i<sequences.size();i++) {
			System.out.println(sequences.get(i));
		}
	}
}
