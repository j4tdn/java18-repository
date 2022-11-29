package polymorphism.object;

public class PassingFunctionParameters {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Square sq = new Square();
		Shape sh = new Shape();

		print(r1);
		print(sq);
		print(sh);
	}

	// Shape shape = ...
	// Pass parameter's data type or sub data type
	private static void print(Shape shape) {
		System.out.println(shape);
	}

}
