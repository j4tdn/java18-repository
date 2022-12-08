package inheritance;

public class ShapeDemo {
	public static void main(String[] args) {

		Retangle r1 = new Retangle();
		r1.paint();

		Shape s1 = new Shape() {

			@Override
			public void paint() {
				System.out.println("Circle --> paint ...");
			}

			@Override
			public void calSuperficiality() {
				System.out.println("Circle --> calS ...");
			}
		};
		s1.paint();

		Shape s2 = new Circle();
		s2.paint();
	}

}
