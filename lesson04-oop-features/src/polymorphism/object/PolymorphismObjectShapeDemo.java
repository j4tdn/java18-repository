package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		// as usual
		// shape --> 
		//   compile --> Shape --> call Shape's methods
		//   runtime --> Shape       
		Shape shape = new Shape();
		shape.paint();
		
		Circle circle = new Circle();
		circle.paint();
		
		Square square = new Square();
		square.paint();
		
		System.out.println("===== object polymorphism ====");
		// s1
		// compile: Shape
		// runtime: Circle
		// call method
		// compile(coding) --> Shape's paint
		// runtime(running) --> Circle's paint
		Shape s1 = new Circle();
		s1.paint();
		
		Shape s2 = new Square(); // H2
		s2.paint();
		
		Shape s3 = new Rectangle(); // H3
		// s3.width = 10; s3.height=10; --> Square
		// =: KDL x   = KDL x
		//  : KDL cha = KDL con
		s3 = s2;
		s3.paint();
		
		s3 = new Square(); // H4
		s3.paint(); // correct
		
		// Bài toán: Tính S của 'tất cả các hình' --> mảng <-- trong hệ thống
		// Rectangle, Square, Circle
		// Mảng: Lưu trữ tập hợp các phần tử 
		//  + cùng kiểu dữ liệu với 
		//         KDL khai báo mảng hoặc con của nó
		// int[]  i = {2,2,3,4};
		// String[] s = {"a", "b"}
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		// Rectangle[] rectangles = {r1, r2, r3, sq1};
		Shape[] shapes = {r1, r2, r3, sq1, sq2};
		for(Shape each: shapes) {
			each.calSuperficiality();
		}
		
		/* 
		 Câu hỏi: Vì sao không lấy class hiện tại new class hiện tại
		 mà phải lấy class cha new class con ?
		 
		 Trả lời:
		 1. Dễ dàng ép kiểu/gán giá trị qua về giữa các
		 biến có KDL thuộc nhóm(cha-con)
		    Vì tất cả đều là KDL cha lúc compile
		 2. Có thể gộp/gom tất cả các phần tử có KDL
		 cha/con vào trong 1 mảng/danh sách có KDL của cha
		 3. Thỏa mãn tính chất trong
		 	design pattern --> factory pattern
		 	Cha cha = new Con()
		 
		 Câu hỏi: KDL cha = KDL con ==> OK
		          KDL con = KDL cha ==> FAIL
		 
		*/
		
	}
}
