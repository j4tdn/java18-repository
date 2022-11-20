package exercise3;

import java.util.Arrays;

public class OrderVehicle {
	private CustomerBuyCar customer;
	private Vehicle[] vehicle;
	
	public OrderVehicle () {
		
	}

	public OrderVehicle(CustomerBuyCar customer, Vehicle[] vehicle) {
		super();
		this.customer = customer;
		this.vehicle = vehicle;
	}

	public CustomerBuyCar getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBuyCar customer) {
		this.customer = customer;
	}

	public Vehicle[] getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle[] vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "OrderVehicle [customer=" + customer + ", vehicle=" + Arrays.toString(vehicle) + "]";
	}


}
