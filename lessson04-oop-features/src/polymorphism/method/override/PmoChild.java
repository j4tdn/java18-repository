package polymorphism.method.override;

//default extends Object
//classA extends classB
//--> kế thừa các thuộc tính, phương thức từ lớp cha
//	phụ thuộc vào access modifier
// @Override --> Annotation --> interface
// --> ký hiệu, định nghĩa( ràng buộc ) tại chỗ nó khai báo

//Override
// +2|n phương thước được gọi là override khi 
//	. các phương thức thuộc các class có quan hệ thừa kế
//	. hàm trong class con định nghĩa lại (override) nội dung của hàm trong class cha
//	+ thừa kế được cả thuộc tính và phương thức
//	+ override được phương thức

public class PmoChild extends PmoParent {
	
	int a = 10;
	String s = "parent";

	@Override
	void log() {
		System.out.println("log --> child");
	}
}
