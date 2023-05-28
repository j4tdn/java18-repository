package view.stream.primitive;

import java.util.Arrays;

import bean.Dish;
import model.DataModel;

public class Ex01ArrayToStream {
	public static void main(String[] args) {
		int [] numbers = {1,2,3};
		
		int sum =Arrays.stream(numbers).sum();
		System.out.println(sum);
		
		double sumOfCalo = DataModel.getDishes().stream().mapToDouble(Dish::getCalories).sum();
		System.out.println(sumOfCalo);
	}
}
