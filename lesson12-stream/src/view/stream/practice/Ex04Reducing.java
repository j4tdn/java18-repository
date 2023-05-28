package view.stream.practice;

import static utils.PrintUtils.print;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex04Reducing {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5,7,2,8,6);
		//numbers.stream().reduce(0,(result,number)->result+number 
		print("1.Tìm tổng giá trị các phần tử trong list number :",numbers.stream().reduce(0,Integer::sum ));
		//(max,number)-> max<number?number:max)
		
		print("2.Tìm giá trị lớn nhất trong list number",numbers.stream().reduce(Integer::max));
		//Tìm đĩa thức ăn có lương calo nhỏ nhất trong menu
		List<Dish> inventory = DataModel.getDishes();
		inventory.stream()
				.reduce((min,d)->d.getCalories()<min.getCalories()?d:min).
	ifPresent(dish->System.out.println("3.Tìm đĩa thức ăn có lương calo nhỏ nhất trong menu"+dish));
		
	}
}
