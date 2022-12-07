package polymorphism.method.override;

// default extends Object
// class extends classB
// --> thừa kế các thuộc tính, phương thức từ lớp cha phụ thuộc vào access modifier
// @Override --> Annotation --> @interface
// --> ký hiệu, định nghĩa (ràng buộc) tại chỗ nó khai báo

// Override 
// + 2|n phương thức được gọi là override khi 
//	  .các phương thức thuộc các class có quan hệ thừa kế
// 	  .hàm trong class con định nghĩa lai nội dung của hàm trong class cha
// + thừa kế được cả thuộc tính & phương thức
// + override được mỗi phương thức

public class PmoChild extends PmoParent {
	
	int a = 9;
	String s = "child";
	
	@Override
	void log() {
		System.out.println("log --> child");
	}
}
