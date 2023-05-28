package util;

import java.util.List;
import java.util.Map;

public class PrintUtils {
	
	private PrintUtils() {
	}
	
	public static <T> void print(String prefix, T element) {
		System.out.println("\n" + prefix + " --> " + element);
	}
	
	public static <T> void print(String prefix, Iterable<T> elements) {
		System.out.println("\n" + prefix);
		
		System.out.println("==__--------------__==");
		elements.forEach(System.out::println);
		System.out.println("==__--------------__==");
	}
	public static <K, V> void print(String prefix, Map<K, V> map) {
		System.out.println("\n" + prefix);
		
		System.out.println("==__--------------__==");
		map.entrySet().forEach(System.out::println);
		System.out.println("==__--------------__==");
	}
}
