package polymorphism.method.override;

//defaule extends object
//classA extends từ classB
// => thừa kế các thuộc tính/phương thứctừ lớp cha
// phụ thuộc vào access modifier
//@Override là ký hiệu , định nghĩa ràng buộc tại chỗ nó khai báo
//override 
//2 hay nhiều phương thức dc gọi là override khi :
//	+ các phương thức này thuộc class có quan hệ thừa kế 
//	và hàm trong class con mình định nghĩa lại nội dung trong hàm của class cha
//	thừa kế được cả thuộc tính và phương thức nhưng chỉ override đc phương thức

public class PmoChild extends PmoParent {
	int a = 10;
	String S = "parent";
	
@Override
	void log() {
		// TODO Auto-generated method stub
	System.out.println("log --> child");
	}

}
