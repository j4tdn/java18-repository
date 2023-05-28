package bean;
@FunctionalInterface
public interface Condition <T>{
	//@FunctionalInterface
	boolean behavior(T t);
}
