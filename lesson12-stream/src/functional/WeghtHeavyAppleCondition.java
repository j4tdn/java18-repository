package functional;

import bean.Apple;

public class WeghtHeavyAppleCondition implements AppleCondition  {
	
	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}
}
