package data.primitive;

public class Ex02DataStorage {
public static void main(String[] args) {
	// vế trái = vế phải
	// thứ tự thực hiện vế phải trước, được giá trị 
	// thì gán cho vế trái
	int a = 24;
	int b = 42;
	System.out.println("a1: " + a);
	System.out.println("b1: " + b);
    
	// = gán giá trị (STACK) của biến b cho biến a
	a = b;
	System.out.println("a2: " + a);  //42
	System.out.println("b2: " + b);  // 42
	
	// cần chức năng thay đổi giá trị của a
	// 'thay đổi - method name' giá trị của 'a - tham số'
	// thành 1 giá trị khác
	// hàm/phương thức: có 2 phần
	modify(a); // a = 42
	System.out.println("a3: " + a); // 
  } 
    // Hàm: khai báo, thân hàm
    // int input = a;  // input = 42, a = 42
    //                          = 159
    // trong 2 scope {} khác nhau thì có thể khai biến trùng tên
    // trong 1 {} thì không thể cho 2 biến trùng tên
    // Biến toàn cục có thể trùng tên với biến cục bộ
    // Truyền tham số qua hàm --> PASS BY VALUE at STACK
   private static void modify(int input) {
	   input = 159;
   }
}
