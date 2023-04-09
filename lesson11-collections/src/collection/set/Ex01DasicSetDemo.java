package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01DasicSetDemo {
	public static void main(String[] args) {
		//Từng phần tử trong SET là đối tượng
		// Dối tượng: Sử dựng KDL có sẵn của JAVA
		
		//map
		//hello, PRESENT
		//haha, PRESENT
		//z123, PRESENT
		//valo, PRESENT
		
		//set = map.keySet
		
		Set<String> seqs = new TreeSet<>();
		seqs.add("hello");
		seqs.add("haha");
		seqs.add("z123");
//		seqs.add(null);
		seqs.add("valo");
		
		seqs.add("haha");
		System.out.println("size -->" + seqs.size());
		seqs.forEach(seq -> System.out.print(seq + " "));
		
		
	}
}
