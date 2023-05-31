package view.stream.primitive;

import java.util.Arrays;

import bean.Dish;
import model.DataModel;

public class Ex01ArrayToStream {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		
		int sum = Arrays.stream(numbers).sum(); // IntStream#sum
		System.out.println("1. sum -->  " + sum);
		
		// Tìm tổng calo của các đĩa thức ăn
		double sumOfCalories = DataModel.getDishes()
			.stream()               // Stream<Dish>
			.map(Dish::getCalories) // Stream<Double>
			.reduce(0d, Double::sum);
		
		System.out.println("\n2. sumOfCalories --> " + sumOfCalories);
		
		double totalOfCalories = DataModel.getDishes()
			.stream()               // Stream<Dish>
			.mapToDouble(Dish::getCalories) // DoubleStream
			.sum();
		System.out.println("\n3. totalOfCalories --> " + totalOfCalories);
	}
}
