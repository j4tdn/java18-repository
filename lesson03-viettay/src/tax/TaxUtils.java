package tax;

import bean.Vehicle;

public class TaxUtils {

	private TaxUtils() {

	}

	public static double findTax(Vehicle vehicle) {
		double tax = 1;
		int temp = Integer.parseInt(vehicle.getCapacity());
		if (temp < 100) {
			tax *= vehicle.getPrice() * 0.01;
		} else if (temp <= 200) {
			tax *= vehicle.getPrice() * 0.03;
		} else {
			tax *= vehicle.getPrice() * 0.05;
		}
		return tax;
	}

	public static void show(Vehicle vehicle) {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", vehicle.getNameCarOwner(), vehicle.getModel(),
				vehicle.getCapacity(), vehicle.getPrice(), vehicle.getTax());
	}

}
