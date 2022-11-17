package demo;

import bean.Car;

// ctrl alt "down"
public class Ex03CarDemo {
	public static void main(String[] args) {
		Car.model = "audi";

		Car c1 = new Car("C1", "Red");
		Car c2 = new Car("C2", "GREEN");
		Car c3 = new Car("C3", "BLUE");
		Car c4 = new Car("C4", "YELLOW");
		Car c5 = new Car("C5", "GREy");
		Car ck = new Car("Ck", "Red");
		Car c100 = new Car("C100", "WHILE");

		Car.model = "MG";

		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("ck --> " + ck);
		System.out.println("c100 --> " + c100);

	}
}
