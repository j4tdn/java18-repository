package functional.interfaces;

@FunctionalInterface
public interface CompareStrategy<T> {
	
	public int compare(T e1, T e2);
}
