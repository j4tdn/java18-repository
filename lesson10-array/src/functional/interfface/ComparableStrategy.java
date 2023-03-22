package functional.interfface;

public interface ComparableStrategy {
	/**
	 * 
	 * @param e1 first element
	 * @param e2 second element
	 * @return	positive if e1 > e2
	 * 			zero if     e1 = e2
	 * 			nagative if e1 < e2
	 */
	int  compare(int e1,int e2);
}
