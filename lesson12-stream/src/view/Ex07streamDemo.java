package view;

import java.sql.Array;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;
import static utils.PrintUtils.*;

 

public class Ex07streamDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> result = menu.stream().filter(t -> t.getCalories()>400).collect(Collectors.toList());
		Print("câu 1 : calo>400", result);
		Set<String> fishDishes = menu.stream().filter((Dish d )-> Kind.FISH.equals(d.getKind())).map(Dish::getName).collect(Collectors.toSet());
		Print("cau 3", fishDishes);	
		
		//List<String> 
		// liệt kê thức ăn có calo > 400
		// B1 : chuyển đổi sang stream<T>
		// B2 : sử dụng hàm có sẵn trong stream để xử lí 
		// 		kq trả về Stream<?> là 1 tập các phần tử trong stream
		// B3 : Chuyển đổi sang kiểu dữ liệu mong muốn
		
	}
}
