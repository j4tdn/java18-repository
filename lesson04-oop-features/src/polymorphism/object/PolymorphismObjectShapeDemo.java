package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.paint();
		
		Circle circle = new Circle();
		circle.paint();
		
		Square square = new Square();
		square.paint();
		
		System.out.println("=== object polymorphism ===");
		// s1
		// compile : Shape
		// runtime : Circle
		// call method
		// compile(coding) --> Shape's paint
		// runtime(run) --> Circle's paint
		Shape s1 = new Circle();
		s1.paint();
		
		Shape s2 = new Square();
		s2.paint();
		
		Shape s3 = new Rectangle();
		s3.paint();
		
		Shape[] shapes = {s1, s2, s3};
		for(Shape s : shapes) {
			s.calSuperficiality();
		}
	}
}
