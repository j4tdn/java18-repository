package demo;

public class sachgiakhoa extends sach {
	private int thue;

	
	public sachgiakhoa() {
	}


	public sachgiakhoa(String id, String name, double gia, int thue) {
		super(id, name, gia);
		this.thue = thue;
	}


	public int getThue() {
		return thue;
	}


	public void setThue(int thue) {
		this.thue = thue;
	}


	@Override
	public String toString() {
		return "sachgiakhoa [thue=" + thue + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
