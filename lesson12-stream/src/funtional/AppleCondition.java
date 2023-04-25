package funtional;

import bean.Apple;

@FunctionalInterface
public interface AppleCondition {
	boolean test(Apple apple);
}
