package tax;

/**
 *  Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. Dựa vào thông tin trị
	giá xe và dung tích xylanh, sở giao thông tính mức thuế phải đóng trước bạ khi mua xe như
	sau:
	- Dưới 100cc, 1% trị giá xe.
	- Từ 100 đến 200cc, 3% trị giá xe.
	- Trên 200cc, 5% trị giá xe.
	Hãy thiết kế và cài đặt class Vehicle với các thuộc tính và phương thức phù hợp.
	Xây dựng class chứa hàm main. Thực hiện các công việc sau đây:
	1. Nhập thông tin và tạo Nđối tượng xe
	2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
	3. Thoát chương trình.
 */
import bean.Vehicle;

public class TaxApp {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("Tây", "Sirius", "150", 25000000, null);
		Vehicle v2 = new Vehicle("Kiệt", "Cup", "50", 15000000, null);
		Vehicle v3 = new Vehicle("Tân", "Winner", "250", 40000000, null);

		v1.setTax(TaxUtils.findTax(v1));
		v2.setTax(TaxUtils.findTax(v2));
		v3.setTax(TaxUtils.findTax(v3));

		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println(
				"=============================================================================================");

		TaxUtils.show(v1);
		TaxUtils.show(v2);
		TaxUtils.show(v3);
	}

}
