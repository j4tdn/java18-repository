package polymorphism.object;

public class PassingFuntionParameters {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Square sq = new Square();
		Shape sh = new Shape();
		
		print(sh);
		print(sq);
		print(r1);
	}
	private static void print ( Shape shape) {
		System.out.println(shape);
	}
}
