package bean;


import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private DeviceDetail[] devicedetails;
	private LocalDateTime time;

	public Order(Customer customer, DeviceDetail[] devicedetails, LocalDateTime time) {

		this.customer = customer;
		this.devicedetails = devicedetails;
		this.time = time;
	}

	public Order() {
		super();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DeviceDetail[] getDevicedetails() {
		return devicedetails;
	}

	public void setDevicedetails(DeviceDetail[] devicedetails) {
		this.devicedetails = devicedetails;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", devicedetails=" + Arrays.toString(devicedetails) + ", time=" + time
				+ "]";
	}

}
