package bean;

public class Test {
	private String id;
	private double salary;
	private int it;
	private boolean stt;
	
	public Test() {

	}

	public Test(String id, double salary, int it, boolean stt) {
		this.id = id;
		this.salary = salary;
		this.it = it;
		this.stt = stt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getIt() {
		return it;
	}

	public void setIt(int it) {
		this.it = it;
	}

	public boolean isStt() {
		return stt;
	}

	public void setStt(boolean stt) {
		this.stt = stt;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", salary=" + salary + ", it=" + it + ", stt=" + stt + "]";
	}
	
	
}

