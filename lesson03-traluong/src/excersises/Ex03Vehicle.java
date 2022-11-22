package excersises;

import bean.Vehicle;

public class Ex03Vehicle {
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Saori Hara", "Honda Wave Alpha", 98, 10000000);	
		Vehicle v2 = new Vehicle("Eimi Fukada", "Honda WinnerX", 130, 50000000);	
		Vehicle v3 = new Vehicle("Emiri Suzuhara", "Vinfast Luxury", 1500, 1000000000);
		Vehicle v4 = new Vehicle("Yua Mikami", "Ford Ranger", 3000, 250000000);
		System.out.printf("%-20s", "Tên chủ xe");
		System.out.printf("%-20s", "Loại xe");
		System.out.printf("%8s", "Dung tích");
		System.out.printf("%15s", "Trị giá");
		System.out.printf("%15s", "Thuế phải nộp");
		
		System.out.println();
		System.out.println("==============================================================================");
		print(v1);
		print(v2);
		print(v3);
		print(v4);
	}
	public static double getTaxes(Vehicle vehicle ) {
		double taxes = 0;
		
		if (vehicle.getCapacity() < 100) {
			taxes = vehicle.getPrice()/100*1;
		}
		else if (vehicle.getCapacity() > 100 && vehicle.getCapacity() < 200) {
			taxes = vehicle.getPrice()/100*3;
		}
		else {
			taxes = vehicle.getPrice()/100*5;
		}
		
		return taxes;
	}
	public static void print(Vehicle vehicle) {
		System.out.printf("%-20s", vehicle.getOwnerName());
		System.out.printf("%-20s", vehicle.getType());
		System.out.printf("%8d", vehicle.getCapacity());
		System.out.printf("%15.2f", vehicle.getPrice());
		System.out.printf("%15.2f", getTaxes(vehicle));
		System.out.printf("\n");
		
	}
	
}
