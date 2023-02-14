package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		// as usual
		
		// shape 
		// compile --> Shape --> call Shape's methods
		// runtime --> Shape --> call Shape's methods
		Shape shape = new Shape();
		shape.paint();
		
		Circle circle = new Circle();
		circle.paint();
		
		Square square = new Square();
		square.paint();
		
		System.out.println("========== Object Polymorphism ==========");
		// s1
		// compile --> Shape
		// runtime --> Circle 
		// call method 
		// Compile (code)    --> Shape's paint();
		// Runtime (running) --> Circle's paint();
		Shape s1 = new Circle();
		s1.paint();
		
		Shape s2 = new Square();
		s2.paint();
		
		/**
		 * Bài toán: tính diện tích của tất cả các hình trong hệ thống
		   Rectangle, Circle, Square
		 * Cách làm: 
		   => Đưa về cùng KDL cha là Shape
		   => đưa vào mảng (mà tính chất của mảng là tập hợp các phần tử có cùng KDL)
		 */
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		Shape[] shapes = {r1, r2, r3, sq1, sq2};
		for (Shape each : shapes) {
			each.calSuperficialiity();
		}
		
		/**
		 * Câu hỏi: Vì sao không lấy class hiện tại new class hiện tại mà phải lấy class cha new class con?
		 * Trả lời: 
		 1. Dễ dàng ép kiểu/gán giá trị qua về giữa các biến có KDL thuộc nhóm cha-con
		 	Vì tất cả đều là KDL cha lúc compile (VD phía trên)
		 2. Có thể gộp/gom tất cả các phần tử có KDL cha-con vào 1 mảng/danh sách có KDL của cha	
		 3. Thỏa mãn tính chất trong design pattern --> factory pattern 
		 */
	}

}
