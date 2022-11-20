package exercise3;

import shopping.OrderUtils;

public class AppVehicle {
	public static void main(String[] args) {
		
		CustomerBuyCar c1 = new CustomerBuyCar("Nguyễn Thu Loan");
		CustomerBuyCar c2 = new CustomerBuyCar("Lê Minh Tính");
		CustomerBuyCar c3 = new CustomerBuyCar("Nguyễn Minh Triết");
		
		Vehicle v1 = new Vehicle("Futer neo", 100, 35000000);
		Vehicle v2 = new Vehicle("Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("Landscape", 1500, 100000000);
		
		OrderVehicle o1 = new OrderVehicle(c1, new Vehicle[] {v1});
		OrderVehicle o2 = new OrderVehicle(c2, new Vehicle[] {v2});
		OrderVehicle o3 = new OrderVehicle(c3, new Vehicle[] {v3});
		
		System.out.printf("%-20s%-20s%-20s%-20s%s\n","Tên chủ xe","Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		
		OrderUtilsVeh.export(o1);
		OrderUtilsVeh.export(o2);
		OrderUtilsVeh.export(o3);
	
	}
}
