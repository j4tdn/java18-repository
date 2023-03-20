package demoenum;

public enum Position {
	
	ONSIDE("TREN"),
	OUTSIDE("TRONG"),
	INSIDE("NGOAI");
	
	private String value;
	
	private Position(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
