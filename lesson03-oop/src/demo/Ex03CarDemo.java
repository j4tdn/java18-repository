package demo;

import bean.Car;

public class Ex03CarDemo {
	public static void main(String[] args) {
		Car c1 = new Car("C1", "Red");
		Car c2 = new Car("C1", "Green");
		Car c3 = new Car("C1", "Blue");
		Car c4 = new Car("C1", "Yellow");
		Car ck = new Car("C1", "Grey");
		Car c100 = new Car("C100", "white");
		
		
		c3.model = "MG";
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("ck --> " + ck);
		System.out.println("c100 --> " + c100);
	}
}
