package polymorphism.method.override;

/**
 * default extends Object
 * classA extends classB
 * --> thừa kế các thuộc tính, phương thức từ lớp cha 
 * phụ thuộc vào access modified
 * 
 * 
 * @Override --> Annotation --> @interface
 * Annotation là --> ký hiệu, định nghĩa(ràng buộc) tại chỗ
 * nó khai báo
 * 
 * Override 
 * + 2|n phương thức được gọi là override khi 
 * 	phương thức thuộc các class có quan hệ thừa kế
 * 	hàm trong class định nghĩa lại(override) chỉ được nội 
 * dung,không được các KDL
 * 
 * + thừa kế được cả tt&pt
 * + override được pt
 */
public class PmoChild extends PmoParent {
	@Override
	void log() {
		System.out.println("log --> child");
	}
}
