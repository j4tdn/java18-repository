package demo;

import bean.Car;

public class Ex03CarDemo {
	public static void main(String[] args) {
		Car.model = "Audi";
		Car car1 = new Car("C1","Red");
		Car car2 = new Car("C2","Gray");
		Car car3 = new Car("C3","Blue");
		Car cark = new Car("Ck","Yellow");
		Car car100 = new Car("C100","Black");
		
		System.out.println("c1 --> "+ car1);
		System.out.println("c2 --> "+ car2);
		System.out.println("c3 --> "+ car3);
		System.out.println("ck --> "+ cark);
		System.out.println("c100 --> "+ car100);
		
		System.out.println("======================================");
		
		System.out.println("c1 --> "+ car1);
		System.out.println("c2 --> "+ car2);
		System.out.println("c3 --> "+ car3);
		System.out.println("ck --> "+ cark);
		System.out.println("c100 --> "+ car100);
		
	}
}
