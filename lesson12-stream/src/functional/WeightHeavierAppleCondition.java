package functional;

import bean.Apple;

/**
 * Condition for apply weighter 150g
 */

public class WeightHeavierAppleCondition implements AppleCondition {

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}
}
