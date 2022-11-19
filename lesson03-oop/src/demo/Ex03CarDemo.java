package demo;

import bean.Car;

public class Ex03CarDemo {
	public static void main(String[] args) {
		Car.model = "Audi";
		Car c1 = new Car("C1", "Red");
		Car c2 = new Car("C2", "Blue");
		Car c3 = new Car("C3", "Green");
		Car c4 = new Car("C4", "Black");
		Car ck = new Car("Ck", "Yello");
		Car c100 = new Car("C100", "white");
		
		System.out.println("C1 --> " + c1);
		System.out.println("C2 --> " + c2);
		System.out.println("C3 --> " + c3);
		System.out.println("C4 --> " + c4);
		System.out.println("Ck --> " + ck);
		System.out.println("C100 --> " + c100);
	}
}
