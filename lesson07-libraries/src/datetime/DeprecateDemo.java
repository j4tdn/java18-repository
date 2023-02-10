package datetime;

public class DeprecateDemo {
	public static void main(String[] args) {
		// Code, project --> version 1.0
		//Dự án A
		System.out.println("Sum2: " + Java10.sum(5, 8));
		System.out.println("Sum2: " + Java10.sum(5, 7));
		
		// Code, project --> version 2.0
		//Dự án B
		System.out.println("Sum2: " + Java20.add(7, 8));
		System.out.println("Sum2: " + Java20.sum(4, 5));
	}
	
	
}
