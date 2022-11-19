package tax;

import bean.Owner;
import bean.Vehicle;

public class TaxUtils {
	
	private TaxUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static double taxExport(Vehicle vehicle) {
		
		double tax;
		int volume = vehicle.getVolume();
		double cost = vehicle.getCost();
		if(volume < 100) {
			tax = cost * 0.01;
		} else if (volume > 200) {
			tax = cost * 0.05;
		} else tax = cost * 0.03;

		return tax;
	}
	
	
	public static void printInfo(Owner owner) {
		Vehicle vehicle = owner.getVehicle();
		System.out.printf("%-20s%-20s%-20s%-20s%s\n",owner.getName(), vehicle.getName(), vehicle.getVolume()
													,vehicle.getCost(),taxExport(vehicle));
	}

}
