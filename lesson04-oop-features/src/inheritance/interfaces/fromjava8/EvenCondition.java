package inheritance.interfaces.fromjava8;

public class EvenCondition implements Condition {

	@Override
	public boolean test(int a) {
		return a%2==0;
	}

}
