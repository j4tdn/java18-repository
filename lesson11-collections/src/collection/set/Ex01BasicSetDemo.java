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
		
		// set = map.keySet()
		
		
		Set<String> seqs = new TreeSet<>(Comparator.reverseOrder());
		seqs.add("1");
		seqs.add("2");
		seqs.add("3");
		seqs.add("4");
		seqs.add("4");
		
		
		System.out.println("size --> " + seqs.size());
		seqs.forEach(seq -> System.out.print(seq + " "));
	}
}
