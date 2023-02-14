package inheritance.interfaces.fromjava08;

public class EvenNumberCondition implements Condition {
	@Override
	public boolean test(int number) {
		return number % 2 == 0;
	}

}
