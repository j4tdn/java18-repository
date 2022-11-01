package data.primitive;

public class Ex02DataStorage {

	public static void main(String[] args) {
		// VT = VP
		// thu tu thuc hien VP truoc, duoc gia tri
		// thi gan cho VT
		int a = 24;
		int b = 42;
		System.out.println("a1: " + a);
		System.out.println("b1: " + b);
		a = b;

		// = gan gia tri(stack) cua bien b cho bien a

		System.out.println("a2: " + a);
		System.out.println("b2: " + b);

		// can 1 chuc nang thay doi gia tri cua a
		// thanh 1 gia tri khac
		modify(a);
		System.out.println("a3: " + a);  //42

	}

	// ham
	
	//Trong 2 scopes {} khac nhau thi co the khai bien trung ten
	//Trong 1 {} thi khong thecho 2 bien trung ten
	// bien toan cuc co the trung ten voi bien cuc bo
	//Truyen tham so qua ham --> pass by value at stack
	private static void modify(int input) {
		input = 159;
		

	}

}
