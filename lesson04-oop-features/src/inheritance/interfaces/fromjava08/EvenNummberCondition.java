package inheritance.interfaces.fromjava08;

public class EvenNummberCondition implements Condition {
	@Override
	public boolean test(int a) {
		return a % 2 == 0;
	}
}
