package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> seqs = new HashSet<>();
		seqs.add("hello");
		seqs.add("halla");
		seqs.add("123");
		seqs.add(null);
		seqs.add("bald");
		seqs.add("hello2");
		
		System.out.println("size --> " + seqs.size());
		seqs.forEach(seq -> System.out.println(seq + " "));
	}

}
