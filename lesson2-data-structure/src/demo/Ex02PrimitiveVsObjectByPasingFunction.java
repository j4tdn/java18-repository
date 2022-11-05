package demo; //TRUYỀN THAM SỐ QUA HÀM

import bean.Single;

public class Ex02PrimitiveVsObjectByPasingFunction {
       public static void main(String[] args) {
		  int a = 20;
		  a= change(a);
		  update(10);
		  System.out.println("a => " +a);
		  
		  Single s1 = new Single(25);
		  modify(s1);
		  System.out.println("s1 => "+ s1);
	}
       
       // Single input = s1
       private static void modify(Single input) {
    	   input = new Single(50);
    	   input.value= 789;
       }
       // int input = a là 2 ô nhớ, ô nhớ input đổi còn a thì k
       // 1 biến (ô nhớ ) kiểu nguyên thủy --> khi mình truyền tham số đó qua hàm
       // và trả vè void --> giá trị ô nhớ đó ko bao giờ thay đổi
       private static void update(int input) {
    	  input = 99;
      }
      
      private static int change(int input) {
    	  input = 99;
    	  return input;
      }
    	
}
