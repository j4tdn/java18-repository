package utils;

import java.util.Collection;
import java.util.List;

public class PrintUtils {
	private PrintUtils() {
	}
	public static<T> void Print(String prefix, T elements) {
		System.out.println("\n" + prefix + " " + elements);
		
	}

	public static<T> void Print(String prefix, Iterable<T> elements) {
		System.out.println("\n" + prefix);
		System.out.println("===__-----------__===");
		elements.forEach(System.out::println);
		System.out.println("===__-----------__===");
	}
	
}
