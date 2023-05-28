package functional;

import bean.Apple;

public class WeightHeavierAppleCondition implements AppleCondition{

	@Override
	public boolean test(Apple apple) {
		return false;
	}
	

}
