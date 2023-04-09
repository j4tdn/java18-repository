package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		// Từng ơhaanf tử trong Set là đối tượng
		// Đối tượng: sử dụng KDL có sẵn của JAVA
		
		Set<String> seqs = new TreeSet<>(Comparator.reverseOrder());
		seqs.add("hello");
		seqs.add("haah");
		seqs.add("zo");
		seqs.add("coco");
		
		System.out.println("size --> " + seqs.size());
		seqs.forEach(seq -> System.out.print(seq + " "));
	}
}
