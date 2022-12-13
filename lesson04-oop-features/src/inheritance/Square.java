package inheritance;

public class Square implements Shape {

	@Override
	public void paint() {
		System.out.println("Square--> paint ..");
		
	}

	@Override
	public void calSuperficiality() {
		System.out.println("square-->cals");
		
	}
//	kiểu con (class) kế thùa (implement) kiểu cha (interface)
//	--> bắt buộc phải override các abstract menthods(hàm trừu tượng) từ kiểu cha
	
}
