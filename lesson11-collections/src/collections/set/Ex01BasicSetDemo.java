package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
    => e trong SET chính là Key trong MAP
    
    seqs.add("hello"); --> hello, PRESENT (không cần quan tâm PRESENT)
	seqs.add("hala");  --> hala, PRESENT
	seqs.add("z123");  --> z123, PRESENT
	seqs.add("balo");  --> balo, PRESENT
 *
 */

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		// Từng phần tử trong SET là đối tượng 
		// Đối tượng: sử dụng KDL có sẵn của JAVA
		
		Set<String> seqs = new TreeSet<>(Comparator.reverseOrder());
		seqs.add("hello");
		seqs.add("hala");
		seqs.add("z123");
		//seqs.add(null); // chỉ là TreeSet không được null, vì có quy chế sort
		seqs.add("balo");
		
		seqs.add("hala");
		
		System.out.println("size --> " + seqs.size());
		seqs.forEach(System.out::println);		
	}
}