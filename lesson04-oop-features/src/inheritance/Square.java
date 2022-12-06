package inheritance;

public class Square implements Shape{
	
	/*
	 * Kiểu con ( class) kế thừa(implements)
	 * --> bắt buộc phải override các abstract methods(hàm trừu tượng) từ kiểu cha

	 */
	
	//hàm trừu tượng: hàm không có body( phần thực thi)
	
	@Override
	public void paint() {
		System.out.println("Square --> paint....");
	}
	
	@Override
	public void calSuperficiality() {
		System.out.println("Square --> calS....");
	}
	
}
