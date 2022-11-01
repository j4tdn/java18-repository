package data.object;
import bean.Item;
public class Ex02ItemDemo {
	public static void main(String[] args) {
		//id, name, salesPrice
		//int: KDL ==> int a = 5
		//Integer: KDL ==> Integer b = new Integer(5);
		//Item: KDL
		//new Item(): đối tượng (giá trị) (ô nhớ HEAP
		//+ tạo ra 1 ô nhớ ở HEAP
		//+ Giá trị mặc định gán cho các thuộc tính
		
		//Java class mặc định kế thừa từ class Object
		//Class Object --> toString()
		//toString() --> getClass().getName() +@ + hashCode
	
		Item i3 = new Item(234, "B234", 20d );
		System.out.println(i3);
		//Mặc định chương trình sẽ gọi hàm toString
	}

}
