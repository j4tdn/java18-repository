package collecsion.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListBasicDemo {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("Quý");
		sequences.add("Lê");
		System.out.println(sequences);
		System.out.println(sequences.size());
		for(int i=0;i<sequences.size();i++) {
			System.out.println(sequences.get(i));
		}
	}
}
