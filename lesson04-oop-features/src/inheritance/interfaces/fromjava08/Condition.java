package inheritance.interfaces.fromjava08;

@FunctionalInterface
public interface Condition {
	// 1 abstract mothod
	boolean test(int a);
	
	// private/static/default
	default boolean alwaysTrue() {
		return true;
	}

}
