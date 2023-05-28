package functional;

import bean.Apple;
/**
 * Condition for apple weighter than 150g
 * 
 * @author acer
 *
 */
public class WeightHeavierAppleCondition implements AppleCondition {
	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 50;
	}
}
