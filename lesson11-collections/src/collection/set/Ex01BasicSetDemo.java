package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		// Từng phần tử trong SET là đối tượng
		// Đối tượng: sử dụng KDL có sẵn của JAVA
		
		// Set
		//   Map
		
		// set.add(e) --> map.put(e, PRESENT)
		// map.keySet ==> all elements trong set
		
		// map
		// hello, PRESENT
		// hala, PRESENT
		// z123, PRESENT
		// balo, PRESENT
		
		// set = map.keySet()
		
		Set<String> seqs = new TreeSet<>(Comparator.reverseOrder());
		seqs.add("hello");
		seqs.add("hala");
		seqs.add("z123");
		seqs.add("balo");
		
		seqs.add("hala");
		
		System.out.println("size --> " + seqs.size());
		seqs.forEach(seq -> System.out.print(seq + "  "));
	}
}
