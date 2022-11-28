package poymorphism.method.overloading;
// default extends Object
// classA extends classB
// --> thừa kế các thuộc tính, phương thức từ lớp cha
//phụ thuộc vào access modifier
// @Override --> Annotation --> @interface
//  --> kí hiệu, định nghĩa (ràng buộc) tại chỗ nó khai báo

// Override
// + 2|n phương thức được gọi là override khi
//    . các phương thức thuộc class có quan hệ thừa kế
//    . hàm trong class định nghĩa lại (override) nội dung
// + thùa kế được cả tt&pt
// + override được pt
public class  PmoChild extends PmoParent {
	int a = 11;
	String s = "child";
	@Override
    void log() {
    	System.out.println("log ---> child");
    }
}
