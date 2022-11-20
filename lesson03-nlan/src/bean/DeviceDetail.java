package bean;

public class DeviceDetail {
	private Device device;
	private int quantity;

	public DeviceDetail() {

	}

	public DeviceDetail(Device device, int quantity) {
		super();
		this.device = device;
		this.quantity = quantity;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "DeviceDetail [device=" + device + ", quantity=" + quantity + "]";
	}
	

}
