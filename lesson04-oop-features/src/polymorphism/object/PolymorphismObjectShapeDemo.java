package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		// as usual (như bth)
		// 
		Shape shape = new Shape();
		shape.paint();
		
		Circle circle = new Circle();
		circle.paint();
		
		Square square = new Square();
		square.paint();
		
		System.out.println("==== object polymorphism ====");
		// s1 tại thời điểm compile là kiểu dữ liệu Shape
		//              lúc runtime là kiểu dữ liệu Circle
		// gọi method/ compile(coding) thì KDL cha
		//            Runtime(running) thì KDL của con
		// Toán tử =: chỉ gán được khi 
		//                          + KDL x = KDL x
		// 							+ KDL cha = KDL con
		Shape s1 = new Circle();
		s1.paint();
		
		Shape s2 = new Square();
		s2.paint();
		
		Shape s3 = new Rectangle();
		s3.paint();
		
		// Bài toán: Tính S của tất cả các hình --> mảng
		// Rectangle, Square, Circle
		// Mảng: lưu trữ tập hợp các phần tử cùng KDL với
		// 									+ KDL khai báo mảng
		//									+ con của nó
		
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		Shape[] shapes = {r1, r2, r3, sq1, sq2};
		for (Shape each: shapes) {
			each.calSupergiciality();
		}
		
		
		/*
		 * 	Câu hỏi: Vì sao không lấy class hiệu tại mà phải
		 * lấy class cha new class con
		 * 
		 *  Trả lời:
		 *  1. Dễ dàng ép kiểu/ gán giá trị qua về giữa các biến
		 *  có KDL thuộc nhóm (cha-con)
		 *  	Vì lúc compile tất cả đều là KDL cha
		 *  2. Có thể gộp/gom tất cả các phần tử có KDL
		 *     cha/com vào trong 1 mảng/ds có KDL của cha
		 *  3. Thõa mãn tính chất trong 
		 *  design pattern --> factory pattern
		 *  
		 *  Câu hỏi: KDL cha = KDL con ==> OK
		 *  		 KDL con = KDL cha ==> fail
		 *  
		 *  Ví dụ: 
		 *  KNT: long l = .. -- int i - ..
		 *  	l = i ==> OK
		 *  	i = l ==> Fail
		 *  
		 *  KDT: Shape sh = .. -- Square sq = ..
		 *  	sh = sq ==> OK
		 *  	sq = sh ==> Fail
		 */
	}
}
