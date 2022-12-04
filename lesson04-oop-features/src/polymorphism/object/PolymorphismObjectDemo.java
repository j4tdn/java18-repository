package polymorphism.object;

public class PolymorphismObjectDemo {
	
	// this --> doi tuong cua hien tai
	// super --> doi tuong cua lop cha
	// runtime --> Shape
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();
		
		Circle circle = new Circle();
		circle.paint();
		
		
		Square square =new Square();
		square.paint();
		
		System.out.println("====== object polymorphism =======");
		// s1
		// compile: Shape
		// runtime :Circle
		// compile( coding) -- > Shape's paint
		// runtime( running) --> Circle's paint
		
		Shape s1 = new Circle();
		s1.paint();
		Shape s2 = new Square();
		s2.paint();
		Shape s3 = new Rectangle();
		s3=s2;
		s3.paint();
		
		
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();
		
		
		Square sq1 = new Square();
		Square sq2 = new Square();
		
		
		Shape[] shapes = {r1,r2,r3,sq1,sq2};
		for(Shape each : shapes) {
			each.calSuperficiality();
		}
		
		// bài toán :Tính S của tất cả các hình trong hệ thống --> 
		// array
		// Rectangle, Square , Circle
		
		
		/*  vì sao không lấy class hiện tại new class  mà phải
		 lấy class cha new class con ?
		 
		 	Trả lời : 
		 	1.  Mình có thể dễ dàng ép kiểu/gán giá trị qua về giữa
		 	các biến có KDL thuộc nhóm ( cha - con )
		 		vì tất cả đều là KDL cha lúc compile 
		 	2.  Có thể gộp tất cả các phần tử có KDL cha/con vào 
		 	trong 1 mảng có KDL của cha 
		 	3.  thỏa mãn tính chất trong 
		 		design pattern --> factory pattern
		 	vì sao KDL cha = KDL con ==> OK
		 	       KDL con = KDL cha ==> OK
		 	
		 	Ví dụ 
		 	KNT: long l = .. -- int i= ...
		 		 l=1  ==>OK
		 		 i=l  ==>Fail
		 	KDT Shape sh = ...  -- Square sq =...
		 		 sh=sq ==> OK
		 		 sq=sh ==> FAIL
		 */
		
		
	}	
}
