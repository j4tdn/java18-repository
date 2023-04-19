package functional;

import bean.Apple;

/**
 * Condition for apply weighter than 150g
 * 
 * @author qphan
 *
 */
public class WeightHeavierAppleCondition implements AppleCondition {

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}
}
