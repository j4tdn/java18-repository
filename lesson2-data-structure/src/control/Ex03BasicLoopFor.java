package control;
/**
 * LOOP
 * + for('index'/each)
 * + while
 * + do while
 * ----> interate(collection)
 * @author Lenovo
 *
 */
public class Ex03BasicLoopFor {
       public static void main(String[] args) {
		//In ra danh sách các số nguyên dương nhỏ hơn N
    	// Với N : Nhập từ bàn phím hoặc khai báo sẵn
    	   
    	   int n = 12;
    	   //BT1 : Biểu thức khai báo --> gọi duy nhất lần dầu khi vào for
    	   //BT2 : Biểu thức điều kiện(true false)
    	   // -> body(vòng lập) vẫn chạy(thực hiện) khi BT2 vẫn đang true
    	   //BT3 : Biểu thức điều khiển
    	   
    	   //Phần tử nhỏ hơn 12 --> 0,1,2...11
    	   //Phần tử chẵn nhỏ hơn 12 --> 0 2 4 6 8 10
    	   //Phần tử lẽ nhỏ hơn 12 --> 1 3 5  9 11
    	   //Phần tử là bội của 5 và nhỏ hơn 12 --> 0 5 10
    	   
    	   //Bội của 3 và 4 và nhỏ hơn 100
    	   for(int i = 0; i < n; i++) {
    		   // body
    		   if (i % 12 == 0) {
    		   System.out.println(i + " ");
    	   }
    	   }
	}
}
