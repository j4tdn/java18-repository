package polymorphism.object;

public class PassingFunctionParamenters {
	public static void main(String[] args) {
		Rectangle r1 =new Rectangle();
		Square sq =new Square();
		Shape sh =new Shape();
		print(sq);
		print(r1);
		print(sh);
	}
	
//	Square s1 =sq
//	private static void print(Square s1) {
//		System.out.println(s1);
//	}
//	
//	private static void print(Rectangle s1) {
//		System.out.println(s1);
//	}
	
	private static void print(Shape s1) {
		System.out.println(s1);
	}

}
