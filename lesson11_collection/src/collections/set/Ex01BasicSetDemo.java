package collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> seqs = new TreeSet<>(Comparator.reverseOrder());
		seqs.add("hellow");
		seqs.add("alaba");
		seqs.add("yeah");
		seqs.add("alu alu");
		System.out.println("size --> "+seqs.size());
		seqs.forEach(seq -> System.out.println(seq + " "));
	}
}
