package inheritance;
/**
 * khi hiểu yêu cầu có kiểu cha chỉ chứa những
 * hàm không có phần thực thi 
 * --> cha là interface --> từ JAVA 1.0 đến JAVA 7.0
 * 
 * --> từ JAVA 8 trơ lên --> interface có thể chứa hàm hàm trừu tượng hoặc hàm bình thường(có thân hàm)
 * --> default/static/private
 */
public interface Shape {
	
	int a = 8; 
	
	// parent method --> underfined implementation
	// --> method without implementation
	
	// abstract methods --> hàm trừu tượng
	
	void paint();
	
	void calSuperficiality();
	
	// ... --> interface --> same as public
	// interface default --> public abstract
}
