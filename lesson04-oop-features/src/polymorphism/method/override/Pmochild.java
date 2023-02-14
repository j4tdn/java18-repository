package polymorphism.method.override;

// default extends Object
// Class A extends Class B
// --> thừa kế các thuộc tính, phương thức từ lớp Cha (phụ thuộc vào access modifier)
// @Override --> Annotation --> @interface
// --> ký hiệu, định nghĩa (ràng buộc) tại chỗ nó khai báo
// Override
// + 2 hay nhiều phương thức được gọi là override khi
//	. các phương thức thuộc các class có quan hệ thừa kế 
//	. hàm trong class Con định nghĩa lại nội dung của hàm trong class Cha
// + thừa kế được cả thuộc tính và phương thức 
// + chỉ override được phương thức

public class PmoChild extends PmoParent {
	@Override
	void log() {
		System.out.println("log --> child");
	}

}
