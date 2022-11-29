package polymorphism.method.override;

// default extends Object
// classA extends classB 
// --> thừa kế các thuộc tính, phương thức từ lớp cha
// 		phụ thuộc vào access modifier
// @Override --> Annotaion --> @interface
// Ký hiệu, định nghĩa(ràng buộc) tại chỗ nó khai báo

// Override 
// 	+2|n phương thức được gọi là override khi 
// 	. các phương thức thuộc các class có quan hệ thừa kế
// 	. hàm trong class con định nghĩa lại(override) nội dung trong class của cha
// 	+ thừa kế được cả thuộc tính và p.thức
// 	+ overrdie được phương thức
public class PmoChid extends PmoParent {

	void demo() {

	}

	// @Override --> optional
	void log() {
		System.out.println("log --> child");
	}
}
