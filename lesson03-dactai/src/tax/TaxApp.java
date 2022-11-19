package tax;

import bean.Owner;
import bean.Vehicle;

public class TaxApp {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("Future Neo", 100, 35000000);
		Vehicle v2 = new Vehicle("Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("Landscape", 1500, 1000000000);
		Vehicle v4 = new Vehicle("Super Cub", 50, 15000000);

		Owner o1 = new Owner("Nguyễn Thu Loan", v1);
		Owner o2 = new Owner("Lê Minh Tính", v2);
		Owner o3 = new Owner("Nguyễn Minh Triết", v3);
		Owner o4 = new Owner("Huỳnh Lê Đắc Tài", v4);

		Owner[] owners = new Owner[] { o1, o2, o3, o4 };

		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println(
				"=============================================================================================");
		for (Owner owner : owners) {
			TaxUtils.printInfo(owner);
		}

	}

}
