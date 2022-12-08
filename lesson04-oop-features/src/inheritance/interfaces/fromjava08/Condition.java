package inheritance.interfaces.fromjava08;

@FunctionalInterface
public interface Condition {
	// abstract method
	boolean test(int a);
	
	
	// private/static/default
	default boolean alwayTrue() {
		return true;
	}
}
