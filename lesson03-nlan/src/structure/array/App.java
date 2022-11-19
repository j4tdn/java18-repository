package structure.array;

import bean.Vehicle;

/**Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. Dựa vào thông tin trị
giá xe và dung tích xylanh, sở giao thông tính mức thuế phải đóng trước bạ khi mua xe như
sau:
- Dưới 100cc, 1% trị giá xe.
- Từ 100 đến 200cc, 3% trị giá xe.
- Trên 200cc, 5% trị giá xe.
Hãy thiết kế và cài đặt class Vehicle với các thuộc tính và phương thức phù hợp.
Xây dựng class chứa hàm main. Thực hiện các công việc sau đây:
1. Nhập thông tin và tạo Nđối tượng xe
2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
3. Thoát chương trình */

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyen Thu Loan", "Future Neo", 100, 35000000d);
		Vehicle v2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 250000000d);
		Vehicle v3 = new Vehicle("Nguyen Minh Triet", "Landscape", 1500, 1000000000d);
		
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
		System.out.println("==============================================================================================");
		show(v1);
		show(v2);
		show(v3);
		}
	
	public static double Tax(Vehicle v) {
		double tax;
		if (100 < v.getCapacity()) {
			tax = v.getCapacity()*1/100;
		}
		else if (v.getCapacity() <= 200) {
			tax = v.getCapacity()*3/100;
		}
		else {
			tax = v.getCapacity()*5/100;
		}
		return tax;
		
	}
	public static void show(Vehicle v) {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n",v.getOwnerName(), v.getModel(), v.getCapacity(), v.getPrice(), Tax(v));
	}

}



