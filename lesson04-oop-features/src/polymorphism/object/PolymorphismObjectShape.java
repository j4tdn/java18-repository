package polymorphism.object;


public class PolymorphismObjectShape {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();

		Circle circle = new Circle();
		circle.paint();

		Square square = new Square();
		square.paint();

		System.out.println("========== obj polymorhism ==========");

		Shape s1 = new Circle();
		s1.paint();

		Shape s2 = new Square();
		s2.paint();

		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();

		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		
		Shape[] shapes = { r1, r2, r3, sq1, sq2 };
		for (Shape each : shapes) {
			each.calSuperficiality();
		}

	}

}
