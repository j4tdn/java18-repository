package views;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex07StreamDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		//Câu 1: Liệt kê những đĩa thức ăn có lượng calo > 250
		List<String> dishesHaveMore250Kcl = menu.stream()
											.filter(d -> d.getCalories() > 400)
											.map(Dish::getName)
											.collect(Collectors.toList());
		PrintUtils.print("Câu 1: Liệt kê những đĩa thức ăn có lượng calo > 250", dishesHaveMore250Kcl);
	}
}
