package inhertance;

/**
 * Khi hiểu yêu cầu có kiểu cha chỉ chứa hàm không có phần thực thi
 * --> cha là interface --> từ JAVA 1.0 đến JAVA 7.0
 * 
 * --> từ JAVA 8.0 trở đi --> interface cơ stheer chứa hàm trừu tượng 
 * hoặc hàm bth (có thân hàm thực thi)
 * default/static/private
 */
public interface Shape {
	//parent method --> underfinel implementation
	//--> method without implementtation
	
	//abstract method --> hàm trừu tượng
	void paint();
	
	void calSuperficiality();
	
	// ... --> interface --> same as public
}
