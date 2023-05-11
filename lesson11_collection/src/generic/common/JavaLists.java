package generic.common;

import java.util.function.Predicate;

public class JavaLists {
	public static <E> int countIf(JavaList<E> elements, Predicate<E> predicate) {
		int count = 0;
		// elements.toArray() --> Object[]
		// es --> CharSequence[]
		E[] es = elements.toArray();
		for (E element: es) {
			if (predicate.test(element)) {
				count++;
			}
		}
		return count;
	}
}
