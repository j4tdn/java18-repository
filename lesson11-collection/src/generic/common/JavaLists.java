package generic.common;

import java.util.function.Predicate;

public class JavaLists {
	public static <Element> int countIf(JavaList<Element> elements, Predicate<Element> predicate) {
		int count = 0;
		Element[] es = elements.toArray();
		for (Element element:es) {
			if (predicate.test(element)) {
				count++;
			}
		}
		
		return count;
	}
}
