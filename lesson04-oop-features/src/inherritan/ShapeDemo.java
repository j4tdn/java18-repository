package inherritan;

public class ShapeDemo {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.paint();
		Shape s1 = new Shape() {
			@Override
			public void paint() {
				System.out.println("....");
			}

			@Override
			public void calSuperficiality() {
				System.out.println("....");
			}
		};
		s1.paint();

		Shape s2 = new Circle();
		s2.paint();

	}
}
