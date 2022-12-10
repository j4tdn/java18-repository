package inheritance;

public class Square implements Shape {
	
	// kiểu con(class) kế thừa(implements) kiểu cha(interface)
	// --> bắt buộc phải override các abstract method(hàm trừu tượng)
	
	// hàm trừu tượng: hàm không có body(phần thực thi)
	
	@Override
	public void paint() {
		System.out.println("Square --> paint ...");
	}
	@Override
	public void calSuperficiality() {
		System.out.println("Square --> Cals ...");
	}
}
