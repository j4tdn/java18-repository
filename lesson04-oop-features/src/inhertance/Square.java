package inhertance;

public class Square implements Shape {
	//Kiểu con(class) kế thừa( interface)
		//-> 'bắt buộc' phải override các abstract methods(hàm trừu tượng)
		// từ kiểu cha
	
	//Hàm trừu tượng: hàm kh có body(phần thực thi)
	@Override
	public void paint() {
		System.out.println("Square --> paint");
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Square --> cal");
	}
	

}
