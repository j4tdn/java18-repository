package inheritance;

/**
 * Khi hiểu yêu cầu có kiểu cha chỉ chứa những
 * hàm không có phần thực thi
 *
 * --> hàm cha là interface ==> Từ JAVA 1.0 đến 7.0
 * 
 * --> từ JAVA 8.0 trở đi ==> interface có thể chứa hàm trừu tượng hoặc hàm bthg
 * --> default/static/private
 *
 */
public interface Shape {
	// parent method --> undefined implementation
	// --> method without implementation
	
	// abstract methods --> hàm trừu tượng
	void paint();
	
	void calSuperficiality();
}
