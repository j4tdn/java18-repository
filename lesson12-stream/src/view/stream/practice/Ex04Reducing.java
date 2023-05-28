package view.stream.practice;

import java.util.List;

import bean.Dish;
import model.DataModel;
import util.PrintUtils;

public class Ex04Reducing {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 7, 3, 8, 6);

		Integer sum = numbers.stream().reduce(0, Integer::sum); // (a, b) -> a + b
		PrintUtils.print("1. Tìm tổng giá trị các phần tử trong list numbers ", sum);
		
		Integer maxvalue = numbers.stream().reduce((max, number) -> max < number ? number : max).get(); // (a, b) -> a + b
		PrintUtils.print("1. Tìm giá trị lớn nhất trong list numbers ", maxvalue);
		
		// Tìm đĩa thức ăn có lượng calo nhỏ nhất trong menu
		DataModel.getDishes().stream().reduce((min, calo) -> min.getCalories() < calo.getCalories() ? min : calo)
				.ifPresent(dish -> System.out.println("dish with min calo " + dish));
	}
}
