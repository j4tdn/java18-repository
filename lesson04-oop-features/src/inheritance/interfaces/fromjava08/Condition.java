package inheritance.interfaces.fromjava08;

@FunctionalInterface
public interface Condition {
	boolean test(int a);
	
	default boolean alwaysTrue()
	{
		return true;
	}
}
