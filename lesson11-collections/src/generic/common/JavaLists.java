package generic.common;

/**
 * ko nên extends từ String 
 * --> vì String là final class --> ko thể kế thừa từ bất cứ ai 
 * 
 * Nếu đã là String thì define ngay từ đầu là String thay vì Element (khỏi Extends)
 * --> vì String là đơn vị chuỗi nhỏ nhất
 */

import java.util.function.Predicate;

public class JavaLists {
	// Nên để trong class utils
	public static <Element> int countIf(JavaList<Element> elements, Predicate<Element> predicate) {
		int count = 0;
		Element[] es = elements.toArray();
		for (Element element : es) {
			if (predicate.test(element)) {
				count++;
			}
		}
		return count;
	}
}