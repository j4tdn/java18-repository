package collecsion.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		
		//Set 
		// set.add(e) -> map.put(e,Present)
		// map.keySet ==> all elements trong set
		
		// hello,present
		// hala ,present
		// z123 , present
		
		Set<String> seqs = new TreeSet<>(Comparator.reverseOrder());
		seqs.add("hello");
		seqs.add("hala");
		seqs.add("z123");
		//seqs.add(null);
		seqs.add("balo");
		
		seqs.add("hala");
		
		System.out.println("size --> " + seqs.size());
		seqs.forEach(seq -> System.out.println(seq));
	}
}
