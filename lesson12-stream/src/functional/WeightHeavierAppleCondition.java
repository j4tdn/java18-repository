package functional;

import bean.Apple;
/*
 * Condition for apply weight than 150g
 * 
 */
public class WeightHeavierAppleCondition implements AppleCondition {

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight()>150;
	}
 
}
