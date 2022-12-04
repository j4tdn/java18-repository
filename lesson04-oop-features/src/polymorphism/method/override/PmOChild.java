package polymorphism.method.override;
// default extends Object
// classA extends classB
// --> thừa kế các thuộc tính, phương thức từ lớp cha 
//	   phụ thuộc vào access modifier
// @override : kí hiệu , định nghĩa(ràng buộc) tại chỗ nó khai báo
// @Override
// + 2 hay nhiều phương thức được gọi là override khi
//	   các hàm trong class con định nghĩa lại(override) các hàm trong class cha
// thừa kế được cả hàm và phương thức 
// override chỉ được phương thức thôi
public class PmOChild extends PmOParent{
	int a=11;
	String s="Child";
	
	
	void log() {
		System.out.println("log --> child");
	}
}
