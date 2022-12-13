package inheritance.interfaces.fromjava08;

@FunctionalInterface
public interface Condition {
	//abstract method
	boolean test(int a);
	
	default boolean alwaysTrue() {
		return true;
	}
	
}
