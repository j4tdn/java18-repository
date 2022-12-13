package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.paint();

		// Rectangle r1 = new Rectangle();
		// Rectangle r2 = new Rectangle();
		// Rectangle r3 = new Rectangle();

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
