package funtional;

public interface ComparableStrategy {
	/**
	 * 
	 * @param e1 first element
	 * @param e2 second element
	 * @return positive e1 > e2
	 * 		   negative e1
	 */
	int compare(int e1, int e2);
}
