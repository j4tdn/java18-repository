package AppCar;

public class UsingCar {
	private Car car;
	private Customer customer;

	public UsingCar() {
	}

	public UsingCar(Car car, Customer customer) {
		this.car = car;
		this.customer = customer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String toString() {
		return "UsingCar [car=" + car + ", customer=" + customer + "]";
	}

}
