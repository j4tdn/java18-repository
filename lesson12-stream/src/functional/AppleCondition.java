package functional;

import bean.Apple;
@FunctionalInterface	
public interface AppleCondition <T>{
	boolean test(T t);
}
