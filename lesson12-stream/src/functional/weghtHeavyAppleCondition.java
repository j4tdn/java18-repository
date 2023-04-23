package functional;

import bean.Apple;

public class weghtHeavyAppleCondition  {
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}
}
