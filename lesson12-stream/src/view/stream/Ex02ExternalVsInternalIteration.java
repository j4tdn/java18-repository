package view.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex02ExternalVsInternalIteration {
	public static void main(String[] args) {
		/*
		 --> Stream hỗ trợ internal iteration (tự động duyệt bên trong)
		     Vì Stream hỗ trợ những thao tác xử lý giống database --> functional programming language
		     --> đưa yêu cầu --> service/code bên dưới tự xử lý --> code ngắn gọn
		 */
		
		// lấy tên của đĩa thức ăn trong menu
		List<Dish> menu = DataModel.getDishes();
		
		// external iteration
		List<String> list = new ArrayList<>();
		for (Dish dish : menu) {
			list.add(dish.getName());
		}
		
		// internal iteration
		List<String> data = menu.stream()
						.map(Dish::getName)
						.collect(Collectors.toList());
	}

}
