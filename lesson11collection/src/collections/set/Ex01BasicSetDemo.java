package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		//từng phần tử trong set là đối tượng
		//đối tượng : sử dụng kiểu dl có sẵn của JAVA
		Set<String> seqs = new TreeSet<>();
		seqs.add("hello");
		seqs.add("hala");
		seqs.add("z123");
//		seqs.add(null);
		seqs.add("balo");
		
		seqs.add("hala");
		System.out.println("size --> "+seqs.size());
		seqs.forEach(seq->{
			System.out.print(seq+" ");
		});
	}
}
