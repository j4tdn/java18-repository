package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
//		Circle circle = new Circle();
//		circle.paint();
		//as usual
		//Shape 
		Shape shape = new Shape();
		shape.paint();
		Circle circle = new Circle();
		circle.paint();
		Square square = new Square();
		square.paint();
		System.out.println(" ====== Object polymorphism =====");
		//	S1
		// compile: Shape
		// runtime: circle
		// call method
		// compile(coding) --> Shape's paint;
		// runtime(running) ---> Circle's paint;
		Shape s1 = new Circle();
		s1.paint();
		Shape s2 = new Square();
		s2.paint();
		/*
		 * Vì sao không lấy class hiện tai new class hiện tại mà  phải lấy cha new class con;
		 */
	}
}
