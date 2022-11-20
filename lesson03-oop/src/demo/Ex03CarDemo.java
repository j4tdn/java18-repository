package demo;

import bean.Car;

public class Ex03CarDemo {
	public static void main(String[] args) {
		
		Car.model = "Audi"; 
		// ctrl alt down để copy nhiều dòng xuống
		Car c1 = new Car("C1", "Red");
		Car c2 = new Car("C2", "Green");
		Car c3 = new Car("C3", "Blue");
		Car c4 = new Car("C4", "Yellow");
		Car ck = new Car("Ck", "Grey");
		Car c100 = new Car("C100", "White");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("ck --> " + ck);
		System.out.println("c100 --> " + c100);
		
		// c3.setModel("MG");
		// c4.setModel("MG");
		
	}
}