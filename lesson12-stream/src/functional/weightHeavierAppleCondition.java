package functional;

import bean.Apple;

public class weightHeavierAppleCondition implements AppleCondition<Apple> {
	@Override
	public boolean test(Apple apple) {
		return apple.getWeight()>150;
	}
}
