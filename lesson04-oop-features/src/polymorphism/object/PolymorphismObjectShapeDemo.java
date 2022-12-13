package polymorphism.object;

import java.util.Iterator;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		Shape shape =new Shape();
		shape.paint();
		
		Circle circle = new Circle();
		circle.paint();
		
		Square square = new Square();
		square.paint();
		
		System.out.println("====== object polymorphism ======");
//		s1
//		compile : Shape
//		runtime : Circle
//		call method
//		complile(coding) --> Shape's paint
//		runtime(running) --> Circle's paint
		Shape s1 = new Circle();
		s1.paint();
		Shape s2 = new Square();
		s2.paint();
		Shape s3 = new Rectangle();
//		toán tử bằng chỉ cho phép gán trong trường hợp:
//		- KDL x= kdl x
//		- KDL cha =  kdl con
		s3 = s2;
		s3.paint();
		
		s3 = new Square();
		s3.paint();
		/**
		 Bài toán: tính S của các hình --> mảng --> trong hệ thống
		 Rectangle, Square, Circle\
		 mảng lưu trữ 1 tập hợp các phần tử có cùng kiểu dữ liệu với kiểu dữ liệu khai báo mảng hoặc con của nó
		 */
		
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		Shape[] shapes = {r1, r2, r3, sq1, sq2};
		
		for (Shape each: shapes) {
			each.calSuperficiality();
		}
//		vì sao không lấy class hiện tại new class hiện tại luôn
//		mà lấy class cha new class con?
		
//		vì : 
//		câu hỏi KDL cha = kdl con ==> oke
//				KDL con = KDL cha ==> fail
		
//		- Trả lời: 
//			1. dễ dàng ép kiểu/ gán giá trị qua về giữa các bieenss có kiểu dữ liệu thuộc nhóm cha con
//			vì tất cả đều là kdl cha lúc compile
//			2. có thể gom tất cả các phần tử có KDL cha/ con vào trong 1 mảng có KDL của cha
//			3.thỏa mãn tính chất trong design pattern --> factory pattern;
//		
	}

}
