package data.object;

public class Ex01BasicObjectDemo {
public static void main(String[] args) {
	//KDL đối tượng có sẵn của JAVA
	//chỉ có duy nhất 1 thuộc tính bên trong
	//Integer, Float, Double, String, Character
	
	int a = 5;
	//khai báo và khởi tạo giá trị
	//Integer i1 = 15;
	Integer i1 = new Integer(15);
	Double d1 = new Double(25);
	String s1 = new String("hello");
	
	System.out.println("i1: " + i1);
	System.out.println("d1: " + d1);
	System.out.println("s1: " + s1);
	
	i1 = new Integer(15);
	
}
}
