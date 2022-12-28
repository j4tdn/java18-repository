package bean;

public class NrsStas {
	private int number;
	private int count;

	public NrsStas() {
	}

	public NrsStas(int number, int count) {
		super();
		this.number = number;
		this.count = count;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void plusCount() {
		this.count++;
	}

	@Override
	public String toString() {
		return "number= " + number + ", count= " + count + "\n";
	}

}
