package inheritance.interfaces.fromjava8;

public class Java08Demo{
	public static void main(String[] args) {
		//cách1: tạo 1 lớp thực thi 
		//Demo --> even number condition
		
		//cách2: sử dụng anonymous class
		//Demo --> odd number condition
		
		//cách3:Sử dụng anonymous function- lamda expression
		//Demo --> even & odd
		
		//lamda là arrow function trong js
		//mục đích: tạo ra đối tượng cho biến kiểu functional interface
		//code: đoạn lamda override hàm trừu tượng bên trong
		//KDL functional interface của biến đó
		Condition c3 = (int a)->{
			return a%3==0;
		};
		Condition c4 = x -> x%4==0;
	}
}
