package inheritance;


/**
 * Khi hiểu yêu cầu có kiểu cha chỉ chứa những
 * hàm không có phần thực thi 
 * --> cha là interface --> Từ JAVA 1.0 đến JAVA 7.0
 * 
 * --> từ JAVA 8 trở đi --> interface có thể chứa hàm trừu tượng hoặc hàm bình thường(có thân hàm)
 * --> default/static/private
 */
public interface Shape {
	
	int a = 8;
	
	// parent method --> undefined implementation
	// --> method without implementation
	
	// abstract methods --> hàm trừu tượng
	void paint();
	
	void calSuperficiality();
	
	// ... --> interface --> same as public
	// interface default --> public abstract
	
}
