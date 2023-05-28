package Ex01;

import java.util.List;
import java.util.Optional;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex04Reducing {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5,7,6,2,3);
		PrintUtils.Print("1. tìm tổng ", numbers.stream().reduce(0,Integer::sum));
		
		// tìm đĩa thức ăn có calo nhỏ nhất trong value
		Optional<Dish> a = DataModel.getDishes().stream().reduce((d1,d2) -> d1.getCalories()>d2.getCalories()?d2:d1);
		System.out.println(a.get());
		
		
	}
}
