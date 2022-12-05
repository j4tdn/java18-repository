package polymorphism.object;

public class PassingFunctionParameters {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Square sq1 = new Square();
		Shape sh = new Shape();
		
		print(r1); 
		print(sq1);
		print(sh);
	}

	private static void print(Shape shape) {
		System.out.println(shape);
	}
}
