package collection.set;

import java.util.*;

public class Ex01BasicDemo {
    public static void main(String[] args) {
        // Từng phần tử trong set là đối tượng
        // Đối tươợng : Sử dụng KDL có sẵn của JAVA

        // set = map.keySet()

        Set<String> seqs = new TreeSet<>((o1, o2) -> o1.compareTo(o2));
        seqs.add("hello");
        seqs.add("hala");
        seqs.add("aloha");
        seqs.add("bruh");

        System.out.println("size --> " + seqs.size());
        seqs.forEach(s -> System.out.print(s + " "));

    }
}
