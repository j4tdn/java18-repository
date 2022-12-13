package polymorphism.object;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();

		Circle circle = new Circle();
		circle.paint();

		Square square = new Square();
		square.paint();

		System.out.println("==== object polymorphism ====");

		Shape s1 = new Circle();
		s1.paint();

		Shape s2 = new Square();
		s2.paint();

		/*
		 * câu hỏi: vì sao ko lấy class hiện tại new calss mà phải lấy class cha new
		 * class con
		 * 
		 */
	}

}