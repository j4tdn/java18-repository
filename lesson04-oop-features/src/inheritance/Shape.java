package inheritance;

/*
 * Khi hiểu yêu cầu có kiểu cha chỉ chứa những
 * hàm không có phần thực thi
 * --> cha là interface
 * và con kế thừa dùng từ implements (thay vì extends)
 */
public interface Shape {
	void paint ();
	void calSuperficiality();
}
