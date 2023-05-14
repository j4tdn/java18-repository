package view.stream.practice;

import java.util.List;
import java.util.Optional;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex04Reducing {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

		int totalList = numbers.stream().reduce(0, (total, element) -> total + element);
		PrintUtils.printf("1. Tìm tổng giá trị phần tử trong List", totalList);

		// Nếu reduce không có truyền phần tử ban đầu vào thì sẽ trả ra Optional
		// Nếu mảng mà không có phần tử sẽ trả ra Optional rỗng
		// Nếu mảng có phânt tử sẽ lấy phần tử đầu tiên lam identity
		numbers.stream().reduce(Integer::max)
				.ifPresent(e -> System.out.println("2. Tìm giá trị lớn nhất trong list numbers: " + e));
//		PrintUtils.printf("2. Tìm giá trị lớn nhất trong list numbers", max);

		// Ex: Tìm dĩa thức ăn
		List<Dish> dishes = DataModel.getDishes();
		dishes.stream().reduce((min, dish) -> min.getCalories() < dish.getCalories() ? min : dish)
				.ifPresent(e -> System.out.println("3. Đĩa thức ăn lượng calories nhỏ nhất: " + e.getName()));
		;
	}
}
