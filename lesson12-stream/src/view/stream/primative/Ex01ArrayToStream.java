package view.stream.primative;

import java.util.Arrays;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex01ArrayToStream {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };

		int sum = Arrays.stream(numbers).sum();
		PrintUtils.printf("1. sum", sum);

		// Ex: Tìm tổng của các đĩa thức ăn
		DataModel.getDishes().stream().map(Dish::getCalories).reduce(0d, Double::sum);
		
		 //c2
		double sumDishCalories = DataModel.getDishes().stream().mapToDouble(Dish::getCalories).sum();
		PrintUtils.printf("2. Tổng calories", sumDishCalories);
	}
}
