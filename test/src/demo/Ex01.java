package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import utils.AppleUtilis;
import utils.CollectionUtils;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtilis.getAll();
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : inventory) {
			if(apple.getColor().equals("green")) {
				result.add(apple);
			}
		}
		System.out.println("--------green apple--------");
		CollectionUtils.printf(result);
		System.out.println("--------red apple ----------");
		result = filterApples(inventory, "red");
		CollectionUtils.printf(result);
		System.out.println("---------country-----------");
		Set<String> set = Country(inventory, t -> t.getCountry());
		CollectionUtils.printf(set);
		System.out.println("-----------text---------");
		List<String > text = List.of("abc","abcdefg","ab","cdef");
		Set<Integer> setInteger = Country(text, t -> t.length());
		CollectionUtils.printf(setInteger);
	}
	
	private static List<Apple> filterApples(List<Apple> inventory , String color){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(apple.getColor().equals(color)) {
				result.add(apple);
			}
		}
		return result;
	}
	private static <T,R> Set<R> Country(List<T> inventory ,Function<T, R> function){
		Set<R> es = new HashSet<>();
		for(T t : inventory) {
			es.add(function.apply(t));
		}
		return es;
	}
}
