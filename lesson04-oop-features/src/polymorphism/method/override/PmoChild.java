package polymorphism.method.override;

// default extend object
// classA extends classB
// --> thừa kế các thuộc tính, phương thức từ lớp cha 
	// phụ thuộc vào access modifier

//@Override --> Annotation --> @interface
// --> kys hieuej, định nghĩa ( ràng buộc_) tại chỗ nó khai báo


//Override
// +2 hay nhieu phương thức được gọi là override khi :
//		. các phương thức thuộc các class có quan hệ thừa kế
// 		. hàm trong class con định nghĩa lại (override) nội dung của hàm trong class cha
// + thừa kế được cả tt&pt
// + override được pt
 
public class PmoChild extends PmoParent {
	
	
	int a = 11;
	String s = "child";
	
	// @Override --> optional
	void log() {
		System.out.println("log --> child");
		
	}
}
