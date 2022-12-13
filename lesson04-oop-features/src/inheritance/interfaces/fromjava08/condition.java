package inheritance.interfaces.fromjava08;

@FunctionalInterface
public interface condition {
	// abstract method
	boolean test(int a);
	
	// private/static/default
	default boolean alwaysTrue() {
		return true;
	}
}
