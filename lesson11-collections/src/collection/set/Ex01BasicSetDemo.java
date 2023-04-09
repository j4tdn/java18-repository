package collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		//Từng đối tượng trong Set là Object
		// Đối tượng: sử dụng KDL có sẵn của Java
		
		
		Set<String> sequences = new TreeSet<String>(Comparator.reverseOrder());
		sequences.add("aaa");
		sequences.add("bbb");
		sequences.add("ccc");
		// Set.add(e) = Map.put(e, PRESENT)
		//===> Set = Map.keySet()
		
		sequences.add("aaa");
		System.out.println("size ----> " + sequences.size());
		sequences.forEach(e -> {
			System.out.println(e);
		});
		
	}
}
