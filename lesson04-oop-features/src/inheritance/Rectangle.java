package inheritance;

public class Rectangle implements Shape{

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint.. " );
	}

	@Override
	public void calSuperficiality() {
		System.out.println("Rectangle --> claS.. ");
	}
	// private: dùng trong class
	// public
	// default --> nếu [abstract] class --> sử dụng trong package hiện tại
	//         --> nếu interface --> giống như public
	// protected
	// --> sử dụng trong package hiện tại
	// --> sử dụng khác package nến có là con của class hiện tại
	protected void clear () {
		System.out.println("Rectangle --> clear");
	}

}
