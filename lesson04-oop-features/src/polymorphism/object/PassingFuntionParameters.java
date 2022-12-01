package polymorphism.object;

public class PassingFuntionParameters {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Square sq = new Square();
		Shape sh = new Shape();

		print(r1);
		print(sh);
		print(sq);

	}

	private static void print(Shape shape) {
		System.out.println(shape);
	}
}
