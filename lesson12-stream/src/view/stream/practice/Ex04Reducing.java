package view.stream.practice;

import java.util.List;

import model.DataModel;

import static utils.PrintUtils.*;

public class Ex04Reducing {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 7, 2, 8, 6);
		
		print("1. Tìm tổng giá trị các phần tử trong list numbers", 
				numbers.stream().reduce(0, Integer::sum));
		
		
		numbers.stream().reduce(Integer::max)
			.ifPresent(v -> System.out.println("\n2. Tìm giá trị lớn nhất trong list numbers --> " + v));
		
		// Tìm "đĩa thức ăn" có lượng calo nhỏ nhất trong menu
		DataModel.getDishes()
			.stream()
			.reduce((minDish, dish) -> minDish.getCalories() > dish.getCalories() ? dish : minDish)
			.ifPresent(dish -> System.out.println("dish with min calo --> " + dish));
		
	}
}
