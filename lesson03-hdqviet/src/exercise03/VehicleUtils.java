package exercise03;

public class VehicleUtils {
	
	private VehicleUtils() {
	}
	
	public static double vehicleFee(Vehicle vehicle) {
		double vehicleFee = 0;
		if (vehicle.getCapacity() < 100) {
			vehicleFee += vehicle.getCost() * 0.01;
		} else if (vehicle.getCapacity() < 200) {
			vehicleFee += vehicle.getCost() * 0.03;
		} else {
			vehicleFee += vehicle.getCost() * 0.03;
		}
		
		return vehicleFee;
	}
	
	public static void export (Vehicle vehicle) {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", vehicle.getVehicleOwnName(), vehicle.getType(), vehicle.getCapacity() ,vehicle.getCost(), VehicleUtils.vehicleFee(vehicle));
	}
}
