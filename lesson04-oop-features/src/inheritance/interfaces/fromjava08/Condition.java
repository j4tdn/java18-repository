package inheritance.interfaces.fromjava08;

@FunctionalInterface
public interface Condition {
	// abstract method
	boolean test(int a); // hàm trừu tượng
    
	// private/static/dèault
	default boolean alwaysTrue() {
		return true;
	}
}
