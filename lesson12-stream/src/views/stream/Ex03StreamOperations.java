package views.stream;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex03StreamOperations {
	public static void main(String[] args) {
		//Liệt tên 3 đĩa thức ăn có lượng calo lớn hơn 300
		DataModel.getDishes().stream()
			.filter(d -> {
				System.out.println("filtering --> " + d.getName());
				return d.getCalories() > 400;
			})
			.map(d -> {
				System.out.println("mapping --> " + d.getName());
				return d.getName();
			})
			.limit(3)
			.toArray(String[]::new);
		
		//PrintUtils.print("Liệt tên 3 đĩa thức ăn có lượng calo lớn hơn 300", menu);
	}

}
