package funtional;

import bean.Apple;

public class WeightHeavierAppleCondition implements AppleCondition {
	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight() > 150;
	}
}
