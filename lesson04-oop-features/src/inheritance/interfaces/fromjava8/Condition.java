package inheritance.interfaces.fromjava8;

@FunctionalInterface //bắt buộc cái interface chỉ có 1 hàm trừu tượng
public interface Condition {
	boolean test(int a);
	
	
	//private/static/default
	default boolean alwaysTrue() {
		return true;
	}
}
