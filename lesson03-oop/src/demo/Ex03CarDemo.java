package demo;

import bean.Car;

public class Ex03CarDemo {
	public static void main(String[] args) {
		Car.model = "Audi";
		Car c1 = new Car("c1", "Red");
		Car c2 = new Car("c2", "Green");
		Car c3 = new Car("c3", "Blue");
		Car c4 = new Car("c4", "Yellow");
		Car ck = new Car("c4", "Grey");
		Car c100 = new Car("c100", "White");
		
		Car.model = "MG";
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(ck);
		System.out.println(c100);
	}

}
