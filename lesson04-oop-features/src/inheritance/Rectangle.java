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
	//A
	//private
	//public
	//... --> [abstract] class ---> using in current package
	//... --> interface ---> same as public
	//protected
	//---> using in current package
	//---> using in difference package if it's child of current class
 	
	 protected void clear() {
		System.out.println("rectangle --- > clear");
	}
}
