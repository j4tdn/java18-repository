package bean;

public class Single {
	public int value;

	public Single(int value) {
		super();
		this.value = value;
	}
	
	public int change(int value) {
		return this.value=value;
	}
	
	@Override
		public String toString() {
			return ""+this.value;
	}
	
}
