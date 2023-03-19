package functional;

@FunctionalInterface
public interface ComparableStrategy {
	/**
	 * Compare 2 elements
	 * @param e1 first element
	 * @param e2 second element
	 * @return positive if e1 > e2
	 * 		   zero		   e1 = e2
	 *         negative    e1 < e2
	 */
	int copare(int e1, int e2);
}
