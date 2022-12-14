package inheritance.interfaces.fromjava08;

public class EvenBumberCondition implements Condition{
	@Override
	public boolean test(int number) {
		return number %2 == 0;
	}
}


