package throw_throws_trycatch;

import java.util.Objects;

public class Ex01Divison {
	public static void main(String[] args) {
//		Double a = 10d;
//		Double b = 4d;
		System.out.println("d1 --> " + divide(10d, 2d));
		
		try {
			
		}catch(Exception e){
			
		}
	}
	
	private static Double divide(Double a, Double b) { 
//		[un]boxing, auto-[un]boxing
//		Integer, Long , Float, Double 
		
		Objects.requireNonNull(a, "A cannot be null !!!");
		Objects.requireNonNull(b, "B cannot be null !!!");
		
		if( b == 0) {
			throw new ArithmeticException("B should not be ZERO !!!");
		}
		return a / b;
	}
}
