package lesson03.ex03;

import java.util.Arrays;

public class CarOrder {
	private Customer customer;
	private Car[] car;
	
	public CarOrder(Customer customer, Car[] car) {
		this.customer = customer;
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarOrder [customer=" + customer + ", car=" + Arrays.toString(car) + "]";
	}
}
