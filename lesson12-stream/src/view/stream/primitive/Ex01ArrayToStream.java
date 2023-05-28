package view.stream.primitive;

import java.util.Arrays;

import bean.Dish;
import model.DataModel;

public class Ex01ArrayToStream {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		int sum = Arrays.stream(numbers).sum(); // IntStream
		System.out.println("1. sum --> " + sum);

		// Tìm tổng calo của các đĩa thức ăn
		double sumOfCalories = DataModel.getDishes().stream().map(Dish::getCalories).reduce(0d, Double::sum);
		System.out.println("RS: " + sumOfCalories);

		double totalOfCalories = DataModel.getDishes().stream().mapToDouble(Dish::getCalories).sum();
		System.out.println("RS: " + totalOfCalories);

	}
}
