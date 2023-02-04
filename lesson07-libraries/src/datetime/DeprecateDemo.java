package datetime;

import compatible.Java10;
import compatible.Java20;

public class DeprecateDemo {
	public static void main(String[] args) {
		// Coder, project --> version 1.0 java1.0.jar
		// Dự án A
		System.out.println("sum2: " + Java10.sum(5, 8));
		System.out.println("sum2: " + Java10.sum(2, 3));
		
		
		// Coder, project --> version 1.0 java2.0.jar
		// Dự án B --> develop
		System.out.println("sum2: " + Java20.add(2, 3));
		System.out.println("sum2: " + Java20.sum(2, 3));
	}
}
