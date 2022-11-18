package demo;

import been.car;

public class Ex03CarDemo {
	// ctrl alt "nút xuống
     public static void main(String[] args) {
    	 car.model = "Audi";
		car c1 = new car ("C1",  "Red");
		car c2 = new car ("C2",  "Green");
		car c3 = new car ("C3",  "Blue");
		car c4 = new car ("C4",  "Yellow");
		car ck = new car ("C5",  "Grey");
		car c100 = new car ("C100",  "white");
		
		car.model = "MG";
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("c5 --> " + ck);
		System.out.println("c100 --> " + c100);
	}
}
