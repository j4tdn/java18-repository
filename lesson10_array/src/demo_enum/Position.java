package demo_enum;

/**
 * Khi nào tạo ra Enum
 * --> Khi mình có tập hợp các giá trị là hằng số(không đổi)
 *     Và các giá trị này có liên quan với nhau
 * --> VD
 *     + Vị trí tương đổi của điểm so với đường tròn(trong, trên, ngoài)
 *     + Điểm tổng kết tín chỉ (A, B, C, D, F)
 *     + Trạng thái giao hàng(đã giao, đang giao, đang đóng gói)
 *     
 * Khái niệm Enum
 * --> KDL đối tượng tương tự class
 *   --> Class --> tạo ra nhiều đối tượng
 *   --> Enum  --> tạo ra nhiều đối tượng(được tạo ẩn)
 *             --> 1 đối tượng trong enum chính là 1 biến, giá trị của enum, kiểu enum
 *             --> private constructor --> số lượng phần tử, giá trị trong enum là hằng số
 */
public enum Position {
	// private static final String ONSIDE = "TREN"; 
	// private static final String INSIDE = "TRONG"; 
	// private static final String OUTSIDE = "NGOAI";
	ONSIDE("TREN"), // public static Position ONSIDE = new Position("TREN");
	INSIDE("TRONG"),
	OUTSIDE("NGOAI");
	
	private String value;
	
	Position(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
