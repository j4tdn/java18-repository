package inheritance;

/**
 * Khi hiểu yêu cầu cha chỉ chứa những hàm không có phần thực thi
 * --> cha là interface --> từ JAVA 1.0 đến JAVA 7.0
 * 
 * --> từ JAVA 8 trở đi --> interface có thể chứa hàm trừu tượng hoặc hàm bình thường (có thân hàm)
 * --> default/static/private
 */

public interface Shape {
	// parent method --> undefined implementation
	// --> method without implementation

	// abstract method
	void paint();

	void calSuperficialiity();

}