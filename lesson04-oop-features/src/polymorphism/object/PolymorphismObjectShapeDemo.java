package polymorphism.object;

public class PolymorphismObjectShapeDemo {
	public static void main(String[] args) {
		Shape shape0 = new Square();
		shape0.paint();
		
		Square square = new Square();
		square.paint();
		
		//shape2 
		//compile: Shape
		//runtime: Circle
		//compile(coding)-->call paint function in Shape
		//runtime(running) --> call paint function in Circle
		
		
		Circle shape1 = new Circle();
		shape1.paint();
		
		Shape shape2 = new Square();
		shape2.paint();
		
		Shape shape3 = new Rectangle();
		shape3.paint();
		
		System.out.println("===== object polymorphism =====");
		
		Shape[] shapes = {shape1,shape2,shape3};
		for(Shape shape : shapes) {
			shape.calArea();
		}
		
		/*
		 * question:  Vì sao không lấy class hiện tại mà phải lấy class cha = new clas con
		 * Answer: 
		 * 	-> Dễ dàng ép kiểu, gán giá trị qua về giữa các biến có KDL thuộc nhóm (cha-con) 
		 * 		vì đều là KDL cha lúc compile
		 * 	-> Có thể gộp go tất cả cá ptu có KDL cha/con vào trong 1 mảng có KDL của cha
		 * 	-> Thoả mãn tính chất trong
		 * 		design pattern --> factory pattern
		 */
	}
}
