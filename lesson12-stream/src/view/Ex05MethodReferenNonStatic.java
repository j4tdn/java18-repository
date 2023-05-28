package view;

import java.util.Comparator;
import java.util.List;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReferenNonStatic {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getAll();
		// sap xep nha kho tang dan theo can nang danh sach tao
		
		inventory.sort(Comparator.comparing(Apple::getWeight));
		inventory.forEach(System.out::println);
	}
}
