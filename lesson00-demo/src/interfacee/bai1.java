package interfacee;
@FunctionalInterface
public interface bai1 {
	boolean test(int a);
	
	default boolean alwaytrue() {
		return true;
	}
}
