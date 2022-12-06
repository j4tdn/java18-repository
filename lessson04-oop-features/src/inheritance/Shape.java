package inheritance;
//khi hiểu yêu cầu có kiểu cha chỉ chứa những hàm

//không có phần thực thi

//--> cha là interface --> từ JAVA 1.0 đến JAVA 7.0

//--> từ JAVA 8 trở đi --> interface có thể chưa hàm trừu tượng 
//hoặc hàm bình thường( có thân hàm)
//--> default/static/private

public interface Shape {

	// parent method --> undefined implementation
	// --> method without implementation

	// abstract methods --> hàm trừu tượng

	void paint();

	void calSuperficility();

}
