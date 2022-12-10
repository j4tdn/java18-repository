package bean;

public class Manager extends People{
	private double amount;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int birthday, double salaryCoe, double amount) {
		super(name, birthday, salaryCoe);
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Manager [amount=" + amount + ", toString()=" + super.toString() + "]";
	}

}
