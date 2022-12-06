package inheritance;


/**
 *  Khi hiểu yêu câu có kiểu cha chỉ chứa những
 *  hàm không có phần thực thi
 *  --> cha là interface
 *
 */
public class Rectangle implements Shape {

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint ...");
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle --> cals ...");
	}

}
