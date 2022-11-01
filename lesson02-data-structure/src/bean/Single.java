package bean;

public class Single {
	public int value;
	
	public Single() {
}
	
	public Single ( int pValue) {
		this.value = pValue;
	}

	public String toString() {
		return "" + this.value;
	}
}