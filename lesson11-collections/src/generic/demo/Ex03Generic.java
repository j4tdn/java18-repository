package generic.demo;

import generic.common.CustomList;
import generic.common.IList;

public class Ex03Generic {
    public static void main(String[] args) {
        IList<String> sequences = new CustomList<>();
        sequences.add("aloha");
        sequences.add("konnichiwa");

        sequences.addIfAbsent("bonjour");
        sequences.removeIf(s -> s.length() < 6);

        sequences.forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println(sequences.size());
    }
}
