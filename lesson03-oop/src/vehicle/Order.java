package vehicle;

public class Order {
	private Customer customer;
	private Vehicle vehicle;
	
	public Order() {
		
	}

	

	public Order(Customer customer, Vehicle vehicle) {
		
		this.customer = customer;
		this.vehicle = vehicle;
		
	}

    

	


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	
	
	
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", vehicle=" + vehicle +  "]";
	}



	public double export() {
		double tax;
		if(vehicle.getVolume()<100) {
			tax= vehicle.getCost()*0.01;
			
		}
		else if(vehicle.getVolume()>=100 && vehicle.getVolume()<=200) {
			tax=vehicle.getCost()*0.03;
			
		}
		else tax=vehicle.getCost()*0.05;
		
		return tax;
	}
	

}
