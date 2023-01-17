package inheritance;

public class Square implements Shape {
	/*
	 * Kiểu con kế thưuaf (implement) kiểu cha (interface)
	 * Bắt buộc phải overide các abstract methods từ kiểu cha
	 * 
	 * hàm trừu tượng(abstract) : hàm kh có body
	 */
	@Override
	public void paint() {
		System.out.println("Square ==> paint");
		
	}

	@Override
	public void calSuperFicaiality() {
		System.out.println("Square ==> Shape");
		
	}
	
}
