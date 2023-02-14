package inheritance.interfaces.fromjava08;

@FunctionalInterface
public interface Condition {
	// abstract method (1) --> functional interface
	boolean test(int a);
	
	// private/static/default
	default boolean alwaysTrue() {
		return true;
	}

}
