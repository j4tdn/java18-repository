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
		
		
		// shape1
		// compile: Shape
		// runtime: Circle
		// call method
		// compile(coding) --> Shape's paint
		// runtime(running) --> Circle's paint
		Shape shape1 = new Circle();
		shape1.paint();
		
		Shape shape2 = new Square();
		shape2.paint();
		
		System.out.println("======================");
		
		Shape r1 = new Rectangle();
		Shape r2 = new Rectangle();
		Shape r3 = new Rectangle();
		Shape sq1 = new Square();
		Shape sq2 = new Square();
		
		
		Shape[] shapes = {r1, r2, r3, sq1, sq2};
		for(Shape each: shapes) {
			each.calSuperficiality();
		}
		// Bai toan: Tinh S cua tat ca cac hinh --> 
		// Rectangle, Circle, Square
		// Mang: Luu tru tap hop cac ohan tu 
		// 		+ cung lieu du lieu voi
		//			KDL khai bao mang hoac con cua no
		
		
		
		/*
		 Cau hoi: Vi sao khong lay class hien tai new class ma phai lay class cha new class con?
		 Tra loi: 
		 1. Se dang ep kieu/ gan gia tri qua ve giua cac bien co KDL thuoc nhom (cha - con)
		 	Vi tat ca deu la KDL cha luc compile
		 2. Co the gop/gom tat ca cac phan tu co KDL cha/con vao trong 1 mang/ danh sach co KDL cua cha
		 
		 
		 Cau hoi: KDL cha = KDL con ==> OK
		 		  KDL con = KDL cha ==> FAIL
		 		  
		 		  vd:
		 		  KNT: long l = ... -- int i = ...
		 		  l = i ==> OK
		 		  i = l ==> FAIL
		 		  
		 		  KDT: Shape s = ... -- Square sq = ...
		 		  sh = sq ==> OK
		 		  sq = sh ==> FAIL
		 
		 */
												
	}

}
