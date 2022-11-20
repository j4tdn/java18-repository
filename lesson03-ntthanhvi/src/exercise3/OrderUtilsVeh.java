package exercise3;

public class OrderUtilsVeh {
	
	private OrderUtilsVeh () {
		
	}
	
	public static double charge (OrderVehicle order) {
		double charge = 0;
		for (Vehicle vehicle: order.getVehicle()) {
			
			if(vehicle.getCapacity() < 100) {
				charge += vehicle.getCost()*0.01;
			} else if (vehicle.getCapacity() < 200) {
				charge += vehicle.getCost()*0.03;
			} else {
				charge += vehicle.getCost()*0.05;
			}
		}
		return charge;
	}
	public static void export (OrderVehicle order) {
		for (Vehicle vehicle: order.getVehicle()) {
			System.out.printf("%-20s%-20s%-20s%-20s%s\n", order.getCustomer().getName(),vehicle.getType(), vehicle.getCapacity(), vehicle.getCost(),OrderUtilsVeh.charge(order));
		} 
	}
}
