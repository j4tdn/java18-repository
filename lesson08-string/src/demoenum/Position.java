package demoenum;

public enum Position {
	ONSIDE("TREN"),
	OUTSIDE("NGOAI"),
	INSIDE("TRONG");
	
	private String value;
	private Position(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
