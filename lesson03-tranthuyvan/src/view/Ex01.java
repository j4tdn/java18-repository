package view;

import java.math.BigDecimal;

import bean.Vehicle;

/**
 * Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. 
 * Dựa vào thông tin trị giá xe và dung tích xylanh, 
 * sở giao thông tính mức thuế phải đóng trước bạ khi mua xe như sau:
 * + Dưới 100cc, 1% trị giá xe.
 * + Từ 100 đến 200cc, 3% trị giá xe.
 * + Trên 200cc, 5% trị giá xe.
 * Hãy thiết kế và cài đặt class Vehicle với các thuộc tính và phương thức phù hợp.
 * Xây dựng class chứa hàm main. Thực hiện các công việc sau đây:
 * 1. Nhập thông tin và tạo N đối tượng xe
 * 2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
 * 3. Thoát chương trình.
 */

public class Ex01 {
	public static void main(String[] args) {
		// 1. Nhập thông tin và tạo N đối tượng xe
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000d);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000d);
		Vehicle v3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000d);
		Vehicle v4 = new Vehicle("Asanuma Shizuka", "Honda", 2000, 650000000d);
		Vehicle v5 = new Vehicle("John Carter", "Honda", 50, 17000000d);

		// 2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
		System.out.printf("%-25s%-25s%-25s%-25s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println(
				"================================================================================================"
				+ "===================");
		export(v1);
		export(v2);
		export(v3);
		export(v4);
		export(v5);

		// 3. Thoát chương trình.
		System.exit(0);

	}

	// Print a double value without scientific notation
	// new BigDecimal(value).toPlainString()
	public static void export(Vehicle v) {
		System.out.printf("%-25s%-25s%-25s%-25s%s\n", v.getOwnerName(), v.getBrandName(), v.getCapacity(),
				new BigDecimal(v.getPrice()).toPlainString(), new BigDecimal(v.payTax()).toPlainString());
	}

}
