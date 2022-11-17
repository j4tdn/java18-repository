package vehicle.tax;

public class TaxPaying {
	Owner owner;
	Vehicle vehicle;
	
	public TaxPaying() {
	}

	public TaxPaying(Owner owner, Vehicle vehicle) {
		super();
		this.owner = owner;
		this.vehicle = vehicle;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "TaxDetail [owner=" + owner + ", vehicle=" + vehicle + "]";
	}
	 
	 public void export() {
		 // System.out.printf("%-15s%-15s%-15s%-15s%s\n","Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		 System.out.printf("%-20s%-25s%9s%18s%26s\n",owner.getName(), vehicle.getName(), 
				 vehicle.getCapacity(), vehicle.getPrice(), vehicle.getTaxToPay());
	 }
	
	
}
