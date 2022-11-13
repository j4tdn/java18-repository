package data.primitive;
// class(Ex01BasicDemo(age,price,avg,letter)) : KDL đối tượng ~ integer~ int 
// int a=5; int b=10;
// Ex01BasicDemo 01=new Ex01BasicDemo(....,....,....,..);Ex01BasicDemo o2=......
// Ex01BasicDemo-> Class
// o1,o2 ->object được tạo từ class Ex01BasicDemo
public class Ex01BasicDemo {

	  //private: Sử dụng trong class hiện tại
	  //public: sử dụng trong class hiện tại và ở ngoài class hiện tại
	  //TODO: lession03-oop
	  //static: thuốc phạm vi của class
	  //    	tất cả các đối tượng được tạo ra từ class này
	  //		sẽ có chung một giá trị của biến/thuộc tính static
	  // code: để gọi biến/thuộc tính static --> ClassName.staticVariable
	  //non-static: thuốc phạm vi của đối tượng
	  //             mỗi đối tượng sẽ lưu trữ/mang một giá trị riêng
	  //code: để gọi biến/thuộc tính non-static --> objectNam.nonStaticVariableName
	                             //               -->trong class hiện tại-->staticVarriableName
	  // dữ liệu
	  //biến toàn cục(thuộc tính)
	  //cú pháp:
	 private static final int age =20;
	 public static final double price=20.60;
	 private static final float avg=20.6f;
	 public char letter='A';
	  // chức năng
     public static void main(String[] args) {
      // dữ liệu
   	  //biến cục bộ(thuộc tính)
      // cú pháp:[final]datatype variablename
      //BLOCK SCOPE{}
      /*private static */ final int total=222;
        
         
         
         
         
         System.out.println(Ex01BasicDemo.age); 
      // vì sao thuộc tính thì có thể khai bảo [private][static] còn cục bộ thì ko
      //trả lời: biến cục bộ chỉ dùng trong block code hiện tại
      //gọi trực tiếp--> ko cần lấy class chấm--> ko cần static
      //ko được dngf bên ngoiaf scope/method/class --> ko cần access modifed
	}
} 
