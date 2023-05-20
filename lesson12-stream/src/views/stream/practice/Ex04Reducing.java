package views.stream.practice;

import java.util.List;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex04Reducing {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 7, 2 , 8, 6);
		PrintUtils.print("1. Tổng các phần tử trong list numbers\n",
				numbers.stream().reduce(0, Integer::sum));
		
		PrintUtils.print("2. Tìm giá lớn nhất trong list numbers\n",
				numbers.stream().reduce(Integer::max));
		
		//Tìm đĩa thwuscanw có lượng calo nhỏ nhất trong menu
		DataModel.getDishes()
									.stream()
									.reduce((minDish, dish) -> minDish.getCalories() < dish.getCalories() ? minDish : dish)
									.ifPresent(dish -> System.out.println("3. Dish with min calories" + dish));;

	}

}
