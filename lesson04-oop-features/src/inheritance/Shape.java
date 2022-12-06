package inheritance;


/**
 * khi yêu cầu có kiểu cha chỉ chứa những hàm không có phần thực thi
 * --> cha là interface --> từ JAVA 1.0 đến JAVA 7.0
 * 
 * --> từ JAVA 8 trở đi --> interface có thể chứa hàm trừu tượng hoặc hàm bình thường(
 * có thân hàm)
 * --> defalt
 *
 */
public interface Shape {
	
	//abstract method --> hàm trừu tượng
	void paint();
	
	void calSuperficiality();
}
