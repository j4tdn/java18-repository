package inheritance;

/*
 * Khi hiểu yêu cầu có kiểu cha chỉ chứa những
 * hàm không có phần thực thi 
 * --> cha là interface
 */
public interface Shape {
	// parent method --> underfined impementation
	// --> method without implementation
	
	// abstract methods --> hàm trừu tượng
	void paint();
	void calSuperficiality();

}
