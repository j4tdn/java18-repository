package data.primitive;


// class(Ex01BasicDemo): KDL doi tuong ~ Integer ~ int
public class Ex01BasicDemo {
	// private: su dung trong class hien tai
	// public: su dung trong class hien tai va o ngoai class hien tai
	
	//TODO: Lesson03-oop
	//static:	thuoc pham vi cua class
	//			ta ca cac doi tuong duoc tao ra tu class nay
	//			se co chung mot gia tri cua bien/ thuoc tinh static
	// code:	de goi bien/ thuoc tinh static --> Classname.staticVaribleName;
	//										   --> neu trong class hien tai --> staticVarible
	
	
	//	nonstatic:	thuoc pham vi cua tung doi tuong
	//				moi doi tuong se luu tru/mang mot gia tri rieng
	//code:			de goi bien/ thuoc tinh non-static --> ObjectName.nonStaticVaribleName				
	
	// du lieu
	// bien toan cuc(thuoc tinh)
	// cu phap: [access modifier][]
	private static int age = 20;
	public static final double price = 20.6;
	private static final float avg = 20.6f;
	char letter = 'A';
	
	// chuc nang

	public static void main(String[] args) {
		//du lieu
		// bien cuc bo(thuoc tinh)
		//cu phap: 
		
		//BLOCK SCOPE {}
		
		int total =22;
		// vi sao thuoc tinh thi co the khai bao [private][static]
		// nhung bien cuc bo thi khong
		
		// bien cuc bo chi dung trong block code hien tai
		// goi truc tiep --> khong can lay class cham --> khong can static
		// khong duoc dung ben ngoai scope/method/class --> khong can access modifi
		
		Ex01BasicDemo.age = 30;
		
		double price = 99.99;
		

	}

}
