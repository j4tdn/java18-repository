package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Apple;
import model.DataModel;

public class Ex01TraversableOnlyOnce {
	public static void main(String[] args) {
		// --> Stream chỉ cho duyệt 1 lần duy nhất --> live stream
		
		List<Apple> inventory = DataModel.getApples();
		
		Stream<Apple> stream = inventory.stream();
		
		// Duyệt lần 1
		stream.forEach(System.out::print);
		
		//Duyệt lần 2
		stream.forEach(System.out::print);
		
		
	}
}
