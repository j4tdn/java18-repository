package view.stream.practice;

import java.util.List;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex04Reducing {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 7, 2, 8, 6);
		
//		PrintUtils.print("1. Tìm tổng giá trị các phần tử trong list numbers", numbers.stream().reduce(0, (result, number) -> (result + number)));
		PrintUtils.print("1. Tìm tổng giá trị các phần tử trong list numbers", numbers.stream().reduce(0, Integer::sum));
		numbers.stream().reduce(Integer::max).ifPresent(v -> System.out.println("2. Tìm giá trị lớn nhất trong list numbers --> " + v));
		
		// Tìm đĩa thức ăn có lượng calo nhỏ nhất trong memu
		DataModel.getDishes().stream().reduce((minDish, dish) -> minDish.getCalories() > dish.getCalories() ? dish : minDish)
		.ifPresent(dish -> System.out.println("3. Find dish with min calo --> " + dish));
		
	}
}
