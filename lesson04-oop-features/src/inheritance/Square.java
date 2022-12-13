package inheritance;

public class Square implements Shape {

	// kiểu con(class) kế thừa(implements) kiểu cha(interface)
	// -->'bắt buộc' phải Override các abstract method(hàm trừu tượng) từ kiểu cha

	// hàm trừu tượng: hàm không có body(hàm thực thi)

	@Override
	public void paint() {
		System.out.println("Square --> paint ...");
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Square --> calS ...");
	}

}
