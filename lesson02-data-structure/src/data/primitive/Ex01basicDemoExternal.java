package data.primitive;

public class Ex01basicDemoExternal {
	public static void main(String[] args) {
//		truy cập được đến ' public ' (thuộc tính, phương thức) 
	   System.out.println(Ex01BasicDemo.price);
	   
	   Ex01BasicDemo o1 = new Ex01BasicDemo();
//	   Ex01BasicDemo : class
//	   o1 biến thuộc kdl
//	   new Ex01BasicDemo : giá trị
	   System.out.println(o1.letter);
	   
	}

}
