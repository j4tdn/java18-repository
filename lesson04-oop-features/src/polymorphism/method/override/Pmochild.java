package polymorphism.method.override;


//default extends Object
//classA extend classB
//--> thừa kế các thuộc tính, phương thức từ lớp cha
//	phụ thuộc vào access modifier

//@Override --> Annotation -->@interface
// --kí hiệu, định nghĩa(ràng buộc) tại chỗ có khai báo

//Override
// + 2 | n phương thức được gọi là override khi 
// + 	. các phương thức này thuộ các class có quan hệ thừa kế
//		. hàm trong class con đình nghĩa lại(override) nội dung của hàm trong class cha
// + thừa kế được cả pt & tt
// + override được pt thôi
public class Pmochild extends PmoParent{
	int a = 11;
	String s = "child";
	@Override
	//@OVerride --> optional
	void log() {
		System.out.println("log --> child");
	}
}
