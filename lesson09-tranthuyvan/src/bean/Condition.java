package bean;

@FunctionalInterface
public interface Condition {
	boolean check(Student student);
}
