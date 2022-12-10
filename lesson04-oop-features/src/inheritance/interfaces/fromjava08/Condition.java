package inheritance.interfaces.fromjava08;
@FunctionalInterface
public interface Condition {
	boolean test(int a);
	
	//private/static/default
	 default boolean alwaysTrue() {
		 return true;
	 }
}
